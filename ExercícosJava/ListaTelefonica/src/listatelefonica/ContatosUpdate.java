package listatelefonica;

import static java.lang.String.valueOf;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;


public class ContatosUpdate {
    private final String INSERT = "INSERT INTO LISTA (NOME, TELEFONE) VALUES (?, ?)";
    private final String UPDATE = "UPDATE LISTA SET NOME=?, TELEFONE=? WHERE ID=?";
    private final String DELETE = "DELETE FROM LISTA WHERE ID=?";
    private final String LIST = "SELECT * FROM LISTA";
    private final String LISTBYID = "SELECT * FROM LISTA WHERE ID=?";
    private final String LISTBYNOMEFONE = "SELECT * FROM LISTA WHERE NOME=? AND TELEFONE=?";

    
    public void inserir(Dados dados) {
        if (dados != null) {
            Connection conn = null;
            try {
                conn = Conexao.getConexao();
                PreparedStatement pstm;
                pstm = conn.prepareStatement(INSERT);
                
                pstm.setString(1, dados.getNome());
                pstm.setString(2, dados.getNumero());
                
                pstm.execute();
                JOptionPane.showMessageDialog(null, "Contato cadastrado com sucesso!");
                Conexao.fecharConexao(conn, pstm);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Erro ao inserir contato no banco de dados" + e.getMessage());
            }
        } else {
            System.out.println("O contato enviado por parâmetro está vazio");
        }
        
    }
    
    public void atualizar(Dados contato) {
        if (contato != null) {
            Connection conn = null;
            try {
                conn = Conexao.getConexao();
                PreparedStatement pstm;
                pstm = conn.prepareStatement(UPDATE);

                pstm.setString(1, contato.getNome());
                pstm.setInt(2, contato.getId());
                pstm.setString(3, contato.getNumero());
                
                pstm.execute();
                JOptionPane.showMessageDialog(null, "Contato alterado com sucesso");
                Conexao.fecharConexao(conn);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Erro ao atualizar contato no banco de "
						+ "dados " + e.getMessage());
            } 
        } else {
            JOptionPane.showMessageDialog(null, "O contato enviado por parâmetro está vazio");            
        }
    }
    
    public void remover(int id) {
        Connection conn = null;
        try {
            conn = Conexao.getConexao();
            PreparedStatement pstm;
            pstm = conn.prepareStatement(DELETE);
            
            pstm.setLong(1, id);
            
            pstm.execute();
            Conexao.fecharConexao(conn, pstm);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir contato do banco de dados " + e.getMessage());
        }
    }
    
    public List<Dados> getContatos() {
        Connection conn = null;
        PreparedStatement pstm = null;
        ResultSet rs = null;
        ArrayList<Dados> contatos = new ArrayList<Dados>();
        try {
            conn = Conexao.getConexao();
            pstm = conn.prepareStatement(LIST);
            rs = pstm.executeQuery();
            while (rs.next()) {
                Dados contato = new Dados();
                
                contato.setId(rs.getInt("id"));
                contato.setNome(rs.getString("nome"));
                contato.setNumero(rs.getString("telefone"));
                contatos.add(contato);
            }
            Conexao.fecharConexao(conn, pstm, rs);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao listar contatos" + e.getMessage());
        }
        return contatos;
    }
    
    public Dados getContatoById(int id) {
        Connection conn = null;
        PreparedStatement pstm = null;
        ResultSet rs = null;
        Dados contato = new Dados();
        try {
            conn = Conexao.getConexao();
            pstm = conn.prepareStatement(LISTBYID);
            pstm.setInt(1, id);
            rs = pstm.executeQuery();
            while (rs.next()) {
                contato.setId(rs.getInt("id"));
                contato.setNome(rs.getString("nome"));
                contato.setNumero(rs.getString("telefone"));
            }
            Conexao.fecharConexao(conn, pstm, rs);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao listar contatos" + e.getMessage());
        }
        return contato;
    }
    
    public Dados getContatoByNomeTel(Dados d) {
        Connection conn = null;
        PreparedStatement pstm = null;
        ResultSet rs = null;
        Dados contato = new Dados();
        try {
            conn = Conexao.getConexao();
            pstm = conn.prepareStatement(LISTBYNOMEFONE);
            pstm.setString(1, d.getNome());
            pstm.setString(2, d.getNumero());
            rs = pstm.executeQuery();
            while(rs.next()) {
                contato.setId(rs.getInt("id"));
                contato.setNome(rs.getString("nome"));
                contato.setNumero(rs.getString("telefone"));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao listar contatos" + e.getMessage());
        }
        return contato;
    } 
}    

