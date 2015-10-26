
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Munir Wanis
 */
public class MinhaListaOrdenavel {

    public static ArrayList<Produto> productList = new ArrayList<>();

    private static Comparator<Produto> ascendingNameComparator = new Comparator<Produto>() {

        @Override
        public int compare(Produto s1, Produto s2) {
            String StudentName1 = s1.getNome().toUpperCase();
            String StudentName2 = s2.getNome().toUpperCase();

            //ascending order
            return StudentName1.compareTo(StudentName2);
        }
    };

    private static Comparator<Produto> descendingNameComparator = new Comparator<Produto>() {

        @Override
        public int compare(Produto s1, Produto s2) {
            String StudentName1 = s1.getNome().toUpperCase();
            String StudentName2 = s2.getNome().toUpperCase();

            //descending order
            return StudentName2.compareTo(StudentName1);
        }
    };

    private static Comparator<Produto> minorPriceComparator = new Comparator<Produto>() {

        @Override
        public int compare(Produto product1, Produto product2) {
            double ProductPrice1 = product1.getPreco();
            double ProductPrice2 = product2.getPreco();

            //ascending order
            return (int) Math.round(ProductPrice1 - ProductPrice2);
        }
    };

    private static Comparator<Produto> majorPriceComparator = new Comparator<Produto>() {

        @Override
        public int compare(Produto product1, Produto product2) {
            double ProductPrice1 = product1.getPreco();
            double ProductPrice2 = product2.getPreco();

            //descending order
            return (int) Math.round(ProductPrice2 - ProductPrice1);
        }
    };

    private static Comparator<Produto> bestSellingComparator = new Comparator<Produto>() {

        @Override
        public int compare(Produto product1, Produto product2) {
            long SoldProduct1 = product1.getVendidos();
            long SoldProduct2 = product2.getVendidos();

            //descending order
            return (int) (SoldProduct2 - SoldProduct1);
        }
    };
    
    public static boolean add(Produto product) {
        return productList.add(product);
    }

    public static void menu() {
        System.out.println(
                  "Escolha seu modo de ordenacao\n"
                + "1.Alfabetica (A-Z) - nome do produto\n"
                + "2.Alfabetica (Z-A) - nome do produto\n"
                + "3.Menor preco - crescente\n"
                + "4.Maior preco - decrescente\n"
                + "5.Mais vendidos - decrescente pelo mais vendido\n"
        );

        BufferedReader bufferedReader = new BufferedReader(
                new InputStreamReader(System.in));

        try {
            int inputValue = bufferedReader.read() - 48;

            switch (inputValue) {
                case 1:
                    Collections.sort(productList, ascendingNameComparator);
                    printProducts();
                    break;
                case 2:
                    Collections.sort(productList, descendingNameComparator);
                    printProducts();
                    break;
                case 3:
                    Collections.sort(productList, minorPriceComparator);
                    printProducts();
                    break;
                case 4:
                    Collections.sort(productList, majorPriceComparator);
                    printProducts();
                    break;
                case 5:
                    Collections.sort(productList, bestSellingComparator);
                    printProducts();
                    break;
                default:
                    System.out.println("Opcao nao encontrada.");
                    menu();
            }
        } catch (IOException e) {
            System.out.printf("%s: %s\n", e.getCause(), e.getMessage());
        }
    }

    /**
     * Prints the list
     */
    private static void printProducts() {
        for (Produto item : productList) {
            System.out.println(item.toString());
        }
    }
}
