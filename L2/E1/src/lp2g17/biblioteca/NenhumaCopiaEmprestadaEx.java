package lp2g17.biblioteca;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author munir
 */
public class NenhumaCopiaEmprestadaEx extends Exception {

    private String message;
    
    public NenhumaCopiaEmprestadaEx() {
    }

    public NenhumaCopiaEmprestadaEx(String message) {
        this.message = message;
    }
    
    @Override
    public String getMessage() {
        if (this.message.isEmpty() == false) {
            return this.message;
        } else {
            return "Nenhuma copia foi emprestada.";
        }
    }
}
