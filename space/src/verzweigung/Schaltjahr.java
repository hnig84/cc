package verzweigung;

public class Schaltjahr {
	private int jahr;
	
	public boolean isSchaltjahr(int jahr) {
		if(jahr % 4 == 0) {
			if(jahr % 100 != 0)
				if(jahr % 400 != 0)
					return true;
		}
		
			return false;
	}

	public static void main(String[] args) {
		
		Schaltjahr s = new Schaltjahr();
		s.jahr = 2021;
		s.isSchaltjahr(s.jahr);
		
		for(int i = 1800; i <=2000; i++) {
			if( s.isSchaltjahr(i) == true)
				System.out.println(i);
		}
	}

}
