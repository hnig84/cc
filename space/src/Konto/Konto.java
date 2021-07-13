package Konto;

public class Konto {
	private Person person = new Person();
	private double kontostand;
	public Konto (String name, String vorname, float kontostand) {
		person.setName(name);
		person.setVorname(vorname);
		this.kontostand = kontostand;

	}
	public String getName() {
		return person.getName();
	}
	public double getKontostand() {
		return kontostand;
	}
}
