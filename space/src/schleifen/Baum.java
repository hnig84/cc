package schleifen;

import java.util.Scanner;

public class Baum {
	public Scanner sc = new Scanner(System.in);
	int height;
	
	public void input() {
		System.out.println("Wie hoch? ");
		height = sc.nextInt();
		
		String left, right;
		for(int i = 0; i <= height; i++) {
			
		}
	}
	public String leerStringErzeugen() {
		String tmp = "";
			for(int i = 1; i < height; i++) {
			tmp += " ";
		}
			return tmp;
	}
	
	public void baumErzeugen() {
		input();
		String leer = leerStringErzeugen();
		String sternchen = "*";
		
		for(int i = 0; i <= height-2; i++) {
			System.out.println(leer + sternchen);
			String tmp = leer.substring(0, leer.length()-1);
			leer = tmp;
			sternchen = sternchen + "**";
		}
		System.out.println(sternchen);
		System.out.println(leerStringErzeugen() + "#");
		System.out.println(leerStringErzeugen() + "#");
		
		
	}

}
