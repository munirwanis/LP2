
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Munir Wanis
 */
public class Ex3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try {
            MinhaListaOrdenavel minhaListaOrdenavel = new MinhaListaOrdenavel();
           
            menu(minhaListaOrdenavel);

        } catch (Exception e) {
            System.out.printf("%s: %s\n", e.getCause(), e.getMessage());
        }
    }

    private static void menu(MinhaListaOrdenavel minhaListaOrdenavel) {
        System.out.println(
                "1.Imprimir Lista\n"
              + "2.Sair\n"
        );
        
        BufferedReader bufferedReader = new BufferedReader(
                    new InputStreamReader(System.in));        
        try {
            
            int inputValue = bufferedReader.read() - 48;
            
            switch (inputValue) {
                case 1:
                    inputValue = bufferedReader.read() - 48;
                    minhaListaOrdenavel.menu();
                case 2:
                    break;
                default:
                    System.out.println("Opcao nao encontradan.\n");
                    menu(minhaListaOrdenavel);
            }
        } catch (IOException e) {
            System.out.printf("%s: %s\n", e.getCause(), e.getMessage());
        }
    }
}
