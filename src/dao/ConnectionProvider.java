/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;
import java.sql.Connection;
import java.sql.DriverManager;
/**
 *
 * @author thear
 */
public class ConnectionProvider {
    
    public static Connection getCon(){
        try {
            //Class.forName("com.mysql.jdbc.Driver");
            Class.forName("com.mysql.cj.jdbc.Driver");

            //Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/pharmacy?useSSL=false","root","cse@1234");
            Connection con = DriverManager.getConnection(
    "jdbc:mysql://localhost:3306/pharmacy?useSSL=false&allowPublicKeyRetrieval=true",
    "root", "cse@1234");

            return con;
            
        }
        catch (Exception e ){
            //System.out.println(e);
            e.printStackTrace();
            return null ;
        }
    }
    
}
