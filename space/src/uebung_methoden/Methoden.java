package uebung_methoden;

import java.util.Arrays;
import java.util.Scanner;

public class Methoden {
	private static int randomNumbers;
	private static int[] randomArray;
	
	public static void userInput() {
		System.out.println("How much numbers to generate?");
		Scanner sc = new Scanner(System.in);
		randomNumbers = sc.nextInt();
		if(randomNumbers > 100) {
			System.out.println("to high");
			userInput();
		}
	}
	
	public static void fillArrayWithRandomNumbers(int[] theArray) {
		randomArray = new int[randomNumbers];
		for(int i = 0; i < randomNumbers; i++) {
			randomArray[i] = (int) (Math.random()*100);
		}
		
	}
	public static int sum(int[] theArray) {
		int sum = 0;
		for(int i = 0; i < randomNumbers; i++) {
			sum = sum + randomArray[i];
		}
		return sum;
		
	}
	public static double avg(int[] theArray) {
		double avg = 0;
		avg = (double) sum(randomArray) / randomNumbers;
		return avg;
	}
	public static void printArray(int[] theArray) {
		System.out.println(Arrays.toString(randomArray));
		System.out.println("Sum: " + sum(randomArray));
		System.out.println("Avg: " + avg(randomArray));
	}

	public static void main(String[] args) {
		userInput();
		fillArrayWithRandomNumbers(randomArray);
		printArray(randomArray);
		
		
	}
	

}
