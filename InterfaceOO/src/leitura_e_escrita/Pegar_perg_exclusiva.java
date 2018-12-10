
package leitura_e_escrita;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;


public class Pegar_perg_exclusiva {
    public Pegar_perg_exclusiva(String pergunta, String alternativa){
    
     try {
            String nome = null;
             FileWriter fw = new FileWriter("perguntas.txt", true);
             BufferedWriter bw = new BufferedWriter(fw);
             
            bw.newLine();
            bw.write("(Pergunta do tipo alternativas)");
            bw.newLine();
            bw.write("");
            bw.newLine();
            bw.write("&");
            bw.newLine();
            bw.write("");
             
            bw.write(pergunta);
           
            bw.newLine();
            bw.write("");
          
            bw.newLine();
            bw.write(alternativa);
            
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
