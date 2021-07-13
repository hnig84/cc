package fahrzeugrennen;

public class Fahrrad extends AFahrzeug{
	

	public Fahrrad() {
		this(0,0,30,2);
	}

	public Fahrrad(double position, int currentVelocity, int maxVelocity, int anzahlRaeder) {
		super(position, currentVelocity, maxVelocity, anzahlRaeder);
		this.setAnzahlRaeder(2);
		this.setMaxVelocity(30);
		
	}

	@Override
	public String toString() {
		return "Fahrrad " + super.toString();
	}
	

}
