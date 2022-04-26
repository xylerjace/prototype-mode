import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JPanel;
import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JMenuBar;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Homepage {

	JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Homepage window = new Homepage();
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
	public Homepage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setResizable(false);
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setBackground(new Color(255, 255, 255));
		frame.setBounds(100, 100, 720, 501);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(128, 0, 0));
		panel.setBounds(0, 0, 704, 56);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				loginPage window = new loginPage();
				window.loginFrame.setVisible(true);
				frame.dispose();
			}
		});
		btnNewButton.setBackground(new Color(255, 255, 255));
		btnNewButton.setBounds(10, 11, 47, 40);
		btnNewButton.setFocusable(false);
		ImageIcon arrow = new ImageIcon(this.getClass().getResource("backarrow.png"));
		btnNewButton.setIcon(arrow);
		btnNewButton.setHorizontalAlignment(SwingConstants.LEFT);
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.setBackground(new Color(128, 0, 0));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String[] options = new String[2];
				options[0] = "HELP";
				options[1] = "LOGOUT";
				int menu =JOptionPane.showOptionDialog(frame.getContentPane(), "What do you want to do?", "Menu",
											0, JOptionPane.INFORMATION_MESSAGE, null, options, null);
					if (menu == 1) {
						int log = JOptionPane.showConfirmDialog(null,"Thank you for using our system", "Logout", JOptionPane.YES_NO_OPTION);
							if (log ==0) {
								logout window = new logout();
								window.frame.setVisible(true);
								frame.dispose();
							}
					}
					else if (menu == 0) {
						JOptionPane.showMessageDialog(null,"Choose which user you want to use ", 
													"Help", JOptionPane.INFORMATION_MESSAGE);
			}
			}
		});
		btnNewButton_1.setBounds(81, 11, 40, 40);
		btnNewButton_1.setFocusable(false);
		ImageIcon menu = new ImageIcon(this.getClass().getResource("menubutton.png"));
		btnNewButton_1.setIcon(menu);
		panel.add(btnNewButton_1);
		
		
		JLabel lblNewLabel = new JLabel("");
		ImageIcon mode = new ImageIcon(this.getClass().getResource("final logo.png"));
		lblNewLabel.setIcon(mode);
		lblNewLabel.setBounds(302, 161, 116, 116);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Welcome to");
		lblNewLabel_1.setFont(new Font("Modern No. 20", Font.BOLD, 41));
		lblNewLabel_1.setBounds(256, 109, 203, 41);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Please Select a User");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2.setBounds(280, 348, 157, 21);
		frame.getContentPane().add(lblNewLabel_2);
		
		JButton btnNewButton_2 = new JButton("ADMIN");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				admin window = new admin();
				window.frame.setVisible(true);
				frame.dispose();
			}
		});
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_2.setBackground(new Color(128, 0, 0));
		btnNewButton_2.setForeground(new Color(255, 255, 255));
		btnNewButton_2.setBounds(67, 393, 151, 36);
		btnNewButton_2.setFocusable(false);
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("STUDENT");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				studentinfo window = new studentinfo();
				window.frame.setVisible(true);
				frame.dispose();
			}
		});
		btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_3.setBackground(new Color(128, 0, 0));
		btnNewButton_3.setForeground(new Color(255, 255, 255));
		btnNewButton_3.setBounds(280, 393, 151, 36);
		btnNewButton_3.setFocusable(false);
		frame.getContentPane().add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("TEACHER");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				teacher window = new teacher();
				window.frame.setVisible(true);
				frame.dispose();
			}
		});
		btnNewButton_4.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_4.setBackground(new Color(128, 0, 0));
		btnNewButton_4.setForeground(new Color(255, 255, 255));
		btnNewButton_4.setBounds(503, 393, 140, 36);
		btnNewButton_4.setFocusable(false);
		frame.getContentPane().add(btnNewButton_4);
	}
}
