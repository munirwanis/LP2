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
public class Pessoa {
    private String nome;
    private GregorianCalendar dataNasc;

    public Pessoa(String nome, GregorianCalendar dataNasc) {
        this.nome = nome;
        this.dataNasc = dataNasc;
    }    
    
    public String getNome() {
        return nome;
    }

    public GregorianCalendar getDataNasc() {
        return dataNasc;
    }
    
    
}
