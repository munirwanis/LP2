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
    
    private double Promocao;
}
