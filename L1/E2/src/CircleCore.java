/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Munir Wanis
 */
public class CircleCore {

    /**
     * Funcao que calcula a area do circulo
     * @param radius
     * @return response
     */
    public static double circleArea(double radius) {
        double response = Math.PI * Math.pow(radius, 2);
        
        return response;
    }
}
