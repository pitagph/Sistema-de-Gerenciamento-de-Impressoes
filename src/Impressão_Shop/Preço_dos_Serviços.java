/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Impressão_Shop;

/**
 *
 * @author PhillipeNoteTec
 */
public class Preço_dos_Serviços extends Usuario{
   private double Preco_Xerox;
   private double Preco_Impressão;
   private double Preço_Curriculum;
   private double Preço_Cartão_de_Visita;
   private double dinheiro_caixa;
   private Usuario user;

    public Preço_dos_Serviços() {
    }

    public Preço_dos_Serviços(double Preco_Xerox, double Preco_Impressão, double Preço_Curriculum, double Preço_Cartão_de_Serviço, double dinheiro_caixa ,Usuario user) {
        this.Preco_Xerox = Preco_Xerox;
        this.Preco_Impressão = Preco_Impressão;
        this.Preço_Curriculum = Preço_Curriculum;
        this.Preço_Cartão_de_Visita = Preço_Cartão_de_Visita;
        this.dinheiro_caixa = dinheiro_caixa;
        this.user = user;
    }

    public void setCliente(String Cliente) {
        this.Cliente = Cliente;
    }

    public String getCliente() {
        return Cliente;
    }
    

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public double getDinheiro_caixa() {
        return dinheiro_caixa;
    }

    public void setDinheiro_caixa(double dinheiro_caixa) {
        this.dinheiro_caixa = dinheiro_caixa;
    }
    
    /**
     * @return the Preco_Xerox
     */
    public double getPreco_Xerox() {
        return Preco_Xerox;
    }

    /**
     * @param Preco_Xerox the Preco_Xerox to set
     */
    public void setPreco_Xerox(double Preco_Xerox) {
        this.Preco_Xerox = Preco_Xerox;
    }

    /**
     * @return the Preco_Impressão
     */
    public double getPreco_Impressão() {
        return Preco_Impressão;
    }

    /**
     * @param Preco_Impressão the Preco_Impressão to set
     */
    public void setPreco_Impressão(double Preco_Impressão) {
        this.Preco_Impressão = Preco_Impressão;
    }

    /**
     * @return the Preço_Curriculum
     */
    public double getPreço_Curriculum() {
        return Preço_Curriculum;
    }

    /**
     * @param Preço_Curriculum the Preço_Curriculum to set
     */
    public void setPreço_Curriculum(double Preço_Curriculum) {
        this.Preço_Curriculum = Preço_Curriculum;
    }

    /**
     * @return the Preço_Cartão_de_Serviço
     */
    public double getPreço_Cartão_de_Visita() {
        return Preço_Cartão_de_Visita;
    }

    /**
     * @param Preço_Cartão_de_Visita the Preço_Cartão_de_Visita to set
     */
    public void setPreço_Cartão_de_Visita(double Preço_Cartão_de_Visita) {
        this.Preço_Cartão_de_Visita = Preço_Cartão_de_Visita;
    }
   
   
   
   
}
