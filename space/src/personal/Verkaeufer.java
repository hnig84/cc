package personal;

public class Verkaeufer implements MitarbeiterInterface {
	private int personalNr;
	private String name;
	private String datumEintritt;
	private double fixGehalt;
	

	
	public Verkaeufer(int personalNr, String name, String datumEintritt, double fixGehalt) {
		super();
		this.personalNr = personalNr;
		this.name = name;
		this.datumEintritt = datumEintritt;
		this.fixGehalt = fixGehalt;
	}

	public int getPersonalNr() {
		return personalNr;
	}

	public String getName() {
		return name;
	}

	public String getDatumEintritt() {
		return datumEintritt;
	}

	public double getFixGehalt() {
		return fixGehalt;
	}

	@Override
	public double monatsLohn(double umsatz, double provision) {
		return fixGehalt + (umsatz * provision/100);
		
	}

	@Override
	public String toString() {
		return "Verkaeufer [personalNr=" + personalNr + ", name=" + name + ", datumEintritt=" + datumEintritt
				+ ", fixGehalt=" + fixGehalt + "]";
	}
	
	
	

}
