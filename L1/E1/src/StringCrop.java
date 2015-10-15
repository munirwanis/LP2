/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author munir
 */
public class StringCrop implements IStringCrop {

    /**
     *
     * @param args
     * @return String result
     * @throws IllegalArgumentException
     * 
     * Method that receive args and crop it.
     */
    @Override
    public String crops(String[] args) throws IllegalArgumentException {
        
        // If the length of arguments is less then 2, the exception is thrown
        if (args.length < 2) {
            throw new IllegalArgumentException("Arguments number must be bigger then 2");
        }

        String result = args[0];

        /**
         *  For each pair of argument it's verified if the char is equal 
         * the end of the other argument, if is equal it's saved to be 
         * removed. After that the string is concatenated with the second
         * argument.
         */
        for (int i = 1; i < args.length; i++) {
            String arg = args[i];
            String partToReplace = "";

            for (int j = 1; j < arg.length(); j++) {
                String part = arg.substring(0, j);

                if (result.contains(part)) {
                    partToReplace = part;
                }
            }

            result += arg.replaceFirst(partToReplace, "");
        }

        return result;
    }

}
