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

/**
 *
 * @author bruna
 */
public class Pegar_pergunta {
    
    public Pegar_pergunta(String nome, String pergunta){
        
     try {
             FileWriter fw = new FileWriter("formularios/"+ nome + ".txt", true);
             BufferedWriter bw = new BufferedWriter(fw);
             
            bw.newLine();
            bw.write("(Pergunta do tipo aberta curta)");
             
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

    public Pegar_pergunta(String nome) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
