package exceptions;

import java.util.Scanner;

public class Exceptions {
	public String textField;
	public Scanner scanner = new Scanner(System.in);
	public static int dividend;
	public static int divisor;
	String operatoren[];
	public void input() {
		System.out.println("Division mit Ganzzahlen eingeben (bsp. 1:2)");
		textField = scanner.next();
		
	}
	public void read() throws IllegalArgumentException {
		
		
		operatoren = textField.split(":");
		if (operatoren[0].contentEquals("") || operatoren[1].contentEquals("")) {
			throw new IllegalArgumentException("Eingabe leer");		
		}
		
		dividend = Integer.parseInt(operatoren[0]);
		divisor = Integer.parseInt(operatoren[1]);
		
		}
			
		
	
	
	public double integerDivision(int dividend, int divisor) throws ArithmeticException {
		double quotient = 0;
		try {
			quotient = dividend / divisor;
		} catch (ArithmeticException e) {
			System.out.println("Die Division durch null ist nicht erlaubt");
			
		}
			
		return quotient;
	}

	public static void main(String[] args) {
		Exceptions division = new Exceptions();
		division.input();
		division.read();
		System.out.println(division.integerDivision(dividend, divisor));
		
	}

}
