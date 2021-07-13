package schleifen;

import java.util.Scanner;

public class Schleife {
	int n,m;
	
	Scanner sc = new Scanner(System.in);
	
	public void summeWhile() {
		System.out.println("erste Zahl: ");
		n = sc.nextInt();
		int first = n;
		System.out.println("zweite Zahl: ");
		m = sc.nextInt();
		int summe = 0;
		while(n <= m) {
			summe = summe += n;
			n++;
		}
		System.out.println("Summe der Zahlen zwischen " + first + " und " + m + " ist: " + summe);
	}
	
	public void summeDoWhile() {
		System.out.println("erste Zahl: ");
		n = sc.nextInt();
		int first = n;
		System.out.println("zweite Zahl: ");
		m = sc.nextInt();
		int summe = 0;
		
		do {
			summe = summe += n;
			n++;
		}
		while(n <= m);
			System.out.println("Summe der Zahlen zwischen " + first + " und " + m + " ist: " + summe);	
	}
	
	public void summeFor() {
		System.out.println("erste Zahl: ");
		n = sc.nextInt();
		int first = n;
		System.out.println("zweite Zahl: ");
		m = sc.nextInt();
		int summe = 0;
		
		for(int i = n; i <= m; i++) {
			summe = summe += i; 
		}
		System.out.println("Summe der Zahlen zwischen " + first + " und " + m + " ist: " + summe);	
	}
	
	

	public static void main(String[] args) {
//		Schleife s = new Schleife();
//		s.summeWhile();
//		s.summeDoWhile();
//		s.summeFor();
//		Umrechner u = new Umrechner();
//		u.umrechnen();
		Baum baum = new Baum();
		baum.baumErzeugen();
//		Zahlennamen z = new Zahlennamen();
//		z.zahl = 6;
//		z.zerlegen();
//		z.bis99();
//		System.out.println(z.ausgabe());
	}

}
