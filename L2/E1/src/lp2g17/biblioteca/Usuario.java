/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lp2g17.biblioteca;

import java.util.ArrayList;
import java.util.GregorianCalendar;

/**
 *
 * @author munir
 */
public class Usuario extends Pessoa {
    private String endereco;
    private int codigoUsuario;    
    private ArrayList<Emprestimo> emprestimoList;

    public Usuario(String endereco, int codigoUsuario, String nome, GregorianCalendar dataNasc) {
        super(nome, dataNasc);
        this.endereco = endereco;
        this.codigoUsuario = codigoUsuario;
        this.emprestimoList = new ArrayList<Emprestimo>();
    }
    
    public void adLivroHist(GregorianCalendar dataLocacao, GregorianCalendar dataDevolucao, int codigoLivro) {
        Emprestimo emprestimo = new Emprestimo();
        emprestimo.setCodigoLivro(codigoLivro);
        emprestimo.setDataDevolucao(dataDevolucao);
        emprestimo.setDataEmprestimo(dataDevolucao);
        emprestimoList.add(emprestimo);
    }

    public String getEndereco() {
        return endereco;
    }

    public int getCodigoUsuario() {
        return codigoUsuario;
    }
    
    public ArrayList<Emprestimo> getEmprestimoList() {
        return emprestimoList;
    }
    
}
