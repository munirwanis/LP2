/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Munir Wanis
 */
public class Produto {
    public Produto(int codigo, String nome, double preco, long estoque, long vendidos, double promocao) {
        this.Codigo = codigo;
        this.Nome = nome;
        this.Preco = preco;
        this.Estoque = estoque;
        this.Vendidos = vendidos;
        this.Promocao = promocao;
    }
    
    private int Codigo;
    
    private String Nome;
    
    private double Preco;
    
    private long Estoque;
    
    private long Vendidos;
    
    private long Promocao;
    
    /**
     * Method returns the price with promotion
     * @param price
     * @param promotion
     * @return newPrice
     */
    private double calculatePromotion(double price, long promotion) {
        if (promotion == 0) {
            return price;
        }
        double percent = promotion/100;
        double newPrice = price * percent;
        return newPrice;
    }
    
    @Override
    public String toString() {
        return String.format("%2d\t%20s  %5.1f %3d %3d %2d", 
                this.Codigo, this.Nome, 
                this.calculatePromotion(this.Preco, this.Promocao), 
                this.Estoque, this.Vendidos, this.Promocao);
    }
}
