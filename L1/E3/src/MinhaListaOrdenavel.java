
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author munir
 */
public class MinhaListaOrdenavel {
    
    ArrayList<Produto> productList = new ArrayList<>();
    
    public static Comparator<Produto> ascendingNameComparator = new Comparator<Produto>() {

        @Override
	public int compare(Produto s1, Produto s2) {
	   String StudentName1 = s1.getNome().toUpperCase();
	   String StudentName2 = s2.getNome().toUpperCase();

	   //ascending order
	   return StudentName1.compareTo(StudentName2);
    }};
    
    public static Comparator<Produto> descendingNameComparator = new Comparator<Produto>() {

        @Override
	public int compare(Produto s1, Produto s2) {
	   String StudentName1 = s1.getNome().toUpperCase();
	   String StudentName2 = s2.getNome().toUpperCase();

	   //descending order
	   return StudentName2.compareTo(StudentName1);
    }};
    
    public void menu(int value) {
        System.out.println(
                "1.Alfabetica (A-Z) - nome do produto\n"
              + "2.Alfabetica (Z-A) - nome do produto\n"
              + "3.Menor preco - crescente\n"  
              + "4.Maior preco - decrescente\n"
              + "5.Mais vendidos - decrescente pelo mais vendido\n"
        );
        
        switch(value) {
            case 1:
                Collections.sort(productList, ascendingNameComparator);
                printProducts();
            case 2:
                Collections.sort(productList, descendingNameComparator);
                printProducts();
        }
    }
    
    public void printProducts() {
        for (Produto item: productList) {
            System.out.println(item.toString());
        }
    }
}
