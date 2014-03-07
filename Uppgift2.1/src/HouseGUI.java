import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTextField;

import java.awt.Font;

import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.JScrollPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class HouseGUI extends JFrame {

	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HouseGUI frame = new HouseGUI();
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
	public HouseGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(41, 36, 348, 192);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.setFillsViewportHeight(true);
		table.setCellSelectionEnabled(true);
		table.setColumnSelectionAllowed(true);

		scrollPane.setColumnHeaderView(table);
		
		House house0 = new House(1992,60);
		House house1 = new House(1945,104);
		House house2 = new House(1966,95);
		
		House houseArray[] = new House[10];
		houseArray[0] = house0;
		houseArray[1] = house1;
		houseArray[2] = house2;
		
		int houses = House.getNbrHouses();
		
		String houzez[] = new String[houses];
		
		for(int count = 0; count < houses; count++){
			houzez[count] = new String("Ett hus byggt " + houseArray[count].getYear() + " som ar " + houseArray[count].getSize() + " kvm stort.");
		}
		table.setModel(new DefaultTableModel(
				new Object[][] {
					{houzez[0]},
					{houzez[1]},
					{houzez[2]},
					{"Det finns totalt " + houses + " stycken hus."},
					{null},
					{null},
					{null},
					{null},
					{null},
					{null},
				},
				new String[] {
					"Houses"
				}
			));
	}
}