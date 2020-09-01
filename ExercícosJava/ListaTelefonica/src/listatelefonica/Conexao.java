package listatelefonica;

import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;

public class Conexao { //Por enquanto deixei como um código de conexão genérico.
    public static void conexao() {
        String driver = "com.mysql.cj.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/listatelefônica?useTimezone=true&serverTimezone=UTC";
        String username = "root";
        String password = "nuQdUVIwA3ke";
        Statement stmt = null;
        ResultSet rs = null;
        
        try {
            Connection connection = DriverManager.getConnection(url, username, password);
             
            stmt = connection.createStatement();
            
            
        } catch (SQLException e) {
            System.out.println("SQLException: " + e.getMessage());
            System.out.println("SQLState: " + e.getSQLState());
            System.out.println("VendorError: " + e.getErrorCode());
        }
        finally {
        // O propósito desta seção é liberar os recursos após serem utilizados 
        // utilizando o bloco finally{}
        // em oredem reversa da sua criação
        // caso eles não sejam mais necessários

        if (rs != null) {
            try {
                rs.close();
            } catch (SQLException sqlEx) { } // ignore

            rs = null;
        }

        if (stmt != null) {
            try {
                stmt.close();
            } catch (SQLException sqlEx) { } // ignore

            stmt = null;
            }
        }
    }
    
    
    public static void inicializar() { //O propósito deste método é iniciar a Lista com os dados
        String driver = "com.mysql.cj.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/listatelefônica?useTimezone=true&serverTimezone=UTC";
        String username = "root";
        String password = "nuQdUVIwA3ke";
        Statement stmt = null;
        ResultSet rs = null;
        
        try {
            Connection con = DriverManager.getConnection(url, username, password);
            
            stmt = con.createStatement(); 
            
            rs = stmt.executeQuery("select count(Id) from lista");
            System.out.println(rs);
            
            ArrayList<Lista> dados = new ArrayList<Lista>();
            
            
            
        } catch (SQLException e) {
            System.out.println("SQLException: " + e.getMessage());
            System.out.println("SQLState: " + e.getSQLState());
            System.out.println("VendorError: " + e.getErrorCode());
        }
        finally {
        // O propósito desta seção é liberar os recursos após serem utilizados 
        // utilizando o bloco finally{}
        // em oredem reversa da sua criação
        // caso eles não sejam mais necessários

        if (rs != null) {
            try {
                rs.close();
            } catch (SQLException sqlEx) { } // ignore

            rs = null;
        }

        if (stmt != null) {
            try {
                stmt.close();
            } catch (SQLException sqlEx) { } // ignore

            stmt = null;
            }
        }       
    }
}    

