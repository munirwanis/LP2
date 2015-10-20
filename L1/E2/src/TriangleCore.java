/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Munir Wanis
 */
public class TriangleCore {
    
    /**
     * Funcao que calcula a area do triangulo
     * @param a
     * @param b
     * @param c
     * @return response
     */
    public static double triangleArea(double a, double b, double c) {
        double semiPerimeter = TriangleCore.semiperimeter(a, b, c);
        
        double response = Math.sqrt(semiPerimeter * (semiPerimeter - a) * 
                (semiPerimeter - b) * (semiPerimeter - c));
        
        return response;
    }
    
    
    /**
     * Funcao que calcula o semi-perimetro do triangulo
     * @param a
     * @param b
     * @param c
     * @return semiPerimeter
     */
    private static double semiperimeter(double a, double b, double c) {
        double semiPerimeter = (a + b + c)/2;
        
        return semiPerimeter;
    }
}
