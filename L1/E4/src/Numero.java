/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Munir Wanis
 */
abstract class Numero {

    private int Num;

    public Numero(int Num) {
        this.Num = Num;
    }

    abstract int Soma(int Num);

    abstract int Div(int Num);

    abstract int Sub(int Num);

    abstract int Mult(int Num);

    public int getNum() {
        return Num;
    }

    public void setNum(int Num) {
        this.Num = Num;
    }
}
