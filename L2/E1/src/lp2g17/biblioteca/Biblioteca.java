/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lp2g17.biblioteca;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.ZonedDateTime;
import java.util.GregorianCalendar;
import java.util.HashMap;

/**
 *
 * @author munir
 */
public class Biblioteca {

    HashMap usuarios;
    HashMap livros;

    public Biblioteca(HashMap usuarios, HashMap livros) {
        this.usuarios = usuarios;
        this.livros = livros;
    }

    public void cadastraUsuario(Usuario usuario) {
        this.usuarios.put(usuario.getCodigoUsuario(), usuario);
    }

    public void cadastraLivro(Livro livro) {
        this.livros.put(livro.getCodigoLivro(), livro);
    }
    
    public void salvaArquivo(HashMap hashMap, String nomeArquivo) throws IOException {
        File file = new File(nomeArquivo);
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file))) {
            bufferedWriter.write(hashMap.toString());
            bufferedWriter.close();
        }
    }
    
    public void leArquivo(String nomeArquivo) throws FileNotFoundException, IOException {
        String line;
        FileReader fileReader = new FileReader(nomeArquivo);
        try (BufferedReader bufferedReader = new BufferedReader(fileReader)) {
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
            bufferedReader.close();
        }
    }
    
    public void emprestaLivro(Usuario usuario, Livro livro) throws CopiaNaoDisponivelEx {
        livro.empresta();
        usuario.adLivroHist(GregorianCalendar.from(ZonedDateTime.now()), null, livro.getCodigoLivro());
    }
    
    public void devolveLivro(Usuario usuario, Livro livro) throws NenhumaCopiaEmprestadaEx {
        livro.devolve();
        usuario.adLivroHist(null, GregorianCalendar.from(ZonedDateTime.now()), livro.getCodigoLivro());
    }
}
