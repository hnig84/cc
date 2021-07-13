package enumerations;


import java.util.Scanner;

public class Fahrschein {
public int choice;
	
	public Preisstufen ps;
	
	public double change;
	
	public void chooseTicket() {
		System.out.println("Hello, choose your Ticket:");
		System.out.print("(1) " + Preisstufen.K + " ");
		System.out.printf("%.2f \t", Preisstufen.K.getPreis());
		System.out.print("(2) " + Preisstufen.A + " ");
		System.out.printf("%.2f \t", Preisstufen.A.getPreis());
		System.out.print("(3) " +Preisstufen.B + " ");
		System.out.printf("%.2f \t", Preisstufen.B.getPreis());
		System.out.print("(4) " + Preisstufen.C + " ");
		System.out.printf("%.2f \t", Preisstufen.C.getPreis());
		System.out.print("(5) " + Preisstufen.D + " ");
		System.out.printf("%.2f \t", Preisstufen.D.getPreis());
		System.out.println("\n");
		
		
		Scanner sc = new Scanner(System.in);
		choice = sc.nextInt();
		
		

		
			switch(choice) {
			case 1: Preisstufen K = Preisstufen.K;
			ps = K;
			break;
			case 2: Preisstufen A = Preisstufen.A;
			ps = A;
			break;
			case 3: Preisstufen B = Preisstufen.B;
			ps = B;
			break;
			case 4: Preisstufen C = Preisstufen.C;
			ps = C;
			break;
			case 5: Preisstufen D = Preisstufen.D;
			ps = D;
			break;
			}
			
	}
	
	public void coinInsert() {
		String money;
		double sum= 0;
		System.out.println(ps.toString()+ " costs " + ps.getPreis() + " Euro");
		System.out.println("===============================================================================");
		System.out.println("Insert Coin:");
		System.out.println("(1) 1 Cent, (2) 2 Cent, (3) 5 Cent, (4) 10 Cent, (5) 20 Cent, (6) 50 Cent, (7) 1 Euro, (8) 2 Euro");
		System.out.println("Insert bill:");
		System.out.println("(a) 5 Euro, (b) 10 Euro, (c) 20 Euro");
		
		
		do {
		Scanner sc = new Scanner(System.in);
		money = sc.next();
			switch(money) {
			case "1": sum = sum + Muenzen.OneCent.getCents();
			System.out.printf("Current amount: %.2f", sum);
			break;
			case "2": sum = sum + Muenzen.TwoCent.getCents();
			System.out.printf("Current amount: %.2f", sum);
			break;
			case "3": sum = sum + Muenzen.FiveCent.getCents();
			System.out.printf("Current amount: %.2f", sum);
			break;
			case "4": sum = sum + Muenzen.TenCent.getCents();
			System.out.printf("Current amount: %.2f", sum);
			break;
			case "5": sum = sum + Muenzen.TwentyCent.getCents();
			System.out.printf("Current amount: %.2f", sum);
			break;
			case "6": sum = sum + Muenzen.FiftyCent.getCents();
			System.out.printf("Current amount: %.2f", sum);
			break;
			case "7": sum = sum + Muenzen.OneEuro.getCents();
			System.out.printf("Current amount: %.2f", sum);
			break;
			case "8": sum = sum + Muenzen.TwoEuro.getCents();
			System.out.printf("Current amount: %.2f", sum);
			break;
			case "a": sum = sum + Scheine.FiveEuro.getValue();
			System.out.printf("Current amount: %.2f", sum);
			case "b": sum = sum + Scheine.TenEuro.getValue();
			System.out.printf("Current amount: %.2f", sum);
			break;
			case "c": sum = sum + Scheine.TwentyEuro.getValue();
			System.out.printf("Current amount: %.2f", sum);
			
			}
			
		}while(sum < ps.getPreis());
				
		if (sum > ps.getPreis()) {
			change = sum - ps.getPreis();
			
				KaffeeAutomat.changeMoney(change);
				System.out.printf("Your change is %.2f\nHere is your Beverage", change);
				
				
		}
			else {
				System.out.println("===============================================================================");
				System.out.println("Thank you - here is your Beverage");
				}
}
	
}
