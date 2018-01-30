package calculatorWithMVC;

import java.awt.*;
import java.awt.event.ActionListener;
import javax.swing.*;

public class CalculatorView extends JFrame{
	ActionListener calculator;
	
	JPanel panel1;
	JPanel panel2;
	JTextField answerField;
	JTextField calculusField2;
	JButton[] buttons;
	String[] labels = {
			"Log", "Exp", "¡î", "   ",
			"x©÷", "cos","tan","sin",
			"7", "8", "9", "+",
			"4", "5", "6", "-",
			"1", "2", "3", "*",
			"¡¾", "0", "=", "/",
			"C" , ".", "¡ç", "%"
	};
	
	
	public CalculatorView() {
		panel1 = new JPanel();
		panel2 = new JPanel();
		
		answerField = new JTextField(35);
		answerField.setDisabledTextColor(Color.BLACK);
		answerField.setFont(new Font("±Ã¼­Ã¼", Font.PLAIN, 36));
		answerField.setText("");
		answerField.setEnabled(false);
		
		calculusField2 = new JTextField(35);
		calculusField2.setDisabledTextColor(Color.BLACK);
		calculusField2.setFont(new Font("±Ã¼­Ã¼", Font.PLAIN, 36));
		calculusField2.setText("");
		calculusField2.setEnabled(false);
		
		panel1.setLayout(new GridLayout(0,1,3,3));
		panel1.add(calculusField2);
		panel1.add(answerField);
		calculator = new CalculatorController(this); 
		panel2.setLayout(new GridLayout(0,4,3,3));
		buttons = new JButton[28];
		
		int index = 0;

		for(int rows = 0 ; rows < 7 ; rows++) {
			for(int cols = 0 ; cols < 4 ; cols++) {
				buttons[index] = new JButton(labels[index]);
				buttons[index].addActionListener(calculator);
				if(cols >= 3 || rows <2) {
					buttons[index].setForeground(Color.RED);
				}
				else {
					buttons[index].setForeground(Color.blue);
				}
				panel2.add(buttons[index]);
				index++;
			}
		}
		add(panel1,BorderLayout.NORTH);
		add(panel2,BorderLayout.CENTER);
		this.setBounds(300, 300, 1000, 1000);
		setVisible(true);
		pack();
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
