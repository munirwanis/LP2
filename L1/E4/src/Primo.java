/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Munir Wanis
 */
public class Primo extends Numero {

    private int NumPrimo;

    public Primo(int num) {
        super(num);
    }

    @Override
    public int soma(int Num) throws NaoPrimoEx {
        this.setNumPrimo(super.soma(Num));

        if (!this.isPrimo()) {
            throw new NaoPrimoEx(this.getNumPrimo());
        }

        return this.getNumPrimo();
    }

    @Override
    public int div(int Num) throws NaoPrimoEx {
        this.setNumPrimo(super.div(Num));

        if (!this.isPrimo()) {
            throw new NaoPrimoEx(this.getNumPrimo());
        }

        return this.getNumPrimo();
    }

    @Override
    public int sub(int Num) throws NaoPrimoEx {
        this.setNumPrimo(super.sub(Num));

        if (!this.isPrimo()) {
            throw new NaoPrimoEx(this.getNumPrimo());
        }

        return this.getNumPrimo();
    }

    @Override
    public int mult(int Num) throws NaoPrimoEx {
        this.setNumPrimo(super.mult(Num));

        if (!this.isPrimo()) {
            throw new NaoPrimoEx(this.getNumPrimo());
        }

        return this.getNumPrimo();
    }

    public int getNumPrimo() {
        return NumPrimo;
    }

    public void setNumPrimo(int NumPrimo) {
        this.NumPrimo = NumPrimo;
    }

    private boolean isPrimo() {

        int numToValidate = (int) Integer.toUnsignedLong(this.getNumPrimo());

        if (numToValidate == 0 || numToValidate == 1) {
            return false;
        }

        if (numToValidate == 2) {
            return true;
        }

        for (int i = 2; i < this.getNumPrimo(); i++) {
            if (this.getNumPrimo() % i == 0) {
                return false;
            }
        }

        return true;
    }
}
