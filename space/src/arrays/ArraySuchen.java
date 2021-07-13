package arrays;

import java.util.Arrays;

public class ArraySuchen {
	
	public static int[] zufall;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		zufall = Array.randomFill(10);
		System.out.println(Arrays.toString(zufall));
	}

}
