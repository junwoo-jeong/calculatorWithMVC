package calculatorWithMVC;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

public class CalculatorController implements ActionListener{
	CalculateModel cal;
	CalculatorView f;
	
	public CalculatorController(CalculatorView f) {
		this.f = f;
		cal = new CalculateModel();
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton btn = (JButton)e.getSource();
		switch(btn.getText()) {
			case "=" : 
				cal.setX(Double.parseDouble(f.answerField.getText()));
				cal.operand();
				f.answerField.setText(Double.toString(cal.getResult()));
				break;
			case "¡¾":
				f.calculusField2.setText("-" + f.answerField.getText());
				f.answerField.setText("-" + f.answerField.getText());
				break;
			case "C" :
				cal.clear();
				f.answerField.setText("");
				f.calculusField2.setText("");
				break;
			case "x©÷" :
				cal.setResult(Double.parseDouble(f.answerField.getText()));
				f.calculusField2.setText(cal.getResult() + "©÷");
				cal.pow();
				f.answerField.setText(Double.toString(cal.getResult()));
				break;
			case "cos" :
				cal.setResult(Double.parseDouble(f.answerField.getText()));
				f.calculusField2.setText("cos" + cal.getResult());
				cal.cos();
				f.answerField.setText(Double.toString(cal.getResult()));
				break;
			case "tan" :
				cal.setResult(Double.parseDouble(f.answerField.getText()));
				f.calculusField2.setText("tan" + cal.getResult());
				cal.tan();
				f.answerField.setText(Double.toString(cal.getResult()));
				break;
			case "sin" :
				cal.setResult(Double.parseDouble(f.answerField.getText()));
				cal.sin();
				f.calculusField2.setText(Double.toString(cal.getResult()));
				f.answerField.setText(Double.toString(cal.getResult()));
				break;
			case "Log" :
				cal.setResult(Double.parseDouble(f.answerField.getText()));
				cal.log();
				f.calculusField2.setText(Double.toString(cal.getResult()));
				f.answerField.setText(Double.toString(cal.getResult()));
				break;
			case "Exp" : 
				cal.setResult(Double.parseDouble(f.answerField.getText()));
				cal.exp();
				f.calculusField2.setText(Double.toString(cal.getResult()));
				f.answerField.setText(Double.toString(cal.getResult()));
				break;
			case "¡î" :
				cal.setResult(Double.parseDouble(f.answerField.getText()));
				cal.loot();
				f.calculusField2.setText(Double.toString(cal.getResult()));
				f.answerField.setText(Double.toString(cal.getResult()));
				break;
			case "+" :
			case "-" :
			case "/" :
			case "*" :
			case "%" :
				cal.setX(Double.parseDouble(f.answerField.getText()));
				cal.operand();
				cal.setOperator(btn.getText());
				f.calculusField2.setText(f.calculusField2.getText()+btn.getText());
				f.answerField.setText("");
				break;
			case "¡ç" :
				int lastIndex = f.answerField.getText().length()-1;
				String str ;
				if (lastIndex>=0) str = f.answerField.getText().substring(0, lastIndex);
				else str = "";
				f.answerField.setText(str);
				
				lastIndex = f.calculusField2.getText().length()-1;
				if (lastIndex>=0) str = f.calculusField2.getText().substring(0, lastIndex);
				else str = "";
				f.calculusField2.setText(str);
				break;
			default :
				f.calculusField2.setText(f.calculusField2.getText() + btn.getText());
				f.answerField.setText(f.answerField.getText() + btn.getText());
				break;
		}
	}
}
