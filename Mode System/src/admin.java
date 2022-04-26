import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class admin {

	JFrame frame;
	private JTextField txtSearch;
	private JTable table;
	private JTextField txtSa;
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
					admin window = new admin();
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
	public admin() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 255, 255));
		frame.setBounds(100, 100, 703, 503);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setLocationRelativeTo(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(128, 0, 0));
		panel.setBounds(0, 0, 698, 60);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("ADMIN");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBounds(289, 11, 103, 38);
		panel.add(lblNewLabel);
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
						JOptionPane.showMessageDialog(null,"This page is used by admins of the school to track their students \n about their information and also about their status of the modules "
													+ "	\n use the search bar to navigate the students Id and the system will show \n to info about the student and click the search button ", 
													"Help", JOptionPane.INFORMATION_MESSAGE);
					}
			}
		});
		btnNewButton_1.setBounds(20, 11, 40, 40);
		ImageIcon menu = new ImageIcon(this.getClass().getResource("menubutton.png"));
		btnNewButton_1.setIcon(menu);
		btnNewButton_1.setFocusable(false);
		panel.add(btnNewButton_1);
		
		txtSearch = new JTextField();
		txtSearch.setBackground(new Color(211, 211, 211));
		txtSearch.setFont(new Font("Tahoma", Font.PLAIN, 17));
		txtSearch.setText("SEARCH");
		txtSearch.setBounds(22, 99, 248, 40);
		frame.getContentPane().add(txtSearch);
		txtSearch.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		ImageIcon mode = new ImageIcon(this.getClass().getResource("final logo.png"));
		lblNewLabel_1.setIcon(mode);
		lblNewLabel_1.setBounds(583, 71, 94, 100);
		frame.getContentPane().add(lblNewLabel_1);
		
		JButton btnNewButton_2 = new JButton("");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Menupanel panel = new Menupanel();
				panel.setVisible(true);
			}
		});
		btnNewButton_2.setBounds(270, 99, 40, 40);
		ImageIcon search = new ImageIcon(this.getClass().getResource("search.png"));
		btnNewButton_2.setIcon(search);
		btnNewButton_2.setFocusable(false);
		frame.getContentPane().add(btnNewButton_2);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(211, 211, 211));
		panel_1.setBounds(0, 182, 698, 68);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("Student Name");
		lblNewLabel_2.setFont(new Font("SansSerif", Font.BOLD, 12));
		lblNewLabel_2.setBounds(23, 11, 87, 14);
		panel_1.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Student ID number");
		lblNewLabel_3.setFont(new Font("SansSerif", Font.BOLD, 12));
		lblNewLabel_3.setBounds(20, 43, 108, 14);
		panel_1.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Strand/Course");
		lblNewLabel_4.setFont(new Font("SansSerif", Font.BOLD, 12));
		lblNewLabel_4.setBounds(269, 11, 87, 14);
		panel_1.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Semester");
		lblNewLabel_5.setFont(new Font("SansSerif", Font.BOLD, 12));
		lblNewLabel_5.setBounds(279, 43, 87, 14);
		panel_1.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Grade & Section");
		lblNewLabel_6.setFont(new Font("SansSerif", Font.BOLD, 12));
		lblNewLabel_6.setBounds(485, 11, 108, 14);
		panel_1.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("School Year");
		lblNewLabel_7.setFont(new Font("SansSerif", Font.BOLD, 12));
		lblNewLabel_7.setBounds(485, 44, 94, 14);
		panel_1.add(lblNewLabel_7);
		
		txtSa = new JTextField();
		txtSa.setEditable(false);
		txtSa.setBackground(new Color(211, 211, 211));
		txtSa.setFocusable(false);
		txtSa.setBounds(133, 9, 114, 20);
		panel_1.add(txtSa);
		txtSa.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setEditable(false);
		textField_1.setBackground(new Color(211, 211, 211));
		textField_1.setBounds(133, 41, 114, 20);
		textField_1.setFocusable(false);
		panel_1.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setEditable(false);
		textField_2.setBackground(new Color(211, 211, 211));
		textField_2.setBounds(366, 9, 98, 20);
		textField_2.setFocusable(false);
		panel_1.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setEditable(false);
		textField_3.setBackground(new Color(211, 211, 211));
		textField_3.setBounds(366, 41, 98, 20);
		textField_3.setFocusable(false);
		panel_1.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setEditable(false);
		textField_4.setBackground(new Color(211, 211, 211));
		textField_4.setBounds(578, 9, 98, 20);
		textField_4.setFocusable(false);
		panel_1.add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setEditable(false);
		textField_5.setBackground(new Color(211, 211, 211));
		textField_5.setBounds(578, 41, 97, 20);
		textField_5.setFocusable(false);
		panel_1.add(textField_5);
		textField_5.setColumns(10);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 282, 698, 182);
		frame.getContentPane().add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(128, 0, 0));
		panel_2.setBounds(0, 247, 698, 24);
		frame.getContentPane().add(panel_2);
		
		JLabel lblNewLabel_8 = new JLabel("ENTER STUDENT ID");
		lblNewLabel_8.setForeground(new Color(128, 128, 128));
		lblNewLabel_8.setFont(new Font("Tahoma", Font.PLAIN, 9));
		lblNewLabel_8.setBounds(85, 84, 94, 14);
		frame.getContentPane().add(lblNewLabel_8);
	}
}
