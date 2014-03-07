import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.ArrayList;


public class HumanAndDogGUI extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private Human finn;
	private Dog jake;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HumanAndDogGUI frame = new HumanAndDogGUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public HumanAndDogGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 313, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblHumansDogs = new JLabel("Humans & Dogs");
		lblHumansDogs.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblHumansDogs.setBounds(84, 11, 115, 20);
		contentPane.add(lblHumansDogs);
		
		textField = new JTextField();
		textField.setBounds(9, 52, 120, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(9, 83, 120, 20);
		contentPane.add(textField_1);
		
		JButton btnNewButton = new JButton("New Human");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(textField.getText().length() < 3){
					textField_2.setText("");
					textField_2.setText("Too short! Write a name at least 3 letters long!");
				}else{
					finn = new Human(textField.getText());
					textField.setText("");
				}
			}
		});
		btnNewButton.setBounds(147, 51, 114, 23);
		contentPane.add(btnNewButton);
		
		JButton btnBuyDog = new JButton("Buy Dog");
		btnBuyDog.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(finn == null){
					textField_2.setText("");
					textField_2.setText("Can't buy a dog to no one, silly.");
				}else{
					finn.buyDog(jake = new Dog(textField_1.getText()));
					textField_1.setText("");
				}
			}
		});
		btnBuyDog.setBounds(146, 82, 115, 23);
		contentPane.add(btnBuyDog);
		
		JButton btnPrintInfo = new JButton("Print Info");
		btnPrintInfo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_2.setText("");
				textField_2.setText(finn.getInfo());
			}
		});
		btnPrintInfo.setBounds(147, 116, 115, 23);
		contentPane.add(btnPrintInfo);
		
		JLabel lblInfo = new JLabel("Info");
		lblInfo.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblInfo.setBounds(9, 166, 27, 14);
		contentPane.add(lblInfo);
		
		textField_2 = new JTextField();
		textField_2.setBounds(9, 184, 277, 53);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
	}
}
