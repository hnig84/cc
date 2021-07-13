package Files;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Filter {
	public static void filtern(String eingabeDatei, String filterWort, String ausgabeDatei) {
		
		
	}

	public static void main(String[] args) throws FileNotFoundException {
		File file = new File("C:\\Users\\CC-Student\\Desktop\\new1.txt");
//		File newFile = new File("C:\\Users\\CC-Student\\Desktop\\new2.txt");
		
		Scanner fileScanner = new Scanner(file);
		
		while(fileScanner.hasNext()) {
		fileScanner.findInLine("vor");
		}
		fileScanner.close();
		
	}

}
