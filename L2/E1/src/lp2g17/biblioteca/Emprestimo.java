/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lp2g17.biblioteca;

import java.util.GregorianCalendar;

/**
 *
 * @author munir
 */
public class Emprestimo {
    private GregorianCalendar dataEmprestimo;
    private GregorianCalendar dataDevolucao;
    private int codigoLivro;

    public GregorianCalendar getDataEmprestimo() {
        return dataEmprestimo;
    }

    public void setDataEmprestimo(GregorianCalendar dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }

    public GregorianCalendar getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(GregorianCalendar dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    public int getCodigoLivro() {
        return codigoLivro;
    }

    public void setCodigoLivro(int codigoLivro) {
        this.codigoLivro = codigoLivro;
    }
}
