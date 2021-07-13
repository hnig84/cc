package schleifen;

import java.util.Scanner;

public class Umrechner {
	String currencyOriginName, currencyDestName;
	double ratio, currencyOriginValue, currencyDestValue;
	public Scanner sc = new Scanner(System.in);
	
	public void input() {
		System.out.println("Erste Währung (Name): ");
		currencyOriginName = sc.next();
		
		System.out.println("Zweite Währung (Name): ");
		currencyDestName = sc.next();
		
		System.out.println("Umrechnungskurs: ");
		ratio = sc.nextDouble();
		

	}
	public void umrechnen() {
		input();
		do {
			System.out.println("Betrag eingeben\n");
			currencyOriginValue = sc.nextDouble();
			currencyDestValue = currencyOriginValue * ratio;
			System.out.println("\n" + currencyOriginName + "\t" + currencyDestName);
			System.out.println(currencyOriginValue + "\t" + currencyDestValue);
			System.out.println("\nKurs: " + ratio);
		} while(currencyOriginValue != 0);
	}

}
