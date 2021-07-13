package enumerations;

import java.util.Scanner;

public class TestKaffee {
	public static int choice;
	public static String again;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		while(again == "y") {
		System.out.println("(1) Coffee or (2) Tickets?");
		Scanner sc= new Scanner(System.in);
		choice = sc.nextInt();
		
		if(choice == 1) {
			
		
		KaffeeAutomat KA = new KaffeeAutomat();
		System.out.println("===============================================================================");
		KA.chooseBev();
		System.out.println("===============================================================================");
		KA.coinInsert();
		}
		else {
			Fahrschein FS = new Fahrschein();
			System.out.println("===============================================================================");
			FS.chooseTicket();
			System.out.println("===============================================================================");
			FS.coinInsert();
		}
		System.out.println("Again? y/n");
		again = sc.next();
		} while(again == "y");
		
	}

}
