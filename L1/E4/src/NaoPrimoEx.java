/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Munir Wanis
 */
public class NaoPrimoEx extends Exception {
    private int num;
    
    public NaoPrimoEx(int num) {
        this.num = num;
    }
    
    @Override
    public String getMessage() {
        return String.format("O numero %d nao e' primo", this.num);
    }
}
