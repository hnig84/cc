package flugzeuge;

abstract class Flugzeug {
	private String hersteller; // Herstellername
	private int maxSpeed; // Max. Geschwindigkeit
	private String immatNummer; // Immatrikulationsnummer
	private int anzahlFluegel = 1; // Anzahl Flügelpaare
	
	public Flugzeug() {
		
	};
	
	public Flugzeug(String hersteller, int maxSpeed, int anzahlFluegel) {
		this.hersteller = hersteller; 
		this.maxSpeed = maxSpeed;
		this.anzahlFluegel = anzahlFluegel;
	}
	
	
	public Flugzeug(String hersteller, int maxSpeed, String immatNummer) {
		
		this.hersteller = hersteller;
		this.maxSpeed = maxSpeed;
		this.immatNummer = immatNummer;
	}


	public String getImmatNummer(){
		return immatNummer;
	}
	
	protected void setImmatNummer(String immatNummer){
		this.immatNummer = immatNummer;
	}
	
	public int getMaxSpeed(){
		return maxSpeed;
	}
	
	abstract public boolean getLooping();
	// weitere Methoden

	

public String isLooping() {
	if(getLooping() == true)
		return "looping-fähig";
	
	
	else return "nicht looping-fähig";
}

	@Override
	public String toString() {
		return "[hersteller=" + hersteller + ", maxSpeed=" + maxSpeed + ", immatNummer=" + immatNummer
				+  ", "+ isLooping() + ", ";
	}

	
	
	
}
