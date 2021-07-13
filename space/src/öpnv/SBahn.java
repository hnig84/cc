package öpnv;

public class SBahn extends AOeffentlichesVerkehrsmittel {
	private String schaffner;
	private int anzahlWagen;
	private int sitzeProWagen;
	
	public SBahn() {
		this(1, "Bergstr", "Seestr.", "Heiner Müller", 4, 50);
		
	}
	public SBahn(int linienNummer, String startHaltestelle, String zielHaltestelle, 
				 String schaffner, int anzahlWagen, int sitzeProWagen) {
		super(linienNummer, startHaltestelle, zielHaltestelle);
		this.schaffner = schaffner;
		this.anzahlWagen = anzahlWagen;
		this.sitzeProWagen = sitzeProWagen;
	}

	public String getSchaffner() {
		return schaffner;
	}

	public void setSchaffner(String schaffner) {
		this.schaffner = schaffner;
	}

	public int getAnzahlWagen() {
		return anzahlWagen;
	}

	public void setAnzahlWagen(int anzahlWagen) {
		if (anzahlWagen >=0)
		this.anzahlWagen = anzahlWagen;
	}

	public int getSitzeProWagen() {
		return sitzeProWagen;
	}

	public void setSitzeProWagen(int sitzeProWagen) {
		if (sitzeProWagen >= 0)
		this.sitzeProWagen = sitzeProWagen;
	}

	@Override
	public String toString() {
		return "SBahn " +  super.toString()+  "schaffner = " + schaffner + ", anzahlWagen = " + anzahlWagen 
				+ ", sitzeProWagen = " + sitzeProWagen;
	}
	 
	
	

}
