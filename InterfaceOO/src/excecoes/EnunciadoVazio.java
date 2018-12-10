/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excecoes;

import javax.swing.JOptionPane;
import views.criar_formulario;
import java.lang.*;

/**
 *
 * @author damarcones
 */
public class EnunciadoVazio {

    public int vazia;

   

    public EnunciadoVazio(String pergunta) {

        if((pergunta.trim().equals(""))== true ) {
            vazia =1 ;
        }
        else 
            vazia = 0;
    }
    
    public void vazia(String nome, String inicio, String fim, String descricao) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
