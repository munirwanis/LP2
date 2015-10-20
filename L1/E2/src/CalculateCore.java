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
    
    /**
     * Chama calculo de area do circulo
     * @param r
     * @return 
     */
    private static double calcula(double r) {
        return CircleCore.circleArea(r);
    }
    
    /**
     * Chama calculo de area do retangulo
     * @param b
     * @param a
     * @return 
     */
    private static double calcula(double b, double a) {
        return SquareCore.squareArea(b, a);
    }
    
    /**
     * Chama calculo de area do triangulo
     * @param a
     * @param b
     * @param c
     * @return 
     */
    private static double calcula(double a, double b, double c) {
        return TriangleCore.triangleArea(a, b, c);
    }
    
    /**
     * Converete para String a mensagem de saida
     * @param input
     * @param calculateEnum
     * @return 
     */
    private static String toString(double input, CalculateEnum calculateEnum) {
        return String.format("A area do %s e': %f unidades de area",
                calculateEnum, input);
    }
    
    /**
     * Funcao principal da classe com tratamento de erros
     * @param args
     * @return response
     * @throws IllegalArgumentException 
     * @throws java.lang.Exception 
     * @throws NumberFormatException
     */
    public static String calcula(String args[]) throws IllegalArgumentException, NumberFormatException, Exception {
        
        /**
         * Se for menor que 1, excecao de nao ter argumentos suficientes
         */
        if (args.length < 1) {
            throw new IllegalArgumentException("Numero de argumentos insuficiente");
        }
        
        /**
         *  Se for maior do que 3, excecao de argumentos demais
         */
        if (args.length > 3) {
            throw new IllegalArgumentException("Numero de argumentos excessivo");
        }
        
        try {
            
            /**
             * Tendo uma argumento calcula area do circulo
             */
            if (args.length == 1) {
                double radius = Double.parseDouble(args[0]);
                
                return CalculateCore.toString(CalculateCore.calcula(radius), 
                        CalculateEnum.circulo);
            }
            
            /**
             * Tendo 2 argumentos calcula a area do triangulo
             */
            else if (args.length == 2) {
                double b = Double.parseDouble(args[0]);
                double a = Double.parseDouble(args[1]);
                
                return CalculateCore.toString(CalculateCore.calcula(b, a), 
                        CalculateEnum.retangulo);
            }
            /**
             * O que sobra, 3 argumentos, calcula a area do triangulo
             */
            else {
                double a = Double.parseDouble(args[0]);
                double b = Double.parseDouble(args[1]);
                double c = Double.parseDouble(args[2]);
                
                return String.format(CalculateCore.toString(CalculateCore.calcula(a, b, c), 
                        CalculateEnum.triangulo) + "\n" + 
                        TriangleCore.triangleType(a, b, c));
            }
        }
        
        /**
         * Se algum parse para double nao funcionar, estoura erro aqui
         */
        catch (NumberFormatException e) {
            throw new NumberFormatException(String.format("%s: %s", e.getClass(), e.getMessage()));
        }
        /**
         * Demais excecoes caem aqui
         */
        catch (Exception e) {
            throw new Exception(String.format("%s: %s", e.getClass(), e.getMessage()));
        }
    }
}
