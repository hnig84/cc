package minihorny;

public class HornyData {
	
	private String name;
	private static final String[] sequence = new String[]  {"","Dr�ck h�rter, Baby", "Oh ja, das war gut! nochmal", 
												"<html>Hmm, du wei�t wie man <br>Kn�pfe dr�ckt, weiter!</html>", 
												"Nochmal, nochmal, gleich ist es soweit", "Uhhhhh jaaaa",
												"<html>Wow, das war toll! <br>Auf dem Tisch liegt Geld f�rs Taxi!</html>"};
	

	
	
	/*
	 * getters and setters
	 */
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public static String[] getSequence() {
		return sequence;
	}
	
	
	
	

}
