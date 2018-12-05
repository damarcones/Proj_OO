/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Receber_dados;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author damarcones
 */
public class ler_descricao {
    
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
            FileWriter fw = new FileWriter("descricao.txt",true);
            PrintWriter pw = new PrintWriter(fw);
            pw.println("Nome do formulário: "+ this.nome);
            pw.println("Data de Inicio: "+ this.inicio);
            pw.println("Data de Fim: "+ this.fim);
            pw.println("Descrição: "+ this.descricao);
            pw.flush(); //envia os dados direto pro arquivo
            pw.close();
            fw.close();
            
            
        } catch (IOException ex) {
            Logger.getLogger(ler_descricao.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return "Sucesso";
    
    
    }

    public void setnome(String text) {
    }

    public void setinicio(String text) {
    }

    public void setfim(String text) {
    }

    public void setdescricao(String text) {
    }
    
    
}
