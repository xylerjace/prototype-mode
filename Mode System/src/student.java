import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.AbstractButton;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import com.toedter.calendar.JDateChooser;

public class student {

	JFrame frame;
	JTextField txtGhj;
	JTextField textField_1;
	JTextField textField_2;
	JTextField textField_3;
	JTextField textField_4;
	JTextField textField_5;
	JTextField textField_6;	
	teacher teach;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					student window = new student();
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
	public student() {
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
		panel.setBounds(0, 0, 685, 65);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		ImageIcon arrow = new ImageIcon(this.getClass().getResource("backarrow.png"));
		
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
						JOptionPane.showMessageDialog(null,"This page is for the students and they can use it \n to look for tasks and submit if they are done" 
														+ "Click the Done button if done submitting tasks", 
													"Help", JOptionPane.INFORMATION_MESSAGE);
					}
			}
		
		});
		ImageIcon menu = new ImageIcon(this.getClass().getResource("menubutton.png"));
		btnNewButton_1.setIcon(menu);
		btnNewButton_1.setBounds(10, 11, 40, 40);
		panel.add(btnNewButton_1);
		
		JLabel lblNewLabel = new JLabel("STUDENT");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("SansSerif", Font.BOLD, 30));
		lblNewLabel.setBounds(283, 11, 156, 40);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		ImageIcon mode = new ImageIcon(this.getClass().getResource("final logo.png"));
		lblNewLabel_1.setIcon(mode);
		lblNewLabel_1.setBounds(584, 76, 101, 111);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		ImageIcon phinma = new ImageIcon(this.getClass().getResource("phinmaed.png"));
		lblNewLabel_2.setIcon(phinma);
		lblNewLabel_2.setBounds(35, 84, 152, 57);
		frame.getContentPane().add(lblNewLabel_2);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(211, 211, 211));
		panel_1.setBounds(0, 197, 685, 33);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_3 = new JLabel("TASKS");
		lblNewLabel_3.setFont(new Font("SansSerif", Font.BOLD, 13));
		lblNewLabel_3.setBounds(223, 11, 46, 14);
		panel_1.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Due date");
		lblNewLabel_4.setFont(new Font("SansSerif", Font.BOLD, 13));
		lblNewLabel_4.setBounds(587, 11, 75, 14);
		panel_1.add(lblNewLabel_4);
		
		teach = new teacher();
		String text = teach.textField.getText();
		txtGhj = new JTextField();
		txtGhj.setBounds(10, 241, 403, 20);
		frame.getContentPane().add(txtGhj);
		txtGhj.setColumns(10);
		txtGhj.setText(teach.textField.getText());
		
		
		
		textField_1 = new JTextField();
		textField_1.setEditable(false);
		textField_1.setBounds(10, 272, 403, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setEditable(false);
		textField_2.setBounds(10, 303, 403, 20);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setEditable(false);
		textField_3.setBounds(10, 334, 403, 20);
		frame.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setEditable(false);
		textField_4.setBounds(10, 363, 403, 20);
		frame.getContentPane().add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setEditable(false);
		textField_5.setBounds(10, 394, 403, 20);
		frame.getContentPane().add(textField_5);
		textField_5.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setEditable(false);
		textField_6.setBounds(10, 425, 403, 20);
		frame.getContentPane().add(textField_6);
		textField_6.setColumns(10);
		
		JButton btnNewButton_2 = new JButton("DONE");
		btnNewButton_2.setFont(new Font("SansSerif", Font.BOLD, 13));
		btnNewButton_2.setBackground(new Color(0, 191, 255));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_2.setBounds(423, 241, 89, 23);
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("DONE");
		btnNewButton_3.setFont(new Font("SansSerif", Font.BOLD, 13));
		btnNewButton_3.setBackground(new Color(0, 191, 255));
		btnNewButton_3.setBounds(423, 271, 89, 23);
		frame.getContentPane().add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("DONE");
		btnNewButton_4.setFont(new Font("SansSerif", Font.BOLD, 13));
		btnNewButton_4.setBackground(new Color(0, 191, 255));
		btnNewButton_4.setBounds(423, 302, 89, 23);
		frame.getContentPane().add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("DONE");
		btnNewButton_5.setFont(new Font("SansSerif", Font.BOLD, 13));
		btnNewButton_5.setBackground(new Color(0, 191, 255));
		btnNewButton_5.setBounds(423, 333, 89, 23);
		frame.getContentPane().add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("DONE");
		btnNewButton_6.setFont(new Font("SansSerif", Font.BOLD, 13));
		btnNewButton_6.setBackground(new Color(0, 191, 255));
		btnNewButton_6.setBounds(423, 362, 89, 23);
		frame.getContentPane().add(btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton("DONE");
		btnNewButton_7.setFont(new Font("SansSerif", Font.BOLD, 13));
		btnNewButton_7.setBackground(new Color(0, 191, 255));
		btnNewButton_7.setBounds(423, 393, 89, 23);
		frame.getContentPane().add(btnNewButton_7);
		
		JButton btnNewButton_8 = new JButton("DONE");
		btnNewButton_8.setFont(new Font("SansSerif", Font.BOLD, 13));
		btnNewButton_8.setBackground(new Color(0, 191, 255));
		btnNewButton_8.setBounds(423, 424, 89, 23);
		frame.getContentPane().add(btnNewButton_8);
		
		JDateChooser dateChooser = new JDateChooser();
		dateChooser.setBounds(536, 241, 139, 20);
		frame.getContentPane().add(dateChooser);
		
		JDateChooser dateChooser_1 = new JDateChooser();
		dateChooser_1.setBounds(536, 272, 139, 20);
		frame.getContentPane().add(dateChooser_1);
		
		JDateChooser dateChooser_2 = new JDateChooser();
		dateChooser_2.setBounds(536, 303, 139, 20);
		frame.getContentPane().add(dateChooser_2);
		
		JDateChooser dateChooser_3 = new JDateChooser();
		dateChooser_3.setBounds(536, 334, 139, 20);
		frame.getContentPane().add(dateChooser_3);
		
		JDateChooser dateChooser_4 = new JDateChooser();
		dateChooser_4.setBounds(536, 363, 139, 20);
		frame.getContentPane().add(dateChooser_4);
		
		JDateChooser dateChooser_5 = new JDateChooser();
		dateChooser_5.setBounds(536, 394, 139, 20);
		frame.getContentPane().add(dateChooser_5);
		
		JDateChooser dateChooser_6 = new JDateChooser();
		dateChooser_6.setBounds(536, 425, 139, 20);
		frame.getContentPane().add(dateChooser_6);
	}

	
}