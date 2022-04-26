import java.awt.EventQueue;
import java.sql.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;

public class loginPage{

	JFrame loginFrame;
	private JTextField txtEnterEmail;
	private JPasswordField passwordField;
	private ImageIcon swu;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					loginPage window = new loginPage();
					window.loginFrame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public loginPage() {
		initialize();
		
	}
	

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		loginFrame = new JFrame();
		loginFrame.setResizable(false);
		loginFrame.getContentPane().setBackground(new Color(255, 255, 255));
		loginFrame.getContentPane().setForeground(new Color(255, 255, 255));
		loginFrame.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\k\\Downloads\\SWU.png"));
		loginFrame.setBackground(new Color(192, 192, 192));
		loginFrame.getContentPane().setFont(new Font("DM Sans", Font.PLAIN, 9));
		loginFrame.setBounds(100, 100, 700, 503);
		loginFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		loginFrame.setLocationRelativeTo(null);
		loginFrame.getContentPane().setLayout(null);
		
		txtEnterEmail = new JTextField();
		txtEnterEmail.setBounds(211, 221, 245, 31);
		txtEnterEmail.setForeground(new Color(192, 192, 192));
		txtEnterEmail.setFont(new Font("DM Sans", Font.PLAIN, 9));
		txtEnterEmail.setText("Enter Email");
		txtEnterEmail.setToolTipText("");
		loginFrame.getContentPane().add(txtEnterEmail);
		txtEnterEmail.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(211, 296, 245, 31);
		loginFrame.getContentPane().add(passwordField);
		
		JButton loginButton = new JButton("Login");
		loginButton.setBounds(271, 337, 130, 31);
		loginButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Homepage window = new Homepage();
				window.frame.setVisible(true);
				loginFrame.dispose();
			}
		});
		loginButton.setForeground(new Color(255, 255, 255));
		loginButton.setBackground(new Color(128, 0, 0));
		loginButton.setFont(new Font("DM Sans", Font.BOLD, 15));
		loginButton.setFocusable(false);
		loginFrame.getContentPane().add(loginButton);
		
		JLabel lblNewLabel = new JLabel("Login");
		lblNewLabel.setBounds(291, 119, 138, 54);
		lblNewLabel.setForeground(new Color(128, 0, 0));
		lblNewLabel.setFont(new Font("DM Sans", Font.BOLD, 25));
		loginFrame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Sign in to continue");
		lblNewLabel_1.setBounds(283, 171, 118, 14);
		lblNewLabel_1.setForeground(new Color(128, 128, 128));
		lblNewLabel_1.setFont(new Font("DM Sans", Font.PLAIN, 9));
		loginFrame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("PLEASE ENTER YOUR EMAIL");
		lblNewLabel_2.setBounds(254, 196, 147, 14);
		lblNewLabel_2.setForeground(new Color(128, 128, 128));
		lblNewLabel_2.setFont(new Font("DM Sans", Font.PLAIN, 9));
		loginFrame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("PLEASE ENTER YOUR PASSWORD");
		lblNewLabel_3.setBounds(254, 263, 164, 22);
		lblNewLabel_3.setForeground(new Color(128, 128, 128));
		lblNewLabel_3.setFont(new Font("DM Sans", Font.PLAIN, 9));
		loginFrame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setBounds(154, 22, 396, 128);
		ImageIcon swu = new ImageIcon(this.getClass().getResource("swuu.png"));
		lblNewLabel_4.setIcon(swu);
		loginFrame.getContentPane().add(lblNewLabel_4);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(128, 0, 0));
		panel.setBounds(0, 1, 684, 4);
		loginFrame.getContentPane().add(panel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(128, 0, 0));
		panel_1.setBounds(0, 1, 4, 463);
		loginFrame.getContentPane().add(panel_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(128, 0, 0));
		panel_2.setBounds(680, 1, 4, 463);
		loginFrame.getContentPane().add(panel_2);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(128, 0, 0));
		panel_3.setBounds(0, 460, 684, 4);
		loginFrame.getContentPane().add(panel_3);
		
		JButton btnNewButton = new JButton("Sign up");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				signup window = new signup();
				window.frame.setVisible(true);
				loginFrame.dispose();
				
			}
		});
		btnNewButton.setBackground(new Color(128, 0, 0));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBounds(271, 418, 130, 31);
		loginFrame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_5 = new JLabel("No account? Sign up");
		lblNewLabel_5.setForeground(new Color(128, 128, 128));
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 9));
		lblNewLabel_5.setBounds(295, 393, 118, 14);
		loginFrame.getContentPane().add(lblNewLabel_5);
	}
}
