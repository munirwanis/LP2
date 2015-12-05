/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lp2g17.biblioteca;

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
}
