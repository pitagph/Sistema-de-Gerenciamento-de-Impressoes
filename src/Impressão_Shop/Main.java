/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Impressão_Shop;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author PhillipeNoteTec
 */
public class Main extends Serviços{
    
  void ler_arquivoId() throws FileNotFoundException, IOException {
  File DIR = new File("c:\\caixa");
  File ler_arquivo_id = new File(DIR, "arquivo_id_venda.txt");
  FileReader arquivo_id_leitura = new FileReader(ler_arquivo_id);
  BufferedReader buff = new BufferedReader(arquivo_id_leitura);
  
  String linha = "";
  List result = new ArrayList();
  
   while ((linha = buff.readLine()) != null) {
          //      System.out.println(linha);
                if (linha != null && !linha.isEmpty()) {
                    result.add(linha);
                }
            }
            arquivo_id_leitura.close();
            buff.close();
    
            for (Object s : result) {
                String l = (String.valueOf(s));
                //Usamos o método split da classe String
                // para separar as partes entre os ponto e vírgulas.
                //Guardamos o resultado em um array
                String[] user = l.split(" ");

                //Criamos um objeto User e setamos em seus atributos
                //as posições correspondentes do array
                for (int i = 0; i < user.length; i++) {
                    int d = Integer.parseInt(user[i]);
                    setId(d);
                }
            }
  
  }
  
  void gravar_id_venda(int id_venda) throws IOException {
    File DIR = new File("c:\\caixa");
   File arquivo = new File(DIR, "arquivo_id_venda.txt");
   FileWriter arquivo_caixa = new FileWriter(arquivo, false);    

      PrintWriter escrever_caixa = new PrintWriter(arquivo_caixa);
    //  double soma = getId()+1;
           escrever_caixa.print(id_venda);
           escrever_caixa.flush();
           escrever_caixa.close();
      
      
  }
    
  void ler_arquivoCaixa() throws FileNotFoundException, IOException{
  File DIR = new File("c:\\caixa");
  File ler_arquivo = new File(DIR, "entrada_caixa_impressao.txt");
  FileReader arquivo_leitura = new FileReader(ler_arquivo);
  BufferedReader buff = new BufferedReader(arquivo_leitura);
  
  String linha = "";
  List result = new ArrayList();
  
   while ((linha = buff.readLine()) != null) {
          //      System.out.println(linha);
                if (linha != null && !linha.isEmpty()) {
                    result.add(linha);
                }
            }
            arquivo_leitura.close();
            buff.close();
    
            for (Object s : result) {
                String l = (String.valueOf(s));
                //Usamos o método split da classe String
                // para separar as partes entre os ponto e vírgulas.
                //Guardamos o resultado em um array
                String[] user = l.split(" ");

                //Criamos um objeto User e setamos em seus atributos
                //as posições correspondentes do array
                for (int i = 0; i < user.length; i++) {
                    double d = Double.parseDouble(user[i]);
                    setDinheiro_caixa(d);
                }
            }
            }  
   
  void entrada_caixa(double entrada_caixa) throws IOException {
   File DIR = new File("c:\\caixa");
   File arquivo = new File(DIR, "entrada_caixa_impressao.txt");
   FileWriter arquivo_caixa = new FileWriter(arquivo, false);    

      PrintWriter escrever_caixa = new PrintWriter(arquivo_caixa);
      double soma = getDinheiro_caixa() + entrada_caixa;
           escrever_caixa.print(soma);
           escrever_caixa.flush();
           escrever_caixa.close();
         }
  
 void imprimir_nota_Cliente(int id, String servico, double valor_venda, int qnt_servicos) throws IOException {
 File dir = new File("C:\\caixa");
 File notafiscal_arquivo_cliente = new File(dir, "NotaFiscal_Cliente.txt");
 FileWriter arquivo_ler = new FileWriter(notafiscal_arquivo_cliente, false);
      
    PrintWriter escrever_txt = new PrintWriter(arquivo_ler);
       escrever_txt.println("----- Nota Fiscal ------");
       escrever_txt.println("Id da Venda: "+ id);
       escrever_txt.println("Produto: "+ servico);
       escrever_txt.println("Quantidade de Serviço: "+ qnt_servicos);
       escrever_txt.println("Valor Total: R$"+ valor_venda);
       escrever_txt.println("Nome: "+ getCliente());
       escrever_txt.println("Data: "+ getDateTime());
       escrever_txt.println("------------------------- \n");
       escrever_txt.flush();
       escrever_txt.close();
 
 }
    
 void imprimir_nota(String servico, double valor_venda, int qnt_servicos) throws IOException{
     int token = getId()+1;
 File dir = new File("C:\\caixa");
 File notafiscal_arquivo = new File(dir, "Caixa_impressão_historico.txt");
 FileWriter arquivo_ler = null;
  if(notafiscal_arquivo.exists() == true){
       arquivo_ler = new FileWriter(notafiscal_arquivo, true);
       } else {arquivo_ler = new FileWriter(notafiscal_arquivo);}
      
    PrintWriter escrever_txt = new PrintWriter(arquivo_ler);
       escrever_txt.println("----- Nota Fiscal ------");
       escrever_txt.println("Id da Venda: "+ token);
       escrever_txt.println("Produto: "+ servico);
       escrever_txt.println("Quantidade de Serviço: "+ qnt_servicos);
       escrever_txt.println("Valor Total: R$"+ valor_venda);
       escrever_txt.println("Nome: "+ getCliente());
       escrever_txt.println("Data: "+ getDateTime());
       escrever_txt.println("------------------------- \n");
       escrever_txt.flush();
       escrever_txt.close();
       entrada_caixa(valor_venda);
       gravar_id_venda(token);
       imprimir_nota_Cliente(token, servico, valor_venda, qnt_servicos);
 }
    
    void Caixa(String servico, double valor_venda) throws IOException{
         Main m = new Main();
         int quantidade_impressão_int = 0;
   Scanner trade = new Scanner(System.in);
   Scanner Quantidade_impressão = new Scanner(System.in);
   System.out.println("Digite quantas "+ servico + " serão: ");
   quantidade_impressão_int = Quantidade_impressão.nextInt();
   //  System.out.println("Você escolheu o Serviço de "+ servico);
   System.out.println("Serão "+ quantidade_impressão_int +" "+ servico+"'s.");
   double valor_total = valor_venda * quantidade_impressão_int;    
   System.out.println("\n Valor Total: "+ valor_total);
       System.out.println("\n\t Confirma a Venda? Sim = 1 Não = 2");
       int entrada = trade.nextInt();
       if (entrada == 1) { 
           System.out.println("Venda Efetuada com Sucesso!");    
           imprimir_nota(servico, valor_total, quantidade_impressão_int);
           m.Maquina(); 
       } else if (entrada == 2){
           System.out.println("Venda Cancelada.");
           m.Maquina();
       }
       
       }
    
    public void Fazer_servico(int Codigo_serviço) throws IOException{
    if (Codigo_serviço == 1){
        setPreco_Impressão(1.50);
        Impressao();
        Caixa(Nome_impressao, getPreco_Impressão());
    } else if (Codigo_serviço == 2){
        setPreco_Xerox(0.50);
        Xerox();
        Caixa(Nome_Xerox, getPreco_Xerox());
    
    } else if (Codigo_serviço == 3){
        setPreço_Curriculum(5.00);
        Curriculun();
        Caixa(Curriculun, getPreço_Curriculum());
    } else if (Codigo_serviço == 4){
        setPreço_Cartão_de_Visita(3.00);
        Cartao_Visita();
        Caixa(Cartao_Visita, getPreço_Cartão_de_Visita());
    } else if (Codigo_serviço == 5){
        setPreço_Impressao_Foto(2.50);
        Impressao_Foto();
        Caixa(Impressao_foto, getPreço_Impressao_Foto());
    } else if (Codigo_serviço == 6){
        setPreço_Scanner(2.00);
        Scanner();
        Caixa(Scanner, getPreço_Scanner());
    }
    
    }
    
    
     private  void Maquina() throws IOException{
        int entrada;
        ler_arquivoId();
        ler_arquivoCaixa();
        Scanner ler = new Scanner(System.in);
       
        System.out.println("Dinheiro em caixa: "+"R$"+ getDinheiro_caixa());
        System.out.println("Bem vindo ao Sistema de Serviços \n");
        System.out.println("Selecione qual Serviço de Impressão você deseja:\n");
        System.out.println("Selecione 1: Serviço de Impressão (1 Folha) : R$1.50");
        System.out.println("Selecione 2: Serviço de Xerox (1 Folha) : R$0.50");
        System.out.println("Selecione 3: Serviço de Curriculun (1 Folha) : R$5.00");
        System.out.println("Selecione 4: Serviço de Cartão de Visita (1 Folha) : R$3.00");
        System.out.println("Selecione 5: Serviço de Impressão de Foto(1 Folha) : R$2.50");
        System.out.println("Selecione 6: Serviço de Scanner (1 Folha): R$2.00");
        System.out.println("Selecione Qualquer número alem do 6: Sair do Programa");
        entrada = ler.nextInt();
        switch (entrada) {
            case 1: Fazer_servico(entrada);break; 
            case 2: Fazer_servico(entrada);break;
            case 3: Fazer_servico(entrada);break;
            case 4: Fazer_servico(entrada);break;
            case 5: Fazer_servico(entrada);break;
            case 6: Fazer_servico(entrada);break;
            default: System.out.println("Programa Finalizado");
        }
    
    
    }
     
     public static void main(String[] args) throws IOException {
    Main m = new Main();     
        m.Maquina();
    }
    
}
