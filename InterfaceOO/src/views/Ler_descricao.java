/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import java.io. *;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

/**
 *
 * @author damarcones
 */
public class Ler_descricao {
    
    private String nome;
    private String inicio;
    private String fim;
    private String descricao;
    public Object salvar;


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getInicio() {
        return inicio;
    }

    public void setInicio(String inicio) {
        this.inicio = inicio;
    }

    public String getFim() {
        return fim;
    }

    public void setFim(String fim) {
        this.fim = fim;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    public String salvar(){
        
        try {
            FileWriter fw = new FileWriter("descricao.txt", true);
            BufferedWriter bw = new BufferedWriter(fw);
            
   
            
            bw.write("Nome do formulário: "+nome);
            bw.newLine();
            bw.write("Data de Inicio: "+inicio);
            bw.newLine();
            bw.write("Data de termino: "+fim);
            bw.newLine();
            bw.write("Descrição do formulário: "+descricao);
            bw.newLine();
            bw.write("");
            bw.newLine();

            bw.close();
            fw.close();

           // pw.flush(); //envia os dados direto pro arquivo
      
            
            
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Erro: Nao foi possivel salvar no arquivo!", "Error", 2);
        }
        
        return "Sucesso";
    
    
    }

//   

    public void setnome(String text) {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setinicio(String text) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setfim(String text) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setdescricao(String text) {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void getnome(String nome) {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void getinicio(String text) {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void getfim(String text) {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void getdescricao(String text) {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
