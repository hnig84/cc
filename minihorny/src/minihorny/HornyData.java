package minihorny;

public class HornyData {
	
	private String name;
	private static final String[] sequence = new String[]  {"","Drück härter, Baby", "Oh ja, das war gut! nochmal", 
												"<html>Hmm, du weißt wie man <br>Knöpfe drückt, weiter!</html>", 
												"Nochmal, nochmal, gleich ist es soweit", "Uhhhhh jaaaa",
												"<html>Wow, das war toll! <br>Auf dem Tisch liegt Geld fürs Taxi!</html>"};
	

	
	
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
