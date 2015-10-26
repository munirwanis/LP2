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

    /**
     * Constructor to set all private values
     * @param codigo
     * @param nome
     * @param preco
     * @param estoque
     * @param vendidos
     * @param promocao
     */
    public Produto(int codigo, String nome, double preco, long estoque, long vendidos, long promocao) {
        this.Codigo = codigo;
        this.Nome = nome;
        this.Preco = preco;
        this.Estoque = estoque;
        this.Vendidos = vendidos;
        this.Promocao = promocao;
    }
    
    /**
     * Constructor without Promocao, default value is 0
     * @param codigo
     * @param nome
     * @param preco
     * @param estoque
     * @param vendidos 
     */
    public Produto(int codigo, String nome, double preco, long estoque, long vendidos) {
        this.Codigo = codigo;
        this.Nome = nome;
        this.Preco = preco;
        this.Estoque = estoque;
        this.Vendidos = vendidos;
        this.Promocao = 0;
    }
    
    private int Codigo;
    
    private String Nome;
    
    private double Preco;
    
    private long Estoque;
    
    private long Vendidos;
    
    private long Promocao;
    
    public int getCodigo() {
        return this.Codigo;
    }
    
    public String getNome() {
        return this.Nome;
    }
    
    public double getPreco() {
        return this.calculatePromotion(Preco, Promocao);
    }
    
    public long getEstoque() {
        return this.Estoque;
    }
    
    public long getVendidos() {
        return this.Vendidos;
    }
    
    public long getPromocao() {
        return this.Promocao;
    }
    
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
        double percent = (double)promotion/100;
        double newPrice = price - (price * percent);
        return newPrice;
    }
    
    @Override
    public String toString() {
        
        String response = String.format("%2d\t%20s  %10.2f %5d %5d ", this.Codigo, this.Nome, 
                calculatePromotion(this.Preco, this.Promocao), 
                this.Estoque, this.Vendidos);
        
        String promotionString = String.format("%5d%% off!", this.Promocao);
        
        if (this.Promocao != 0) {
            return response += promotionString;
        }
        else {
            return response;
        }
    }
}
