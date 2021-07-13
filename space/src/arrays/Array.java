package arrays;


import java.util.Arrays;
import java.util.Random;

public class Array{
	public static int[] zufall;
 
	public static void main(String[] args) {
	
	zufall = randomFill(10);
	System.out.println(Arrays.toString(zufall));
	switchArray(zufall, zufall);
	System.out.println(Arrays.toString(zufall));
	
	}
	////////////////////////////////////////////////////////////
	// Array mit Zufallszahlen füllen
	public static int[] randomFill(int zahl) {
		int[] zufall;
		zufall = new int[zahl];
		Random random = new Random();
		
		for (int i = 0; i < zufall.length; i++) {
			zufall[i] = random.nextInt(100) + 1;	
		}
		return zufall;
	}
	public static long[] randomFill(long zahl) {
		long[] zufall;
		zufall = new long[(int)zahl];
		Random random = new Random();
		
		for (int i = 0; i < zufall.length; i++) {
			zufall[i] = random.nextInt(100000) + 1;	
		}
		return zufall;
	}
	
	public static void switchArray(int[] ArrayA, int[] ArrayB) {
		 int j = ArrayA.length -1;
		 for(int i = 0; i < ArrayA.length /2; i++) {
			 int tmp = ArrayA[i];
			 ArrayA[i] = ArrayB[j];
			 ArrayB[j] = tmp;
			 j--;
			 
		 }
		    
	}
	}
	
	
	
