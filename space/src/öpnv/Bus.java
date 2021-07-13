package öpnv;

public class Bus extends AOeffentlichesVerkehrsmittel {
	private int anzahlSitze;

	public Bus() {
		
		this(1, "Startstr.", "Endstr.", 50);
	}

	public Bus(int linienNummer, String startHaltestelle, String zielHaltestelle, int anzahlSitze) {
		super(linienNummer, startHaltestelle, zielHaltestelle);
		this.anzahlSitze = anzahlSitze;
		// TODO Auto-generated constructor s
	}

	public int getAnzahlSitze() {
		return anzahlSitze;
	}

	public void setAnzahlSitze(int anzahlSitze) {
		if (anzahlSitze >=0)
		this.anzahlSitze = anzahlSitze;
	}

	@Override
	public String toString() {
		return "Bus " + super.toString() + "anzahlSitze =  " + anzahlSitze  ;
	}
	
	

}
