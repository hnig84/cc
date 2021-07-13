package tickets;

import java.time.LocalDate;


public class Einzelticket extends Ticket {
	private static int erlaubteFahrten = 1;
	private LocalDate gueltDatum = LocalDate.now();

	
	
	public Einzelticket(int preis) {
		super(preis);
		// TODO Auto-generated constructor stub
	}
	

	@Override
	public boolean gueltigInZone(int zone) {
		// TODO Auto-generated method stub
		return false;
	}

	public LocalDate getGueltDatum() {
		return gueltDatum;
	}

	public void setGueltDatum(LocalDate gueltDatum) {
		this.gueltDatum = gueltDatum;
	}
	
	

	public static int getErlaubteFahrten() {
		return erlaubteFahrten;
	}


	public static void setErlaubteFahrten(int erlaubteFahrten) {
		Einzelticket.erlaubteFahrten = erlaubteFahrten;
	}


	@Override
	public void fahren() {
		erlaubteFahrten--;
		if(erlaubteFahrten == 0 ||gueltDatum != LocalDate.now())
			setEntwertet(true);
	}


	@Override
	public String toString() {
		return "Einzelticket [gueltDatum=" + gueltDatum.format(dtf) + ", toString()=" + super.toString() + "]";
	}
	

}
