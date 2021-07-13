package fahrzeugrennen;

public class Krankenwagen extends AFahrzeug {
	private boolean blueLight = false;

	public Krankenwagen() {
		this(0,0,140,4, false);
	}

	public Krankenwagen(double position, int currentVelocity, int maxVelocity, int anzahlRaeder, boolean bluelight) {
		super(position, currentVelocity, maxVelocity, anzahlRaeder);
		this.setMaxVelocity(140);
		this.setAnzahlRaeder(4);
		this.blueLight = bluelight;
	}

	public void setBlueLight(boolean blueLight) {
		this.blueLight = blueLight;
	}

	public String isBlueLight() {
		if( blueLight = true)
			return "Blaulicht an";
		else 
			return "Blaulicht aus";
	}
	@Override
	public String toString() {
		return "Krankenwagen " + super.toString() +  isBlueLight();
	}

	public void switchBlueLight() {
		if(blueLight == false)
			setBlueLight(true);
		else setBlueLight(false);
	}
	
	
}


