import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JMenu;
import javax.swing.JTable;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JList;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.table.*;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.TextField;
import java.awt.Font;
import javax.swing.ListSelectionModel;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class Uppgift1 extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JTextField txtGranGransson;
	private JTextField textField;
	private JTextField txtGransgatan;
	private JTextField textField_2;
	private JTextField txtGorangoranssonhotmalecom;
	private JTable table_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Uppgift1 frame = new Uppgift1();
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
	public Uppgift1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 708, 458);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnArkiv = new JMenu("Arkiv");
		menuBar.add(mnArkiv);
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("Skriv ut");
		mnArkiv.add(mntmNewMenuItem_2);
		
		JMenuItem mntmAvsluta = new JMenuItem("Avsluta");
		mnArkiv.add(mntmAvsluta);
		
		JMenu mnMedlem = new JMenu("Medlem");
		menuBar.add(mnMedlem);
		
		JMenuItem mntmNyMedlem = new JMenuItem("Ny medlem");
		mnMedlem.add(mntmNyMedlem);
		
		JMenuItem mntmHittaMedlem = new JMenuItem("Hitta medlem");
		mnMedlem.add(mntmHittaMedlem);
		
		JMenu mnHjlp = new JMenu("Hj\u00E4lp");
		menuBar.add(mnHjlp);
		
		JMenuItem mntmHjlp = new JMenuItem("Hj\u00E4lp");
		mnHjlp.add(mntmHjlp);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Om programmet");
		mnHjlp.add(mntmNewMenuItem);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(248, 6, 454, 402);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblDetaljvy = new JLabel("DETALJVY");
		lblDetaljvy.setFont(new Font("Helvetica", Font.BOLD, 20));
		lblDetaljvy.setBounds(6, 6, 170, 48);
		panel_1.add(lblDetaljvy);
		
		JLabel lblNamn = new JLabel("Namn");
		lblNamn.setFont(new Font("Helvetica", Font.BOLD, 14));
		lblNamn.setBounds(6, 64, 61, 16);
		panel_1.add(lblNamn);
		
		JLabel lblPersonnummer = new JLabel("Personnummer");
		lblPersonnummer.setFont(new Font("Helvetica", Font.BOLD, 14));
		lblPersonnummer.setBounds(6, 95, 149, 16);
		panel_1.add(lblPersonnummer);
		
		JLabel lblAddress = new JLabel("Address");
		lblAddress.setFont(new Font("Helvetica", Font.BOLD, 14));
		lblAddress.setBounds(6, 123, 61, 16);
		panel_1.add(lblAddress);
		
		JLabel lblTelefonnummer = new JLabel("Telefonnummer");
		lblTelefonnummer.setFont(new Font("Helvetica", Font.BOLD, 14));
		lblTelefonnummer.setBounds(6, 151, 149, 16);
		panel_1.add(lblTelefonnummer);
		
		JLabel lblEpost = new JLabel("E-Post");
		lblEpost.setFont(new Font("Helvetica", Font.BOLD, 14));
		lblEpost.setBounds(6, 179, 61, 16);
		panel_1.add(lblEpost);
		
		JLabel lblBild = new JLabel("Bild");
		lblBild.setFont(new Font("Helvetica", Font.BOLD, 14));
		lblBild.setBounds(6, 207, 61, 16);
		panel_1.add(lblBild);
		
		txtGranGransson = new JTextField();
		txtGranGransson.setText("G\u00F6ran G\u00F6ransson");
		txtGranGransson.setBounds(165, 58, 220, 28);
		panel_1.add(txtGranGransson);
		txtGranGransson.setColumns(10);
		
		textField = new JTextField();
		textField.setText("19660606 6666");
		textField.setColumns(10);
		textField.setBounds(165, 88, 220, 28);
		panel_1.add(textField);
		
		txtGransgatan = new JTextField();
		txtGransgatan.setText("G\u00F6ransgatan 666");
		txtGransgatan.setColumns(10);
		txtGransgatan.setBounds(165, 116, 220, 28);
		panel_1.add(txtGransgatan);
		
		textField_2 = new JTextField();
		textField_2.setText("040 666 666 9");
		textField_2.setColumns(10);
		textField_2.setBounds(165, 144, 220, 28);
		panel_1.add(textField_2);
		
		txtGorangoranssonhotmalecom = new JTextField();
		txtGorangoranssonhotmalecom.setText("Goran.goransson@hotmale.com");
		txtGorangoranssonhotmalecom.setColumns(10);
		txtGorangoranssonhotmalecom.setBounds(165, 172, 220, 28);
		panel_1.add(txtGorangoranssonhotmalecom);
		
		JButton btnLggTillBild = new JButton("L\u00E4gg till bild");
		btnLggTillBild.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Lägger till en bild");
			}
		});
		btnLggTillBild.setFont(new Font("Helvetica", Font.PLAIN, 13));
		btnLggTillBild.setBounds(165, 314, 117, 29);
		panel_1.add(btnLggTillBild);
		
		JButton btnSparaProfil = new JButton("Spara profil");
		btnSparaProfil.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Sparar");
			}
		});
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 80, 114, 261);
		getContentPane().add(scrollPane);
		
		table_1 = new JTable();
		table_1.setShowHorizontalLines(false);
		table_1.setColumnSelectionAllowed(true);
		table_1.setCellSelectionEnabled(true);
		table_1.setFillsViewportHeight(true);
		table_1.setModel(new DefaultTableModel(
			new Object[][] {
				{"Anders Andersson"},
				{"B\u00F6rje B\u00F6rjesson"},
				{"Karl Karlsson"},
				{"Sven Svensson"},
			},
			new String[] {
				"Medlemmar"
			}
		));
		scrollPane.setColumnHeaderView(table_1);
		
		btnSparaProfil.setFont(new Font("Helvetica", Font.PLAIN, 13));
		btnSparaProfil.setBounds(331, 367, 117, 29);
		panel_1.add(btnSparaProfil);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(Uppgift1.class.getResource("/Bild/1hCO5G3.jpg")));
		lblNewLabel.setBounds(175, 207, 100, 100);
		panel_1.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(Uppgift1.class.getResource("/Bild/Poop.jpg")));
		lblNewLabel_1.setBounds(6, 6, 230, 402);
		contentPane.add(lblNewLabel_1);
	}

	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
	}
}
