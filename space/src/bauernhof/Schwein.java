package bauernhof;

public class Schwein extends ATier {

	public Schwein() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Schwein(String name, String farbe, double gewicht) {
		super(name, farbe, gewicht);
		// TODO Auto-generated constructor stub
	}

	public void machGeraeusch() {
		System.out.println("Oink");
	}
}
