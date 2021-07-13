package flugzeuge;

public class Verkehrsflugzeug extends Flugzeug {
	private int anzahlPassagiere;
	private final static int anzahlFluegel = 1;
	

	public Verkehrsflugzeug(String hersteller, int maxSpeed, String immatNummer, int anzahlPassagiere) {
		super(hersteller, maxSpeed, immatNummer);
		this.anzahlPassagiere = anzahlPassagiere;
		
	}

	public int getAnzahlPassagiere() {
		return anzahlPassagiere;
	}

	public void setAnzahlPassagiere(int anzahlPassagiere) {
		this.anzahlPassagiere = anzahlPassagiere;
	}

	@Override
	public final boolean getLooping() {
		
		return false;
	}

	@Override
	public String toString() {
		return "Verkehrsflugzeug " + super.toString() +"Anzahl Flügel: " + anzahlFluegel +" anzahlPassagiere=" + anzahlPassagiere + " ]";
	}

	
}
