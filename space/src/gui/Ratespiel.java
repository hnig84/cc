package gui;

import java.util.InputMismatchException;

import javax.swing.JOptionPane;

public class Ratespiel {
	private static int zufallsZahl, counter;
	private static int rateZahl;
	private static boolean again;
	// public static MyFrame frame = new MyFrame();
	
	
	public static void randomize() {
		zufallsZahl = (int) (Math.random() * 10 +1);
		
	}
	public static void zahlEingeben() throws NumberFormatException, InputMismatchException {
			
			try {
				rateZahl= Integer.parseInt(JOptionPane.showInputDialog(null, "Bitte ratezahl zwischen einschlieﬂlich 1 und 10 eingeben"));
			} catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "Nur Ziffern");
			}
		
			if(rateZahl < 1 && rateZahl > 10)
				throw new InputMismatchException();
			
				
			
	}
	public static void vergleichen() {
		String erfolg = "Richtig geraten!";
		String daneben = "Falsch!\nDie zu erratende Zahl war " + zufallsZahl + 
						 "\nDeine Zahl war " + rateZahl;
		
		if(rateZahl == zufallsZahl)
			JOptionPane.showMessageDialog(null, erfolg);
		else
			JOptionPane.showMessageDialog(null, daneben);
	}
	public static void spielen() {
		counter = 0;
		again = true;
		while (again) {
			
		
		randomize();
		zahlEingeben();
		vergleichen();
		int nochmal = JOptionPane.showOptionDialog(
				null, 
				"nochmal?", 
				null, 
				JOptionPane.YES_NO_OPTION, 
				JOptionPane.INFORMATION_MESSAGE, 
				null, 
				null, 
				null);
		if(nochmal == 0)
			again = true;
		else if(nochmal == 1)
		again = false;
		}
				
	}
		

	public static void main(String[] args) {
		
		spielen();
		

	}

}
