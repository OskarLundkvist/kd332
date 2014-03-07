import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextArea;


public class ZooGUI extends JFrame {

	private JPanel contentPane;
	private ArrayList<Animal> animalList = new ArrayList<Animal>();
	private Snake börje;
	private Dog gunnar;
	private Cat misse;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ZooGUI frame = new ZooGUI();
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
	public ZooGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblAnimallist = new JLabel("Animallist");
		lblAnimallist.setBounds(10, 11, 96, 14);
		contentPane.add(lblAnimallist);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(10, 36, 414, 214);
		contentPane.add(textArea);
		
		animalList.add(new Snake("Snok",25));
		animalList.add(new Dog("Sankt Bernard",true,5));
		animalList.add(new Cat("Siberian",true,"supercute"));
		animalList.add(new Dog("Schäfer",true,4));
		animalList.add(new Cat("Devon Rex",false,"cutsie"));
		animalList.add(new Snake("Boaorm",374));
		
		for(Animal A: animalList){
			textArea.append(A.getInfo() + "\n" );
		}
	}
}
