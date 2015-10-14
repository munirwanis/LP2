
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author munir
 */
public class Calculator implements ICalculator {

    @Override
    public int Soma(String firstVariable, String secondVariable) {
        try {
            if (firstVariable == null) {
                System.out.println(NullException(firstVariable).toString());
            }
            else if (secondVariable == null) {
                System.out.println(NullException(secondVariable).toString());
            } 
            else {
                int firstVar = Integer.parseInt(firstVariable);
                int secondVar = Integer.parseInt(secondVariable);
            }
        } catch (Exception e) {
            
        }
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double Div(String firstVariable, String secondVariable) throws DivByZeroException {
        try {
            double firstVar = Double.parseDouble(firstVariable);
            double secondVar = Double.parseDouble(secondVariable);
            
            if (secondVar == 0) {
                throw new DivByZeroException();
            }
        } catch (Exception e) {
            
        }
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private Object NullException(String firstVariable) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}