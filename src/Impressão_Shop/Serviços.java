/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Impressão_Shop;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author PhillipeNoteTec
 */
public class Serviços extends Preço_dos_Serviços{
   
    Usuario user = new Usuario();
    
    public static final String Nome_impressao = "Impressão";
    public static final String Nome_Xerox = "Xerox";
    public static final String Curriculun = "Curriculun";
    public static final String Cartao_Visita = "Cartão de Visita";
    public static final String User = "Cliente";
    
    
   public String getDateTime() { 
	DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss"); 
	Date date = new Date(); 
	return dateFormat.format(date); 
}
    
   void Impressao(){
         System.out.println(Nome_impressao);
         System.out.println(getPreco_Impressão());
         setCliente(User);
     //    setPreco_Impressão(valor);
       }
    
   void Xerox(){
         System.out.println(Nome_Xerox);
         System.out.println(getPreco_Xerox());
         setCliente(User);
       //  setPreco_Xerox(valor);
    }
    
   void Curriculun(){
        System.out.println(Curriculun);
        System.out.println(getPreço_Curriculum());
        setCliente(User);
       // setPreço_Curriculum(valor);
    
    }
    
   void Cartao_Visita(){
        System.out.println(Cartao_Visita);
        System.out.println(getPreço_Cartão_de_Visita());
        setCliente(User);
      //  setPreço_Cartão_de_Visita(valor);
    }
    
    
}
