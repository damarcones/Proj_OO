
package leitura_e_escrita;

import excecoes.DescricaoVazia;
import excecoes.erro_descricao;
import java.io. *;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing. *;
import views.criar_formulario;


public class PegarDescricao {
  

    public PegarDescricao(String nome, String inicio, String fim, String descricao) {
    
         
         try {
             FileWriter fw = new FileWriter("formulario/"+nome+".txt", true);
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
             bw.write("");
             bw.newLine();
             bw.write("");
             bw.write("____________PERGUNTAS_____________");
             bw.newLine();
             bw.newLine();
             bw.write("@");
             
             bw.close();
             fw.close();
             
             
         } catch (IOException e) {
             JOptionPane.showMessageDialog(null, "Erro: Nao foi possivel salvar no arquivo!", "Error", 2);
         }
    }
}
    

