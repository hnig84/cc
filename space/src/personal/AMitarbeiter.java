package personal;

public abstract class AMitarbeiter implements MitarbeiterInterface{
	private int personalNr;
	private String name;
	private String datumEintritt;
	
	
	public AMitarbeiter() {
		
	}
	
	public AMitarbeiter(int personalNr, String name, String datumEintritt) {
		super();
		this.personalNr = personalNr;
		this.name = name;
		this.datumEintritt = datumEintritt;
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

	@Override
	public String toString() {
		return "AMitarbeiter [personalNr=" + personalNr + ", name=" + name + ", datumEintritt=" + datumEintritt + "]";
	}
	
	public  double monatsLohn() {
		return 0;
	}
	;
	
	

}
