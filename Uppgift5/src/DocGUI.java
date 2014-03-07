import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.io.File;
import java.util.ArrayList;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.JTextField;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;


public class DocGUI extends JFrame {

	private JPanel contentPane;
	private Document doc;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DocGUI frame = new DocGUI();
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
	public DocGUI() {
		doc = openXmlFile("ht2013_antagning.xml");
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JList list = new JList();
		list.setModel(new AbstractListModel() {
			String[] values = new String[] {"Första elementet (rooten): " + doc.getFirstChild().getNodeName(), "Antal program: " + loadAllPrograms().size()};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		list.setBounds(10, 11, 414, 38);
		contentPane.add(list);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(loadAllPrograms().toArray()));
		comboBox.setBounds(10, 60, 414, 20);
		contentPane.add(comboBox);
	}
	
	/**
	 * * Opens the given XML file as DOM. * * @param fileName * The filename of
	 * the XML file (make sure to copy this to your Eclipse project) * @return
	 * A Document instance containing the given XML file.
	 */
	private Document openXmlFile(String fileName) {
		Document doc = null;
		try {
			File fXmlFile = new File(fileName);
			DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
			doc = dBuilder.parse(fXmlFile);
			doc.getDocumentElement().normalize();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return doc;
	}
	
	private ArrayList<Program> loadAllPrograms() {
		ArrayList<Program> output = new ArrayList<Program>();
		
		// Hämta alla program 
		NodeList programs = doc.getElementsByTagName("Program"); 
		for (int i = 0; i < programs.getLength(); i++) {
			
			// Gör om varje nod i listan till ett element 
			Node node = programs.item(i); 
			Element elm = (Element) node;
			
			// Hämta data från elementet 
			String name = elm.getElementsByTagName("name").item(0).getTextContent(); 
			String code = elm.getElementsByTagName("code").item(0).getTextContent();
			int women = Integer.parseInt(elm.getElementsByTagName("women").item(0).getTextContent());
			int men = Integer.parseInt(elm.getElementsByTagName("men").item(0).getTextContent());
			// Gör detta för alla fyra olika data! (namn, kod, antal kvinnor, antal män)
					
			// // Skapa programmet och lägg till i listan 
			Program program = new Program(name, code, women, men); output.add(program); }
		return output;
	}
}
