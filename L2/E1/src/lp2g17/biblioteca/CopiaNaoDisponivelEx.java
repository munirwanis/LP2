/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lp2g17.biblioteca;

/**
 *
 * @author munir
 */
public class CopiaNaoDisponivelEx extends Exception {

    private String message;

    public CopiaNaoDisponivelEx() {
    }
        
    public CopiaNaoDisponivelEx(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        if (this.message.isEmpty() == false) {
            return this.message;
        } else {
            return "A copia nao esta disponivel!";
        }
    }
}
