/**
 *
 * @author Munir Wanis
 */
public class Ex1 {

    /**
     * Programa principal
     * @param args 
     */
    public static void main(String[] args) {          
       
        try
        {
            String result = Ex1.crops(args);
            System.out.printf("%s", result);
        }
        catch(IllegalArgumentException ex)
        {
            System.out.printf("IllegalArgumentException: %s", ex.getMessage());
        }
        catch(Exception ex)
        {
            System.out.printf("%s: %s", ex.getClass(), ex.getMessage());
        }
    }
    
    /**
     * 
     * @param args 
     * @return 
     * @throws IllegalArgumentException 
     */
    public static String crops(String[] args) throws IllegalArgumentException
    {       
        if(args.length < 2)
        {
            throw new IllegalArgumentException("Arguments number must be bigger then 2");
        }
        
        String result = args[0];
        
        for(int i=1 ; i<args.length ; i++)
        {
            String arg = args[i];
            String partToReplace = "";
                        
            for(int j=1 ; j<arg.length() ; j++)
            {
                String part = arg.substring(0, j);
                
                if(result.contains(part))
                {
                    partToReplace = part;
                }
            }            
            
            result +=  arg.replaceFirst(partToReplace, "");
        }
        
        return result;
    }
}
