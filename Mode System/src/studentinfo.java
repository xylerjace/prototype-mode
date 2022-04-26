import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class studentinfo {

	JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					studentinfo window = new studentinfo();
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
	public studentinfo() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 255, 255));
		frame.setBounds(100, 100, 701, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setLocationRelativeTo(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(128, 0, 0));
		panel.setBounds(0, 0, 685, 64);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Homepage window = new Homepage();
				window.frame.setVisible(true);
				frame.dispose();
			}
		});
		btnNewButton.setBounds(10, 11, 40, 40);
		ImageIcon arrow = new ImageIcon(this.getClass().getResource("backarrow.png"));
		btnNewButton.setIcon(arrow);
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("");
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
						JOptionPane.showMessageDialog(null,"Input the asked requirements to have an account ", 
													"Help", JOptionPane.INFORMATION_MESSAGE);
			}
			}
		});
		btnNewButton_1.setBounds(70, 11, 40, 40);
		ImageIcon menu = new ImageIcon(this.getClass().getResource("menubutton.png"));
		btnNewButton_1.setIcon(menu);
		panel.add(btnNewButton_1);
		
		JLabel lblNewLabel = new JLabel("STUDENT");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel.setBounds(285, 22, 216, 29);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		ImageIcon mode = new ImageIcon(this.getClass().getResource("final logo.png"));
		lblNewLabel_1.setIcon(mode);
		lblNewLabel_1.setBounds(582, 71, 103, 100);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		ImageIcon phinma = new ImageIcon(this.getClass().getResource("phinmaed.png"));
		lblNewLabel_2.setIcon(phinma);
		lblNewLabel_2.setBounds(23, 86, 173, 64);
		frame.getContentPane().add(lblNewLabel_2);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(211, 211, 211));
		panel_1.setBounds(0, 180, 685, 200);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(135, 26, 147, 20);
		panel_1.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(135, 85, 147, 20);
		panel_1.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(135, 147, 147, 20);
		panel_1.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(516, 26, 139, 20);
		panel_1.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(516, 85, 139, 20);
		panel_1.add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setBounds(516, 147, 139, 20);
		panel_1.add(textField_5);
		textField_5.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("STUDENT NAME");
		lblNewLabel_3.setFont(new Font("SansSerif", Font.BOLD | Font.ITALIC, 14));
		lblNewLabel_3.setBounds(10, 25, 115, 18);
		panel_1.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("STUDENT ID NUM");
		lblNewLabel_4.setFont(new Font("SansSerif", Font.BOLD | Font.ITALIC, 14));
		lblNewLabel_4.setBounds(10, 85, 131, 17);
		panel_1.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("SEMESTER");
		lblNewLabel_5.setFont(new Font("SansSerif", Font.BOLD | Font.ITALIC, 14));
		lblNewLabel_5.setBounds(10, 147, 115, 17);
		panel_1.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("GRADE AND SECTION");
		lblNewLabel_6.setFont(new Font("SansSerif", Font.BOLD | Font.ITALIC, 14));
		lblNewLabel_6.setBounds(343, 26, 147, 17);
		panel_1.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("STRAND/COURSE");
		lblNewLabel_7.setFont(new Font("SansSerif", Font.BOLD | Font.ITALIC, 14));
		lblNewLabel_7.setBounds(343, 76, 147, 35);
		panel_1.add(lblNewLabel_7);
		
		JLabel lblNewLabel_9 = new JLabel("SCHOOL YEAR");
		lblNewLabel_9.setFont(new Font("SansSerif", Font.BOLD | Font.ITALIC, 14));
		lblNewLabel_9.setBounds(343, 138, 115, 35);
		panel_1.add(lblNewLabel_9);
		
		JButton btnNewButton_2 = new JButton("Save");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				student window = new student();
				window.frame.setVisible(true);
				frame.dispose();
			}
		});
		btnNewButton_2.setBackground(new Color(128, 0, 0));
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_2.setForeground(new Color(255, 255, 255));
		btnNewButton_2.setBounds(534, 412, 127, 38);
		frame.getContentPane().add(btnNewButton_2);
		
		JLabel lblNewLabel_8 = new JLabel("SCHOOL YEAR");
		lblNewLabel_8.setBounds(302, 319, 131, 35);
		frame.getContentPane().add(lblNewLabel_8);
		
		JButton btnNewButton_3 = new JButton("SKIP");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				student window = new student();
				window.frame.setVisible(true);
				frame.dispose();
			}
		});
		btnNewButton_3.setBackground(new Color(128, 0, 0));
		btnNewButton_3.setForeground(new Color(255, 255, 255));
		btnNewButton_3.setFont(new Font("SansSerif", Font.BOLD, 14));
		btnNewButton_3.setBounds(46, 414, 102, 35);
		frame.getContentPane().add(btnNewButton_3);
		
		JLabel lblNewLabel_10 = new JLabel("Already have an account? ");
		lblNewLabel_10.setForeground(new Color(128, 128, 128));
		lblNewLabel_10.setFont(new Font("Tahoma", Font.PLAIN, 9));
		lblNewLabel_10.setBounds(36, 391, 125, 14);
		frame.getContentPane().add(lblNewLabel_10);
	
		
	}
}
