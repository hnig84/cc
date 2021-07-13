package verzweigung;

import java.util.Arrays;



public class Verzweigung {
	
	private int first, second, third, random;
	
	public void sortTwo(int a, int b) {
		if(a > b) {
			first = b;
			second = a;
		}
	}
	
	public void sortThree(int a, int b, int c) {
		int[] arr = new int[] {a, b, c} ;
		Arrays.sort(arr);
		first = arr[0];
		second = arr[1];
		third = arr[2];
					
		}
	
	public int doRandom() {
		int zahl;
		zahl = (int) (Math.random() *1000);
		return zahl;
		
	}

	public static void main(String[] args) {
		Verzweigung vz = new Verzweigung();
//		vz.first = 102;
//		vz.second = 20;
//		System.out.println("first " + vz.first + " second " + vz.second);
//		
//		vz.sortTwo(vz.first, vz.second);
//		System.out.println("first " + vz.first + " second " + vz.second);
		
		vz.first = vz.doRandom();
		vz.second = vz.doRandom();
		vz.third = vz.doRandom();
		System.out.println("first " + vz.first + " second " + vz.second + " third " + vz.third);
		
		vz.sortThree(vz.first, vz.second, vz.third);
		System.out.println("first " + vz.first + " second " + vz.second + " third " + vz.third);
	}

	public int getFirst() {
		return first;
	}

	public void setFirst(int first) {
		this.first = first;
	}

	public int getSecond() {
		return second;
	}

	public void setSecond(int second) {
		this.second = second;
	}

	public int getThird() {
		return third;
	}

	public void setThird(int third) {
		this.third = third;
	}

	public int getRandom() {
		return random;
	}

	public void setRandom(int random) {
		this.random = random;
	}
	
	

}
