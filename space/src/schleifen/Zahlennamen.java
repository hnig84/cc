package schleifen;

public class Zahlennamen {
	int zahl;
	int ziffer;
	int zehnerStelle, hunderter;
	String wort;
	
	public void zerlegen() {
		String zahlString = Integer.toString(zahl);
		ziffer =  Integer.parseInt(String.valueOf(zahlString.charAt(2)));
		zehnerStelle = Integer.parseInt(String.valueOf(zahlString.charAt(1)));
		hunderter = Integer.parseInt(String.valueOf(zahlString.charAt(0)));
		
	}
	
	public String bis9() {
		switch(ziffer) {
			case 1: if(zahl < 9) wort = "ein"; 
					else wort = "eins"; 
					break;
			case 2: wort = "zwei"; break;
			case 3: wort = "drei"; break;
			case 4: wort = "vier"; break;
			case 5: wort = "fünf"; break;
			case 6: wort = "sechs"; break;
			case 7: wort = "sieben"; break;
			case 8: wort = "acht"; break;
			case 9: wort = "neun"; break;
			case 0: if(zahl == 0) wort = "null";
					else wort = "zig";
					break;
		}
		return wort;
	}
	public String bis99() {
		String tmp = "";
		switch(zehnerStelle) {
		
			case 1: tmp = "zehn"; break;
			case 2: tmp = "undzwanzig"; break;
			case 3: tmp = "unddreißig"; break;
			case 4: tmp = "undvierzig"; break;
			case 5: tmp = "undfünfzig"; break;
			case 6: tmp = "undsechzig"; break;
			case 7: tmp = "undsiebzig"; break;
			case 8: tmp = "undachtzig"; break;
			case 9: tmp = "undneunzig"; break;
			case 0: tmp = ""; break;
		}
		tmp = bis9() + tmp;
		return tmp;
		
	}
	public String bis999() {
		String tmp = "";
		switch(hunderter) {
		
		case 1: tmp = "ein"; break;
		case 2: tmp = "zwei"; break;
		case 3: tmp = "drei"; break;
		case 4: tmp = "vier"; break;
		case 5: tmp = "fünf"; break;
		case 6: tmp = "sechs"; break;
		case 7: tmp = "sieben"; break;
		case 8: tmp = "acht"; break;
		case 9: tmp = "neun"; break;
		case 0: tmp = ""; break;
		}
		tmp = tmp + "hundert" + bis99();
		return tmp;
	}
	public String ausgabe() {
		wort = bis999();
		return wort;
	}

}
