/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leitura_e_escrita;

import excecoes.DescricaoVazia;
import excecoes.erro_descricao;
import java.io. *;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing. *;
import views.criar_formulario;

/**
 *
 * @author damarcones
 */
public class PegarDescricao {
  

    public PegarDescricao(String nome, String inicio, String fim, String descricao) {


    DescricaoVazia Vazia = new DescricaoVazia(nome, inicio, fim, descricao);
     if ( Vazia != true ){
         
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
             
             bw.close();
             fw.close();
             
             // pw.flush(); //envia os dados direto pro arquivo
             
             
             
         } catch (IOException e) {
             JOptionPane.showMessageDialog(null, "Erro: Nao foi possivel salvar no arquivo!", "Error", 2);
         }
         new criar_formulario().setVisible(true);
     }
    else{
         new erro_descricao().setVisible(true);
     }
    }
}
    

