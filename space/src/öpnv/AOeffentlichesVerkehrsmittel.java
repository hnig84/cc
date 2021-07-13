package öpnv;


public abstract class AOeffentlichesVerkehrsmittel {
	private int linienNummer;
	private String startHaltestelle;
	private String zielHaltestelle;
	public AOeffentlichesVerkehrsmittel() {
	}
	public AOeffentlichesVerkehrsmittel(int linienNummer, String startHaltestelle,
			String zielHaltestelle) {
		super();
		this.linienNummer = linienNummer;
		this.startHaltestelle = startHaltestelle;
		this.zielHaltestelle = zielHaltestelle;
	}
	public int getLinienNummer() {
		return linienNummer;
	}
	public void setLinienNummer(int linienNummer) {
		if (linienNummer >=0)
		this.linienNummer = linienNummer;
		
	}
	
	public String getStartHaltestelle() {
		return startHaltestelle;
	}
	public void setStartHaltestelle(String startHaltestelle) {
		this.startHaltestelle = startHaltestelle;
	}
	public String getZielHaltestelle() {
		return zielHaltestelle;
	}
	public void setZielHaltestelle(String zielHaltestelle) {
		this.zielHaltestelle = zielHaltestelle;
	}
	@Override
	public String toString() {
		return " LinienNummer = " + getLinienNummer()  + ", StartHaltestelle = " + getStartHaltestelle() 
				+ ", ZielHaltestelle = " + getZielHaltestelle() +", ";
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof AOeffentlichesVerkehrsmittel) {
			AOeffentlichesVerkehrsmittel vm = (AOeffentlichesVerkehrsmittel)obj;
			return this.linienNummer == vm.linienNummer;
		} else {
			return false;
	}
	}
	

	}
