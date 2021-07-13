package flugzeuge;

public final class Doppeldecker extends Flugzeug {
	private static final int LOOPINGSPEED = 320;
	private final boolean offenesCockpit;
	private final static int anzahlFluegel = 2;
	

	public Doppeldecker(String hersteller, int maxSpeed, String immatNummer, boolean offenesCockpit) {
		super(hersteller, maxSpeed, immatNummer);
		this.offenesCockpit = offenesCockpit;
		
	}
	public Doppeldecker(String hersteller, int maxSpeed, String immatNummer) {
		super(hersteller, maxSpeed, immatNummer);
		this.offenesCockpit = true;
		
	}

	@Override
	public boolean getLooping() {
		if(getMaxSpeed() > LOOPINGSPEED)
		return true;
		else return false;
	}
	

	public String isOffenesCockpit() {
		if(offenesCockpit == true)
		return "Offenes Cockpit ";
		else return "geschlossenes Cockpit";
	}
	@Override
	public String toString() {
		return "Doppeldecker " + super.toString() + "Anzahl Flügel: " + anzahlFluegel +" "+ isOffenesCockpit() +  "]";
	}
	

}
