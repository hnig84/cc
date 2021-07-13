package fahrzeugrennen;

public class Rennwagen extends AFahrzeug {

	public Rennwagen() {
		this(0,0,220,4);
	}

	public Rennwagen(double position, int currentVelocity, int maxVelocity, int anzahlRaeder) {
		super(position, currentVelocity, maxVelocity, anzahlRaeder);
		this.setAnzahlRaeder(4);
		this.setMaxVelocity(220);
	
	}

	@Override
	public String toString() {
		return "Rennwagen " + super.toString();
	}
	

}
