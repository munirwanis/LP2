/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author munir
 */
public class NullException extends Exception {
    private final String key;
    public NullException(String key) {
        this.key = key;
    }
    
    public String getKey() {
        return key;
    }
    
    public String toString() {
        return String.format("%s is null.", key);
    }
}
