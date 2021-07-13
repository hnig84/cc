package taschenrechner;

import javax.swing.JOptionPane;

public class Rechner {

	private double first, last, result;
	private String operator;

	public Rechner(double first, double last, String operator) {
		super();
		this.first = first;
		this.last = last;
		this.operator = operator;
		
		switch(operator) {
		
		case "+": result = first + last; break;
		case "-": result = first - last; break;
		case "*": result = first * last; break;
		case "/": try {
			result = first / last; break;
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Div 0");
		}
		}
	}

	public double getFirst() {
		return first;
	}

	public void setFirst(double first) {
		this.first = first;
	}

	public double getLast() {
		return last;
	}

	public void setLast(double last) {
		this.last = last;
	}

	public String getResult() {
		return Double.toString(result);
	}

	public void setResult(double result) {
		this.result = result;
	}

	public String getOperator() {
		return operator;
	}

	public void setOperator(String operator) {
		this.operator = operator;
	}
	
	

}
