package enumerations;

import java.util.Scanner;

public class KaffeeAutomat {
	public int choice;
	
	public Kaffeesorten bev;
	
	public double change;
	
	public void chooseBev() {
		System.out.println("Hello, choose your beverage:");
		System.out.print("(1) " + Kaffeesorten.Kaffee + " ");
		System.out.printf("%.2f \t", Kaffeesorten.Kaffee.getPreis());
		System.out.print("(2) " + Kaffeesorten.Cappucino + " ");
		System.out.printf("%.2f \t", Kaffeesorten.Cappucino.getPreis());
		System.out.print("(3) " + Kaffeesorten.Espresso + " ");
		System.out.printf("%.2f \t", Kaffeesorten.Espresso.getPreis());
		System.out.println("\n");
		
		
		Scanner sc = new Scanner(System.in);
		choice = sc.nextInt();
		
		boolean flag= false;

		
			switch(choice) {
			case 1: Kaffeesorten kaffee = Kaffeesorten.Kaffee;
			bev = kaffee;
			break;
			case 2: Kaffeesorten capu = Kaffeesorten.Cappucino;
			bev = capu;
			break;
			case 3: Kaffeesorten espresso = Kaffeesorten.Espresso;
			bev = espresso;
			break;
			
			}
			
	}
		
	

	public void coinInsert() {
		int coin;
		double sum= 0;
		System.out.println(bev.toString() + " costs " + bev.getPreis() + " Euro");
		System.out.println("===============================================================================");
		System.out.println("Insert Coin:");
		System.out.println("(1) 1 Cent, (2) 2 Cent, (3) 5 Cent, (4) 10 Cent, (5) 20 Cent, (6) 50 Cent, (7) 1 Euro, (8) 2 Euro");
		
		do {
		Scanner sc = new Scanner(System.in);
		coin = sc.nextInt();
			switch(coin) {
			case 1: sum = sum + Muenzen.OneCent.getCents();
			break;
			case 2: sum = sum + Muenzen.TwoCent.getCents();
			break;
			case 3: sum = sum + Muenzen.FiveCent.getCents();
			break;
			case 4: sum = sum + Muenzen.TenCent.getCents();
			break;
			case 5: sum = sum + Muenzen.TwentyCent.getCents();
			break;
			case 6: sum = sum + Muenzen.FiftyCent.getCents();
			break;
			case 7: sum = sum + Muenzen.OneEuro.getCents();
			break;
			case 8: sum = sum + Muenzen.TwoEuro.getCents();
			break;
			}
			
		}while(sum <= bev.getPreis());
				
		if (sum > bev.getPreis()) {
			change = sum - bev.getPreis();
			
				System.out.printf("Your change is %.2f\nHere is your Beverage", change);
				changeMoney(change);
				
				
		}
			else {
				System.out.println("===============================================================================");
				System.out.println("Thank you - here is your Beverage");
				}
			
	
	}
	public static void changeMoney(double cm) {
		int count1=0, count2=0, count3=0, count4=0, count5=0, count6=0, count7=0, count8=0;
		
		while(cm >0) {
				if (cm>=Muenzen.TwoEuro.getCents()) {
					cm = cm - Muenzen.TwoEuro.getCents();
					count8++;
					

				}
				else if (cm>=Muenzen.OneEuro.getCents()) {
					cm = cm - Muenzen.OneEuro.getCents();
					count7++;
					
				}
				else if (cm>=Muenzen.FiftyCent.getCents()) {
					cm = cm - Muenzen.FiftyCent.getCents();
					count6++;
					
				}
				else if (cm>=Muenzen.TwentyCent.getCents()) {
					cm = cm - Muenzen.TwentyCent.getCents();
					count5++;
					
				}
				else if (cm>=Muenzen.TenCent.getCents()) {
					cm = cm - Muenzen.TenCent.getCents();
					count4++;
					
				}
				else if (cm>=Muenzen.FiveCent.getCents()) {
					cm = cm - Muenzen.FiveCent.getCents();
					count3++;
					
				}
				else if (cm>=Muenzen.TwoCent.getCents()) {
					cm = cm - Muenzen.TwoCent.getCents();
					count2++;
					
				}
				else if (cm>=Muenzen.OneCent.getCents()) {
					cm = cm - Muenzen.OneCent.getCents();
					count1++; 
					
				}
				else break;
				
				
	}
		System.out.println("Rückgeld: ");
		System.out.println(count8 + " x 2 Euro");
		System.out.println(count7 + " x 1 Euro");
		System.out.println(count6 + " x 50 Cent");
		System.out.println(count5 + " x 20 Cent");
		System.out.println(count4 + " x 10 Cent");
		System.out.println(count3 + " x 5 Cent");
		System.out.println(count2 + " x 2 Cent");
		System.out.println(count1 + " x 1 Cent");
	
	}
	}
