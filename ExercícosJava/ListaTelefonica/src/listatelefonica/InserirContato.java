package listatelefonica;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static java.lang.Integer.parseInt;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class InserirContato extends JFrame {
    private ListaTableModel modelo;
    private JPanel mainPainel;
    private JButton botaoSalvar;
    private JButton botaoLimpar;
    private JLabel lbNome;
    private JLabel lbTelefone;
    private JTextField txNome;
    private JTextField txTelefone;

    public InserirContato(ListaTableModel md) {
         super("Contatos");
         criaJanela();
         modelo = md;
    }
    
    public void criaJanela() {
        botaoSalvar = new JButton("Salvar");
        botaoLimpar = new JButton("Limpar");
        lbNome = new JLabel("         Nome.:   ");
        lbTelefone = new JLabel("         Telefone.:   ");
        txNome = new JTextField(10);
        txTelefone = new JTextField();
        
        mainPainel = new JPanel();
        mainPainel.setLayout(new GridLayout(4, 2, 2, 4));
        mainPainel.add(lbNome);
        mainPainel.add(txNome);
        mainPainel.add(lbTelefone);
        mainPainel.add(txTelefone);
        mainPainel.add(botaoSalvar);
        mainPainel.add(botaoLimpar);
        
        getContentPane().add(mainPainel);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setSize(300, 150);
        setVisible(true);
        botaoSalvar.addActionListener(new BotaoSalvarListener());
        botaoLimpar.addActionListener(new BotaoLimparListener());
    }
    
    private class BotaoSalvarListener implements ActionListener {
        
        public void actionPerformed(ActionEvent e) {
            Dados d = new Dados();
            d.setNome(txNome.getText());
            d.setNumero(txTelefone.getText());
            
            ContatosUpdate dao = new ContatosUpdate();
            dao.inserir(d);
            pesquisar(d);
            modelo.addContato(pesquisar(d));
            setVisible(false);
        }
    }
    
    public Dados pesquisar(Dados co) {
        ContatosUpdate dao = new ContatosUpdate();
        return dao.getContatoByNomeTel(co);
    }
    
    private class BotaoLimparListener implements ActionListener {
        
        public void actionPerformed(ActionEvent e) {
            txNome.setText("");
            txTelefone.setText("");
        }
    }
}


