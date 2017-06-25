/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Laryssa
 */
public class Conexao {
    static Connection con = null;
 
    
    public static Connection conectar(){
        try{
           if(con == null || con.isValid(0) == false){
               Class.forName("com.mysql.jdbc.Driver");
               con = DriverManager.
                       getConnection("jdbc:mysql://127.0.0.1/aulas", "teste", "123456");
               System.out.println(con.isValid(0));
           } 
        }
        catch(SQLException e){
            e.printStackTrace();
        }
        catch(ClassNotFoundException e){
            e.printStackTrace();
        }
        return con;
    }
    
    
    public static void desconectar(){
        try{
            con.close();
            System.err.println(con.isValid(0));
        }
        catch(SQLException e){
            e.printStackTrace();
        }
    }
            
    
    
}
