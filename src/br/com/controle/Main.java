/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.controle;

import br.com.persistencia.Conexao;
import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author Laryssa
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Connection con = Conexao.conectar();
        
        Conexao.desconectar();
    }    
}
