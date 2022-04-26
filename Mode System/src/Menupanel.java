import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JButton;

public class Menupanel extends JPanel {

	/**
	 * Create the panel.
	 */
	public Menupanel() {
		setBackground(Color.BLACK);
		setLayout(null);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(42, 40, 89, 23);
		add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("New button");
		btnNewButton_1.setBounds(42, 116, 89, 23);
		add(btnNewButton_1);

	}
}
