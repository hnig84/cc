package fahrzeugrennen;

public class Auto extends AFahrzeug {

	public Auto() {
		this(0,0,140,4);
	}

	public Auto(double position, int currentVelocity, int maxVelocity, int anzahlRaeder) {
		super(position, currentVelocity, maxVelocity, anzahlRaeder);
		this.setAnzahlRaeder(4);
		this.setMaxVelocity(140);
	}

	@Override
	public String toString() {
		return "Auto " + super.toString() + "]";
	}
	

}
