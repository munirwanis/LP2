/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author munir
 */
public class DivByZeroException extends ArithmeticException {
    DivByZeroException() {
        super("Zero como denominador.");
    }
}
