package time_and_date;

import java.time.LocalDate;

import java.time.format.DateTimeFormatter;
import java.util.Scanner;


public class Zeitrechner {
	
	public static LocalDate eingegebenesDatum;
	public static LocalDate neuesDatum;
	
	
	public static void Datumseingabe() {
		System.out.println("Geben Sie ein Datum ein: (tt.mm.yyyy)");
		Scanner scanner = new Scanner(System.in);
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd.MM.yyyy");
		LocalDate date = LocalDate.parse(scanner.nextLine(), dtf);
		eingegebenesDatum = date;
		
	}
	public static void jubiWaehlen() {
		System.out.println("Zu berechnenden Tag eingeben: ");
		System.out.println(" (1) Silberhochzeit\t(2) Ende der Schwangerschaft\t(3) eigenene Zeitspanne in Tagen eingeben");
		Scanner scanner = new Scanner(System.in);
		int choice = scanner.nextInt();
		switch (choice) {
		case 1: neuesDatum = eingegebenesDatum.plusYears(25); break;
		case 2: neuesDatum = eingegebenesDatum.plusMonths(9); break;
		case 3: {
			System.out.println("Anzahl Tage:");
			int tage = scanner.nextInt();
			neuesDatum = eingegebenesDatum.plusDays(tage);
				}
	
		break;
		default: System.out.println("Falsche Eingabe");
		jubiWaehlen(); break;
		
		}
		
	}
	public static void ausgabe() {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd.MMMM.yyyy");
		System.out.print("Das wäre dann der ");
		System.out.println(neuesDatum.format(dtf));
	}

	public static void main(String[] args) {

		Datumseingabe();
		jubiWaehlen();
		ausgabe();
		

	}
	
	

}
