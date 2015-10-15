
/**
 *
 * @author Munir Wanis
 */
public class Ex1 {

    /**
     * Programa principal
     *
     * @param args
     */
    public static void main(String[] args) {

        try {
            IStringCrop stringCrop = new StringCrop();
            String result = stringCrop.crops(args);
            System.out.printf("%s", result);
        } catch (IllegalArgumentException ex) {
            System.out.printf("IllegalArgumentException: %s", ex.getMessage());
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.printf("%s: %s", ex.getClass(), ex.getMessage());
        } catch (Exception ex) {
            System.out.printf("%s: %s", ex.getClass(), ex.getMessage());
        }
    }
}
