package name;

public class Name {
	public static String vorname = "Holger", nachname = "Nigbur";
	
	public static String name() {
		return vorname + " " + nachname;
	}
	
	public static String kuerzel() {
		char first, last;
		first = vorname.charAt(0);
		last = nachname.charAt(0);
		String kuerzel = (first + "" + last);
		return kuerzel;
		
	}
	

	
	public static void main(String[] args) {
		System.out.println(vorname);
		System.out.println(nachname);
		System.out.println(name());
		System.out.println(kuerzel());
		
	}

}
