package taschenrechner;

import java.awt.Color;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public  class Tastenfeld extends JPanel {
	
	public Tastenfeld() {
		keypad = initialize();
		
	}
	
	private String keyValue = "";
	private double calcNumber = 0;
	private double calcNumber2 = 0;
	private String operator = "";
	private JPanel keypad = new JPanel();
	
	
	public double getCalcNumber() {
		return calcNumber;
	}

	public void setCalcNumber(int calcNumber) {
		this.calcNumber = calcNumber;
	}

	public String getOperator() {
		return operator;
	}

	public void setOperator(String operator) {
		this.operator = operator;
	}

	public String getKeyValue() {
		return keyValue;
	}

	public void setKeyValue(String keyValue) {
		this.keyValue = keyValue;
	}

	public JPanel getKeypad() {
		return keypad;
	}

	public void setKeypad(JPanel keypad) {
		this.keypad = keypad;
	}
	
	
	public double getCalcNumber2() {
		return calcNumber2;
	}

	public void setCalcNumber2(double calcNumber2) {
		this.calcNumber2 = calcNumber2;
	}

	public JPanel initialize() {
		MyButton[] numbers = new MyButton[10];{
			for (int i = 0; i <=9; i++) {
				numbers[i] = new MyButton(Integer.toString(i));
				
				
				
				
			}
			for (MyButton button : numbers) {
				button.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						keyValue += button.getText();
						CalculatorApp.screenPanel.setText(keyValue);
					}
				});
				
			}
			
			}
		
			MyButton plus = new MyButton("+");	
				plus.addActionListener(new ActionListener() {
				
				public void actionPerformed(ActionEvent e) {
					calcNumber += Double.parseDouble(keyValue);
					keyValue = "";
					operator = "+";
					CalculatorApp.screenPanel.setText(operator);
					
					
				}
			});
			MyButton minus = new MyButton("-");	
				minus.addActionListener(new ActionListener() {
				
				public void actionPerformed(ActionEvent e) {
					calcNumber -= Double.parseDouble(keyValue);
					keyValue = "";
					operator = "-";
					CalculatorApp.screenPanel.setText(operator);
					
					
				}
			});
			
			MyButton mult = new MyButton("X");
				mult.addActionListener(new ActionListener() {
				
				public void actionPerformed(ActionEvent e) {
					calcNumber = Double.parseDouble(keyValue);
					keyValue = "";
					operator = "*";
					CalculatorApp.screenPanel.setText(operator);
					
					
				}
			});
			
			MyButton div = new MyButton("/");
				div.addActionListener(new ActionListener() {
				
				public void actionPerformed(ActionEvent e) {
					calcNumber = Double.parseDouble(keyValue);
					keyValue = "";
					operator = "/";
					CalculatorApp.screenPanel.setText(operator);
					
					
				}
			});
			
			MyButton equals = new MyButton("=");
			equals.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					calcNumber2 = Double.parseDouble(keyValue);
					Rechner r = new Rechner(calcNumber, calcNumber2, operator);
					CalculatorApp.screenPanel.setText(r.getResult());
					calcNumber = Double.parseDouble(r.getResult());
					
				}
			});
			
			MyButton komma = new MyButton(",");
			komma.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					if(keyValue.contains(".")) {
						JOptionPane.showMessageDialog(null, "Eingabefehler");
					}
					else
					keyValue += ".";
					CalculatorApp.screenPanel.setText(keyValue);
					
				}
			});
	
			

	keypad.setLayout(new GridLayout(4,4));
	keypad.add(numbers[7]);
	keypad.add(numbers[8]);
	keypad.add(numbers[9]);
	keypad.add(div);
	keypad.add(numbers[4]);
	keypad.add(numbers[5]);
	keypad.add(numbers[6]);
	keypad.add(mult);
	keypad.add(numbers[1]);
	keypad.add(numbers[2]);
	keypad.add(numbers[3]);
	keypad.add(minus);
	keypad.add(numbers[0]);
	keypad.add(komma);
	keypad.add(equals);
	keypad.add(plus);
	
	return keypad;
	
	
		
	}
}

	
	
	
	
