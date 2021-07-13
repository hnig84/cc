package ascii;

public class ASCII {
	
	public static int ascii(char letter) {
		return (int) letter;
	}
	public static void asciiTabelle() {
		System.out.println("Dezimal" + "\t" + "Zeichen");
		
		for(int i = 33; i <= 126; i++) {
		System.out.println(i + "\t" + (char) i); 
		}
	}
	

	public static void main(String[] args) {
		
		System.out.println(ascii('&'));
		
		asciiTabelle();
	}
	

}
