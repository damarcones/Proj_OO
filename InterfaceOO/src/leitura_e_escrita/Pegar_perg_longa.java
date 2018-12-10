/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leitura_e_escrita;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;
import views.descricao_formulario;
import views.pergunta_aberta_curta;
import leitura_e_escrita.PegarDescricao;

/**
 *
 * @author bruna
 */
public class Pegar_perg_longa {

 
    
    public Pegar_perg_longa(String pergunta){
         
    
     try {
            String nome = null;
             FileWriter fw = new FileWriter("perguntas.txt", true);
             BufferedWriter bw = new BufferedWriter(fw);
             
            bw.newLine();
            bw.write("(Pergunta do tipo aberta Longa)");
            bw.newLine();
            bw.write("");
            bw.newLine();
            bw.write("$");
            bw.newLine();
            bw.write("");
             
            bw.write(pergunta);
           
            bw.newLine();
            bw.write("");
          
            bw.newLine();
            bw.write("");
             
            bw.close();
            fw.close();
             
             
         } catch (IOException e) {
             JOptionPane.showMessageDialog(null, "Erro: Nao foi possivel salvar no arquivo!", "Error", 2);
         }
    }
}
