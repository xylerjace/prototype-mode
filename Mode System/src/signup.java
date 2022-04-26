import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class signup {

	JFrame frame;
	private JTextField txtName;
	private JTextField txtEmail;
	private JTextField txtPassword;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					signup window = new signup();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public signup() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 703, 501);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setLocationRelativeTo(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(128, 128, 128));
		panel.setBounds(166, 72, 340, 390);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(211, 211, 211));
		panel_1.setBounds(10, 11, 320, 368);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Create an account");
		lblNewLabel.setFont(new Font("SansSerif", Font.BOLD, 25));
		lblNewLabel.setBounds(46, 11, 239, 35);
		panel_1.add(lblNewLabel);
		
		txtName = new JTextField();
		txtName.setForeground(new Color(192, 192, 192));
		txtName.setFont(new Font("SansSerif", Font.PLAIN, 14));
		txtName.setText("Name");
		txtName.setBounds(46, 95, 239, 35);
		panel_1.add(txtName);
		txtName.setColumns(10);
		
		txtEmail = new JTextField();
		txtEmail.setForeground(new Color(192, 192, 192));
		txtEmail.setFont(new Font("SansSerif", Font.PLAIN, 14));
		txtEmail.setText("Email");
		txtEmail.setBounds(46, 170, 239, 35);
		panel_1.add(txtEmail);
		txtEmail.setColumns(10);
		
		txtPassword = new JTextField();
		txtPassword.setForeground(new Color(192, 192, 192));
		txtPassword.setFont(new Font("SansSerif", Font.PLAIN, 14));
		txtPassword.setText("Password");
		txtPassword.setBounds(46, 246, 239, 35);
		panel_1.add(txtPassword);
		txtPassword.setColumns(10);
		
		JButton btnNewButton = new JButton("Sign Up");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Homepage window = new Homepage();
				window.frame.setVisible(true);
				frame.dispose();
			}
		});
		btnNewButton.setFont(new Font("SansSerif", Font.BOLD, 15));
		btnNewButton.setBackground(new Color(128, 0, 0));
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBounds(109, 308, 113, 35);
		panel_1.add(btnNewButton);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(128, 0, 0));
		panel_2.setBounds(0, 0, 722, 61);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				loginPage window = new loginPage();
				window.loginFrame.setVisible(true);
				frame.dispose();
			}
		});
		ImageIcon arrow = new ImageIcon(this.getClass().getResource("backarrow.png"));
		btnNewButton_1.setIcon(arrow);
		btnNewButton_1.setBounds(10, 11, 40, 40);
		panel_2.add(btnNewButton_1);
	}

}
