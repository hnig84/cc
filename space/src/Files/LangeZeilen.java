package Files;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class LangeZeilen {
	public static File datei;
	public static int laenge;
	//public static File file1 = new File("C:\\Users\\CC-Student\\Desktop\\new1.txt");
	
	public static void zeilen(int n, File file) throws FileNotFoundException{
		Scanner fileScanner = new Scanner(file);
		int counter = 0;
		while(fileScanner.hasNext()) {
	
			String tmp = fileScanner.nextLine();
			if(tmp.length()>n) {
				counter++;
			}
			
		}
		System.out.println("Die Datei " + datei.getName() + "(" + datei + ")" + " enthält " + counter + " Zeilen, die länger als " + n + " Zeichen sind.");
		fileScanner.close();
	}
	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(System.in);
		

		System.out.println("Welche Datei soll verwendet werden? ");
		datei = new File(sc.next());
	
		
		System.out.println("Auf welche Zeilenlänge soll überprüft werden? ");
		try {
			laenge = sc.nextInt();
		} catch (InputMismatchException e) {
			System.out.println("Ganze Zahl eingeben");
		}
		sc.close();
		LangeZeilen.zeilen(laenge, datei);
		
		
	}

}
