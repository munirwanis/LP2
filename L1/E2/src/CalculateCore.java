/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Munir Wanis
 */
public class CalculateCore {
    private static double calcula(double r) {
        return CircleCore.circleArea(r);
    }
    
    private static double calcula(double b, double a) {
        return SquareCore.squareArea(b, a);
    }
    
    private static double calcula(double a, double b, double c) {
        return TriangleCore.triangleArea(a, b, c);
    }
    
    private static String toString(double input, CalculateEnum calculateEnum) {
        return String.format("A area do %s e': %f unidades de area",
                calculateEnum, input);
    }
    
    public static String calcula(String args[]) throws IllegalArgumentException {
        
        if (args.length < 1) {
            throw new IllegalArgumentException("Numero de argumentos insuficiente");
        }
        
        if (args.length > 3) {
            throw new IllegalArgumentException("Numero de argumentos excessivo");
        }
        
        try {
            if (args.length == 1) {
                double radius = Double.parseDouble(args[0]);
                
                return CalculateCore.toString(CalculateCore.calcula(radius), 
                        CalculateEnum.circulo);
            }
            else if (args.length == 2) {
                double b = Double.parseDouble(args[0]);
                double a = Double.parseDouble(args[1]);
                
                return CalculateCore.toString(CalculateCore.calcula(b, a), 
                        CalculateEnum.retangulo);
            }
            else if (args.length == 3) {
                double a = Double.parseDouble(args[0]);
                double b = Double.parseDouble(args[1]);
                double c = Double.parseDouble(args[2]);
                
                return CalculateCore.toString(CalculateCore.calcula(a, b, c), 
                        CalculateEnum.triangulo);
            }
        } catch (Exception e) {
        }
        
        return "";
    }
}
