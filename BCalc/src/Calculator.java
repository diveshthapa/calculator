import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Calculator extends JFrame {
	private static final long serialVersionUID = 1L;
	//private JPanel buttonPanel;
	private static final int DEFAULT_WIDTH = 330;
	private static final int DEFAULT_HEIGHT = 370;
	
	public static void main(String args[]){  
		new Calculator(); 
	}
	
	public Calculator() {
		setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//create title label
		JLabel la = new JLabel("Basic Calculator");
		la.setFont(new Font("Arial", Font.BOLD, 20));
		la.setForeground(Color.gray);
		la.setBounds(85, 10, 280, 30);
		
		//create length of the textfield
		JTextField fField = new JTextField(80);
		JTextField sField = new JTextField(80);
		
		// create icon buttons
		/*final ImageIcon createImageIcon(String path, String description){
		//java.net.URL imgURL = Calculator.class.getResource(path);
		
		ImageIcon icon = createImageIcon("E:\\6th sem\\Advance Java\\equal.png", " Result");
		JLabel result = new JLabel("Result :", icon, JLabel.CENTER);
		result.setVerticalTextPosition(JLabel.BOTTOM);
		result.setHorizontalTextPosition(JLabel.CENTER);*/
		JLabel result = new JLabel("Result :");
		
		JButton add = new JButton("Add");
		JButton sub = new JButton("Sub");
		JButton mul = new JButton("Mul");
		JButton div = new JButton("Div");
		
		//setting boundaries for text filed
		fField.setBounds(100, 60, 125, 30);
		fField.setToolTipText("Enter Your First Number");
		sField.setBounds(100, 100, 125, 30);
		sField.setToolTipText("Enter Your Second Number");
		
		//setting boundaries for buttons
		add.setBounds(100, 140, 60, 30);
		sub.setBounds(167, 140, 60, 30);
		mul.setBounds(100, 187, 60, 30);
		div.setBounds(167, 187, 60, 30);
		result.setBounds(170, 190, 60, 12);
		
		// add buttons to panel
		add(la);
		//add(icon);
		add(fField);
		add(sField);
		add(add);
		add(sub);
		add(mul);
		add(div);
		add(result);

		//Event Handling
		add.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				int no1 = Integer.parseInt(fField.getText());
				int no2 = Integer.parseInt(sField.getText());
				result.setText("Sum of two numbers = "+(no1+no2));
				}
			});
		
		sub.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				int no1 = Integer.parseInt(fField.getText());
				int no2 = Integer.parseInt(sField.getText());
				result.setText("Subtract of two numbers = "+(no1-no2));
			}
		});
		
		mul.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				int no1 = Integer.parseInt(fField.getText());
				int no2 = Integer.parseInt(sField.getText());
				result.setText("Multiply of two numbers = "+(no1*no2));
			}
		});
		
		div.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				int no1 = Integer.parseInt(fField.getText());
				int no2 = Integer.parseInt(sField.getText());
				result.setText("Divide of two numbers = "+(no1/no2));
			}
		});
	}
 // }

	/*private ImageIcon createImageIcon(String string, String string2) {
		// TODO Auto-generated method stub
		return null;
	}*/
}	
