import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.FlowLayout;

@SuppressWarnings("serial")
public class FrameInicial extends JFrame {
	JButton bE = new JButton("Gerenciar Estoque");
	JButton bD = new JButton("Receita do Dia");
	JButton bR = new JButton("Gerenciar Receitas");

	public FrameInicial() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		add(bE);
		add(bD);
		add(bR);
		setSize(600,300);
		setVisible(true);

	}
}
