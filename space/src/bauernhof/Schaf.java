package bauernhof;

public class Schaf extends ATier{

	public Schaf() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Schaf(String name, String farbe, double gewicht) {
		super(name, farbe, gewicht);
		// TODO Auto-generated constructor stub
	}
	
	public void machGeraeusch() {
		System.out.println("Mäh");
	}
}
