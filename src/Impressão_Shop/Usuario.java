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
public class Usuario {
    
   int id;
   String Cliente;

    public Usuario() {
    }

    public Usuario(int id, String Cliente) {
        this.id = id;
        this.Cliente = Cliente;
    }

    public String getCliente() {
        return Cliente;
    }

    public int getId() {
        return id;
    }

    public void setCliente(String Cliente) {
        this.Cliente = Cliente;
    }

    public void setId(int id) {
        this.id = id;
    }
   
   
    
}
