package Adressen;

public class Address {
	private String vorname = "Max", nachname = "Mustermann", 
				   strasse = "Musterstr.", ort = "Musterhausen"; 
	private int hausnummer = 1, plz = 12345;
	
	
	public Address(String vorname, String nachname, String strasse, int hausnr, int plz, String ort) {
		this.vorname = vorname;
		this.nachname = nachname;
		this.strasse = strasse;
		this.hausnummer = hausnr;
		this.plz = plz;
		this.ort = ort;
	}
	
	public String getVorname() {
		return vorname;
	}
	public void setVorname(String vorname) {
		this.vorname = vorname;
	}
	public String getNachname() {
		return nachname;
	}
	public void setNachname(String nachname) {
		this.nachname = nachname;
	}
	public String getStrasse() {
		return strasse;
	}
	public void setStrasse(String strasse) {
		this.strasse = strasse;
	}
	public String getOrt() {
		return ort;
	}
	public void setOrt(String ort) {
		this.ort = ort;
	}
	public int getHausnummer() {
		return hausnummer;
	}
	public void setHausnummer(int hausnummer) {
		this.hausnummer = hausnummer;
	}
	public int getPlz() {
		return plz;
	}
	public void setPlz(int plz) {
		this.plz = plz;
	}
	
	public void printAddress() {
		System.out.print(this.getVorname() + " ");
		System.out.print(this.getNachname() + " ");
		System.out.print(this.getStrasse() + " ");
		System.out.print(this.getHausnummer() + " ");
		System.out.print(this.getPlz() + " ");
		System.out.println(this.getOrt());
	}
	

}
