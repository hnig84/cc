package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class DemoArrayList {

	public static void main(String[] args) {
		int[] zahlen;
		zahlen = new int[]{1,2,3,4,5};
		
		// ArrayList ohne Typ = Fehlerquelle
		ArrayList liste = new ArrayList();
		liste.add(1);
		liste.add("Hallo");
		liste.add(true);
		
		System.out.println(liste.get(0));
		System.out.println(liste);
		
		ArrayList<Integer> zahlenListe = new ArrayList<Integer>();
		zahlenListe.add(1);
		zahlenListe.add(565);
		zahlenListe.add(566);
		zahlenListe.add(567);
		zahlenListe.add(568);
		
		System.out.println(zahlenListe);
		
			
		zahlenListe.remove(3);
		System.out.println(zahlenListe);
		
		// Von Array zu ArrayList
		ArrayList<Integer> arrayListFromArray = new ArrayList(Arrays.asList(zahlen));
		
		ArrayList<Integer> randomlist = new ArrayList();
		randomlist = randomFill(10);
		System.out.println(randomlist);
	}
	public static ArrayList randomFill(int amount) {
		ArrayList<Integer> randomArray = new ArrayList<Integer>();
				for(int i = 0; i <amount; i++) {
					randomArray.add((int) (Math.random()*100000));
				
	}
				return randomArray;

	}}
