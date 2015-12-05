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
public class EmprestadoPara {
    private GregorianCalendar dataEmprestimo;
    private GregorianCalendar dataDevolucao;
    private int codigoUsuario;

    public EmprestadoPara(GregorianCalendar dataEmprestimo, GregorianCalendar dataDevolucao, int codigoUsuario) {
        this.dataEmprestimo = dataEmprestimo;
        this.dataDevolucao = dataDevolucao;
        this.codigoUsuario = codigoUsuario;
    }

    public GregorianCalendar getDataEmprestimo() {
        return dataEmprestimo;
    }

    public GregorianCalendar getDataDevolucao() {
        return dataDevolucao;
    }

    public int getCodigoUsuario() {
        return codigoUsuario;
    }
    
    
}
