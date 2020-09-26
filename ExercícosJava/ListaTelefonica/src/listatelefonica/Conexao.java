package listatelefonica;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
    private static final String driver = "com.mysql.cj.jdbc.Driver";
    private static final String url = "jdbc:mysql://localhost:3306/";
    private static final String database = "listatelefônica";
    private static final String options = "?useTimezone=true&serverTimezone=UTC";
    private static final String username = "root";
    private static final String password = "nuQdUVIwA3ke";

    
    
    public static Connection getConexao() throws SQLException, ClassNotFoundException {
        
        Connection conn = null;
        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(url + database + options,
                    username, password);
            
            return conn;
            
	} catch (ClassNotFoundException e) {
            throw new ClassNotFoundException("Driver MySql não foi encontrado!" + e.getMessage());
	} catch (SQLException e) {
            throw new SQLException("Erro ao conectar com a base de dados" + e.getMessage());
	}
    }
    
    public static void fecharConexao(Connection conn) {
        
        try {
            if (conn != null) {
                conn.close();
                System.out.println("Foi encerrada a conexão com o MySQL");
            }
            
        } catch (Exception e) {
            System.out.println("O encerramento da conexão com o MySQL foi impossibilitado " + e.getMessage());
        }
    }
    
    public static void  fecharConexao(Connection conn, PreparedStatement stmt) {
        try {
            if (conn != null) {
                conn.close();
                System.out.println("Foi encerrada a conexão com o MySQL");
            }
            if  (stmt != null) {
                stmt.close();
                System.out.println("Statement encerrado com sucesso");
            }
        } catch (Exception e) {
            System.out.println("Não foi posssível fechar o statement " + e.getMessage());
        }
    }
    
    public static void fecharConexao(Connection conn, PreparedStatement stmt, ResultSet rs) {
        try{
            if (conn != null || stmt != null) {
                fecharConexao(conn, stmt);
            }
            
        } catch (Exception e) {
            System.out.println("Não foi possível fechar o ResultSet " + e.getMessage());
        }
    }
}    

