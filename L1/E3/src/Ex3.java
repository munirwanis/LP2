
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
            MinhaListaOrdenavel.add(new Produto(1, "Violao", 750.0, 6, 21));
            MinhaListaOrdenavel.add(new Produto(2, "Flauta", 492.80, 5, 12, 10));
            MinhaListaOrdenavel.add(new Produto(3, "Baixo", 1023.99, 5, 8, 15));
            MinhaListaOrdenavel.add(new Produto(4, "Bateria", 2499.9, 3, 4));
            MinhaListaOrdenavel.add(new Produto(5, "Sax", 3999.99, 2, 4, 20));
            MinhaListaOrdenavel.add(new Produto(6, "Guitarra", 2169.90, 1, 14, 25));
            MinhaListaOrdenavel.add(new Produto(7, "Gaita", 69.90, 78, 15));
            MinhaListaOrdenavel.add(new Produto(8, "Teclado", 1570, 3, 8, 5));
            MinhaListaOrdenavel.add(new Produto(9, "Violino", 369.90, 6, 11, 8));
            MinhaListaOrdenavel.add(new Produto(10, "Ukulele", 680, 8, 6));
           
            menu();

        } catch (Exception e) {
            System.out.printf("%s: %s\n", e.getCause(), e.getMessage());
        }
    }

    private static void menu() {
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
                    MinhaListaOrdenavel.menu();
                    break;
                case 2:
                    break;
                default:
                    System.out.println("Opcao nao encontrada.\n");
                    menu();
                    break;
            }
        } catch (IOException e) {
            System.out.printf("%s: %s\n", e.getCause(), e.getMessage());
        }
    }
}
