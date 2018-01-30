package calculatorWithMVC;
import java.lang.Math;

public class CalculateModel {
	private double x;
	private double result;
	private String operator;
	
	
	public CalculateModel() {
		this.x = 0;
		this.operator = "";
		this.result = 0;
	}
	
	//"C"button : clear
	public void clear() {
		this.x = 0;
		this.operator = "";
		this.result = 0;
	}
		
	// "+", "-", "*", "/", "="Buttons
	public void operand() {
		if(result==0) { 
				result = x;
		}else {
			if(this.operator.equals("+")) {
				result += x;
			}else if(this.operator.equals("-")) {
				result -= x;
			}else if(this.operator.equals("/")) {
				result /= x;
			}else if(this.operator.equals("*")) {
				result *= x;
			}else
				result %= x;
		}
	}
	
	
	//"x©÷" button
	public void pow() {
		result = Math.pow(result, 2);
	}
	
	//"cos" button
	public void cos() {
		result = Math.cos(result);
	}
	
	//"tan" button
	public void tan() {
		result = Math.tan(result);
	}
	
	//"sin" button
	public void sin() {
		result = Math.sin(result);
	}
	
	//"¡î" button
	public void loot() {
		result = Math.sqrt(result);
	}
	
	//"Log" button
	public void log() {
		result = Math.log10(result);
	}
	
	//"Exp" button
	public void exp() {
		result = Math.exp(result);
	}
	
	//"Mod" button
	
	@Override
	public String toString() {
		return "CalculateModel [x=" + x + ", result=" + result + ", operator=" + operator + "]";
	}

	//getter and setter
	public void setX(double x) {
		this.x = x;
	}

	public void setOperator(String operator) {
		this.operator = operator;
	}

	public double getResult() {
		return result;
	}
	
	public void setResult(double result) {
		this.result = result;
	} 

}
