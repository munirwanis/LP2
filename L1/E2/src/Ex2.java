/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Munir Wanis
 */
public class Ex2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try {
            System.out.println(CalculateCore.calcula(args));
        } catch (Exception e) {
            System.out.printf("%s: %s\n", e.getClass(), e.getMessage());
        }
    }
    
}
