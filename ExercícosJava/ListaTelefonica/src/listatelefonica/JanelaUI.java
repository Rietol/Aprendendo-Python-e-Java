package listatelefonica;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class JanelaUI extends JFrame {
    private JPanel mainPainel;
    private JTable tabela;
    private JPanel painelBotoes;
    private JButton botaoEditar;
    private JButton botaoInserir;
    private JButton botaoExcluir;
    private JScrollPane barraRolagem;
    private ListaTableModel modelo;
    List<Dados> lista;
    
    public JanelaUI() {
        super("Contatos");
        criaJTable();
        criaJanela();
    }
    
    public void criaJanela() {
        botaoInserir = new JButton("Inserir");
        botaoExcluir = new JButton("Excluir");
        botaoEditar = new JButton("Editar");
        painelBotoes = new JPanel();
        barraRolagem = new JScrollPane(tabela);
        mainPainel = new JPanel();
        mainPainel.setLayout(new BorderLayout());
        mainPainel.add(BorderLayout.CENTER, barraRolagem);
        painelBotoes.add(botaoInserir);
        painelBotoes.add(botaoEditar);
        painelBotoes.add(botaoExcluir);
        mainPainel.add(BorderLayout.SOUTH, painelBotoes);
        
        getContentPane().add(mainPainel);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(500, 320);
        setVisible(true);
        botaoInserir.addActionListener(new BotaoInserirListener());
        botaoEditar.addActionListener(new BotaoEditarListener());
        botaoExcluir.addActionListener(new BotaoExcluirListener());
    }
    
    private void criaJTable() {
        tabela = new JTable(modelo);
        pesquisar();
    }

    private void pesquisar() {
        ContatosUpdate dao = new ContatosUpdate();
        lista = dao.getContatos();
        modelo = new ListaTableModel(lista);
        tabela.setModel(modelo);
    }

    private class BotaoExcluirListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            int linhaSelecionada = -1;
            linhaSelecionada = tabela.getSelectedRow();
            if (linhaSelecionada >= 0) {
                int idContato = (int) tabela.getValueAt(linhaSelecionada, 0);
                ContatosUpdate dao = new ContatosUpdate();
                dao.remover(idContato);
                
                modelo.removeContato(linhaSelecionada);
            } else {
                JOptionPane.showMessageDialog(null, "É necessário selecionar uma linha");
            }
        }
    }
    
        private class BotaoInserirListener implements ActionListener {
            
            public void actionPerformed(ActionEvent e) {
                InserirContato ic = new InserirContato(modelo);
                ic.setVisible(true);
            }
        }
        
        private class BotaoEditarListener implements ActionListener {
            public void actionPerformed(ActionEvent e) {
                int linhaSelecionada = -1;
                linhaSelecionada = tabela.getSelectedRow();
                if (linhaSelecionada >= 0) {
                    int idContato = (int) tabela.getValueAt(linhaSelecionada, 0);
                    AtualizarContato ic = new AtualizarContato(modelo, idContato, linhaSelecionada);
                    ic.setVisible(true);
                } else {
                    JOptionPane.showMessageDialog(null, "É necessário selecionar uma linha");
                }
            }
    }    
    public static void main(String[] args) {
        JanelaUI lc = new JanelaUI();
        lc.setVisible(true);
    }
}

    
