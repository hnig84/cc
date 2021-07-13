package personal;

public class Hilfsarbeiter extends AMitarbeiter {
	
	private double stundenLohn;
	
	public Hilfsarbeiter() {
		
	}

	public Hilfsarbeiter(int personalNr, String name, String datumEintritt, double stundenLohn) {
		super(personalNr, name, datumEintritt);
		this.stundenLohn = stundenLohn;
		
	}

	public double getStundenLohn() {
		return stundenLohn;
	}

	public double monatsLohn(double anzahlStunden, double ueberstZuschlag, double anzahlUeberst) {
		return stundenLohn*anzahlStunden + ueberstZuschlag*anzahlUeberst;
		
	}

	@Override
	public String toString() {
		return "Hilfsarbeiter [stundenLohn=" + stundenLohn + ", monatsLohn()=" + monatsLohn() + super.toString() + "]";
	}

	@Override
	public double monatsLohn(double umsatz, double provision) {
		// TODO Auto-generated method stub
		return 0;
	}

	
	
	

}
