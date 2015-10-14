/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author munir
 */
public class EmptyException implements IException{

    private String key;
    
    EmptyException(String key) {
        this.key = key;
    }
    
    @Override
    public String getKey(String key) {
        return key;
    }
    
    public String toString() {
        return String.format("%s", key);
    }
}
