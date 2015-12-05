/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lp2g17.biblioteca;

import java.util.ArrayList;
import java.util.GregorianCalendar;

/**
 *
 * @author munir
 */
public class Livro {

    private int codigoLivro;
    private String tituloLivro;
    private CategoriasEnum categoria;
    private int quantidade;
    private int emprestados;
    private ArrayList<EmprestadoPara> emprestadoPara;

    public Livro(int codigoLivro, String tituloLivro, int quantidade, int emprestados) {
        this.codigoLivro = codigoLivro;
        this.tituloLivro = tituloLivro;
        this.quantidade = quantidade;
        this.emprestados = emprestados;
        this.emprestadoPara = new ArrayList<EmprestadoPara>();
    }

    public Livro(String tituloLivro) {
        this.tituloLivro = tituloLivro;
        this.emprestados = 0;
        this.quantidade = 0;
        this.emprestadoPara = new ArrayList<EmprestadoPara>();
    }

    public void setCodigoLivro(int codigoLivro) {
        this.codigoLivro = codigoLivro;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public void empresta() throws CopiaNaoDisponivelEx {
        if (this.emprestados == this.quantidade) {
            throw new CopiaNaoDisponivelEx();
        } else {
            this.emprestados++;
        }
    }

    public void devolve() throws NenhumaCopiaEmprestadaEx {
        if (this.emprestados == 0) {
            throw new NenhumaCopiaEmprestadaEx();
        } else {
            this.emprestados--;
        }
    }

    public void adUsuarioHist(GregorianCalendar dataEmprestimo, GregorianCalendar dataDevolucao, int codigoUsuario) {
        EmprestadoPara emprestadoPara = new EmprestadoPara(dataEmprestimo, dataDevolucao, codigoUsuario);
        this.emprestadoPara.add(emprestadoPara);
    }

    public int getCodigoLivro() {
        return codigoLivro;
    }

    public String getTituloLivro() {
        return tituloLivro;
    }

    public CategoriasEnum getCategoria() {
        return categoria;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public int getEmprestados() {
        return emprestados;
    }

    public ArrayList<EmprestadoPara> getEmprestadoPara() {
        return emprestadoPara;
    }
}
