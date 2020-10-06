package listatelefonica;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static java.lang.Integer.parseInt;
import static java.lang.String.valueOf;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class AtualizarContato extends JFrame {
    
    private ListaTableModel modelo;
    private JPanel mainPainel;
    private JButton botaoSalvar;
    private JButton botaoLimpar;
    private JLabel lbNome;
    private JLabel lbNumero;
    private JLabel lbId;
    private JTextField txNome;
    private JTextField txId;
    private JTextField txNumero;
    Dados dados;
    private int linhaSelecionada;
    
    public AtualizarContato(ListaTableModel md, int id, int linha) {
        super("Contatos");
        criaJanela();
        modelo = md;
        ContatosUpdate dao = new ContatosUpdate();
        dados = dao.getContatoById(id);
        txId.setText(Integer.toString((int)dados.getId()));
        txNome.setText(dados.getNome());
        txNumero.setText(dados.getNumero());
        linhaSelecionada = linha;
    }
    
    public void criaJanela() {
        botaoSalvar = new JButton("Salvar");
        botaoLimpar = new JButton("Limpar");
        lbNome = new JLabel("         Nome.:   ");
        lbNumero = new JLabel("         Telefone.:   ");
        lbId = new JLabel("         Id.:   ");
        txNome = new JTextField();
        txNumero = new JTextField();
        txId = new JTextField();
        txId.setEditable(false);
        
        mainPainel = new JPanel();
        mainPainel.setLayout(new GridLayout(5, 2, 2 , 4));
        mainPainel.add(lbId);
        mainPainel.add(txId);
        mainPainel.add(lbNome);
        mainPainel.add(lbNumero);
        mainPainel.add(txNumero);
        mainPainel.add(botaoLimpar);
        mainPainel.add(botaoSalvar);
        
        getContentPane().add(mainPainel);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setSize(300, 150);
        setVisible(true);
        
        botaoSalvar.addActionListener(new AtualizarContato.BotaoSalvarListener());
        botaoLimpar.addActionListener(new AtualizarContato.BotaoLimparListener());
    }
    
    private class BotaoSalvarListener implements ActionListener {
        
        public void actionPerformed(ActionEvent e) {
            Dados d = new Dados();
            d.setId(Integer.parseInt(txId.getText()));
            d.setNome(txNome.getText());
            d.setNumero(txNumero.getText());
            
            ContatosUpdate dao = new ContatosUpdate();
            dao.atualizar(d);
            modelo.updateContato(linhaSelecionada, d);
            setVisible(false);
        }
    }
    
    private class BotaoLimparListener implements ActionListener {
        
        public void actionPerformed(ActionEvent e) {
            txNome.setText("");
            txNumero.setText("");
        }
    }
}
