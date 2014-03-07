import java.awt.BorderLayout;
import java.awt.EventQueue;
 
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
 
 
public class CalculatorGUI extends JFrame {
 
        private JPanel contentPane;
        private JTextField textField;
        private Calculator calc;
 
        /**
         * Launch the application.
         */
        public static void main(String[] args) {
                EventQueue.invokeLater(new Runnable() {
                        public void run() {
                                try {
                                        CalculatorGUI frame = new CalculatorGUI();
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
        public CalculatorGUI() {
                setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                setBounds(100, 100, 450, 566);
                contentPane = new JPanel();
                contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
                setContentPane(contentPane);
                contentPane.setLayout(null);
               
                calc = new Calculator();
               
                textField = new JTextField();
                textField.setHorizontalAlignment(SwingConstants.RIGHT);
 
                textField.setFont(new Font("Tahoma", Font.PLAIN, 40));
                textField.setBounds(10, 11, 414, 64);
                contentPane.add(textField);
                textField.setColumns(10);
               
                JButton btnNewButton = new JButton("1");
                btnNewButton.addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent arg0) {
                                calc.numberButtonPressed(1);
                                int i = calc.getOperand();
                                textField.setText(String.valueOf(i));
                        }
                });
                btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 40));
                btnNewButton.setBounds(10, 86, 100, 100);
                contentPane.add(btnNewButton);
               
                JButton button = new JButton("2");
                button.addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent e) {
                                calc.numberButtonPressed(2);
                                int i = calc.getOperand();
                                textField.setText(String.valueOf(i));
                        }
                });
                button.setFont(new Font("Tahoma", Font.PLAIN, 40));
                button.setBounds(120, 86, 100, 100);
                contentPane.add(button);
               
                JButton button_1 = new JButton("3");
                button_1.addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent e) {
                                calc.numberButtonPressed(3);
                                int i = calc.getOperand();
                                textField.setText(String.valueOf(i));
                        }
                });
                button_1.setFont(new Font("Tahoma", Font.PLAIN, 40));
                button_1.setBounds(230, 86, 100, 100);
                contentPane.add(button_1);
               
                JButton button_2 = new JButton("4");
                button_2.addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent e) {
                                calc.numberButtonPressed(4);
                                int i = calc.getOperand();
                                textField.setText(String.valueOf(i));
                        }
                });
                button_2.setFont(new Font("Tahoma", Font.PLAIN, 40));
                button_2.setBounds(10, 197, 100, 100);
                contentPane.add(button_2);
               
                JButton button_3 = new JButton("5");
                button_3.addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent e) {
                                calc.numberButtonPressed(5);
                                int i = calc.getOperand();
                                textField.setText(String.valueOf(i));
                        }
                });
                button_3.setFont(new Font("Tahoma", Font.PLAIN, 40));
                button_3.setBounds(120, 197, 100, 100);
                contentPane.add(button_3);
               
                JButton button_4 = new JButton("6");
                button_4.addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent e) {
                                calc.numberButtonPressed(6);
                                int i = calc.getOperand();
                                textField.setText(String.valueOf(i));
                        }
                });
                button_4.setFont(new Font("Tahoma", Font.PLAIN, 40));
                button_4.setBounds(230, 197, 100, 100);
                contentPane.add(button_4);
               
                JButton button_5 = new JButton("7");
                button_5.addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent e) {
                                calc.numberButtonPressed(7);
                                int i = calc.getOperand();
                                textField.setText(String.valueOf(i));
                        }
                });
                button_5.setFont(new Font("Tahoma", Font.PLAIN, 40));
                button_5.setBounds(10, 308, 100, 100);
                contentPane.add(button_5);
               
                JButton button_6 = new JButton("8");
                button_6.addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent e) {
                                calc.numberButtonPressed(8);
                                int i = calc.getOperand();
                                textField.setText(String.valueOf(i));
                        }
                });
                button_6.setFont(new Font("Tahoma", Font.PLAIN, 40));
                button_6.setBounds(120, 308, 100, 100);
                contentPane.add(button_6);
               
                JButton button_7 = new JButton("9");
                button_7.addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent e) {
                                calc.numberButtonPressed(9);
                                int i = calc.getOperand();
                                textField.setText(String.valueOf(i));
                        }
                });
                button_7.setFont(new Font("Tahoma", Font.PLAIN, 40));
                button_7.setBounds(230, 308, 100, 100);
                contentPane.add(button_7);
               
                JButton button_8 = new JButton("0");
                button_8.addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent e) {
                                calc.numberButtonPressed(0);
                                int i = calc.getOperand();
                                textField.setText(String.valueOf(i));
                        }
                });
                button_8.setFont(new Font("Tahoma", Font.PLAIN, 40));
                button_8.setBounds(120, 419, 100, 100);
                contentPane.add(button_8);
               
                JButton button_9 = new JButton("+");
                button_9.addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent e) {
                                calc.plus();
                                String i = calc.getOperator();
                                textField.setText(i);
                        }
                });
                button_9.setFont(new Font("Tahoma", Font.PLAIN, 40));
                button_9.setBounds(340, 86, 80, 100);
                contentPane.add(button_9);
               
                JButton button_10 = new JButton("-");
                button_10.addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent e) {
                                calc.minus();
                                String i = calc.getOperator();
                                textField.setText(i);
                        }
                });
                button_10.setFont(new Font("Tahoma", Font.PLAIN, 40));
                button_10.setBounds(340, 197, 80, 100);
                contentPane.add(button_10);
               
                JButton button_11 = new JButton("*");
                button_11.addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent e) {
                                calc.mult();
                                String i = calc.getOperator();
                                textField.setText(i);
                        }
                });
                button_11.setFont(new Font("Tahoma", Font.PLAIN, 40));
                button_11.setBounds(340, 308, 80, 100);
                contentPane.add(button_11);
               
                JButton button_12 = new JButton("=");
                button_12.addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent e) {
                                calc.equals();
                                int i = calc.getResult();
                                textField.setText(String.valueOf(i));
                        }
                });
                button_12.setFont(new Font("Tahoma", Font.PLAIN, 40));
                button_12.setBounds(340, 419, 80, 100);
                contentPane.add(button_12);
               
                JButton btnX = new JButton("X");
                btnX.addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent e) {
                                calc.clear();
                                int i = calc.getOperand();
                                textField.setText(String.valueOf(i));
                        }
                });
                btnX.setFont(new Font("Tahoma", Font.PLAIN, 40));
                btnX.setBounds(10, 419, 100, 100);
                contentPane.add(btnX);
        }
       
        public void updateTextField() {
                textField.validate();
                textField.setText(calc.getResult() + "" + calc.getOperator() + "" + calc.getOperand());
        }
}