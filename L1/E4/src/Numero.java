/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Munir Wanis
 */
public class Numero {

    private int Num;

    public Numero(int Num) {
        this.Num = Num;
    }

    public int soma(int Num) throws NaoPrimoEx {
        return this.Num + Num;
    }

    public int div(int Num) throws NaoPrimoEx {
        return this.Num / Num;
    }

    public int sub(int Num) throws NaoPrimoEx {
        return this.Num - Num;
    }

    public int mult(int Num) throws NaoPrimoEx {
        return this.Num * Num;
    }

    public int getNum() {
        return Num;
    }

    public void setNum(int Num) {
        this.Num = Num;
    }

    @Override
    public String toString() {
        return String.valueOf(this.Num);
    }
}
