package br.com.loja.dal;
import java.sql.*;
public class Conecta {
    public static Connection conector(){
        java.sql.Connection conecta;
        String driver = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/bdlojaetec";
        String user = "root";
        String senha = "";
        try {
            Class.forName(driver);
            conecta = DriverManager.getConnection(url, user, senha);
            return conecta;
        } catch (Exception e){
            return null;
        }
    }
}
