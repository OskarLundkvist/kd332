package uppgift3;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class BikeStoreGUI extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		BikeStore.addBike("Poopbrown",10, 5);
		BikeStore.addBike("Red",1, 1345643234);
		BikeStore.addBike("Blue",25, 23536);
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BikeStoreGUI frame = new BikeStoreGUI();
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
	public BikeStoreGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		final JTextArea txtrpwrigkle = new JTextArea();
		txtrpwrigkle.setText(BikeStore.getAllBikes());
		txtrpwrigkle.setBounds(6, 6, 266, 266);
		contentPane.add(txtrpwrigkle);
		
		textField = new JTextField();
		textField.setBounds(284, 46, 134, 28);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("Add Bike");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				/** Takes the values in the textfields, adds them to the ArrayList, uppdates the textarea and resets the textfields */
				BikeStore.addBike(textField.getText(), Integer.parseInt(textField_1.getText()), Integer.parseInt(textField_2.getText()));
				txtrpwrigkle.setText(BikeStore.getAllBikes());
				textField.setText("");
				textField_1.setText("");
				textField_2.setText("");
				
			}
		});
		btnNewButton.setBounds(284, 243, 117, 29);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("Color");
		lblNewLabel.setBounds(284, 18, 61, 16);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Size");
		lblNewLabel_1.setBounds(284, 86, 61, 16);
		contentPane.add(lblNewLabel_1);
		
		textField_1 = new JTextField();
		textField_1.setBounds(284, 114, 134, 28);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Price");
		lblNewLabel_2.setBounds(284, 154, 61, 16);
		contentPane.add(lblNewLabel_2);
		
		textField_2 = new JTextField();
		textField_2.setBounds(284, 182, 134, 28);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
	}
}
