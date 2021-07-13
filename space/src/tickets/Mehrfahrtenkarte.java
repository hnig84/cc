package tickets;

import java.time.LocalDate;

public class Mehrfahrtenkarte extends Ticket {
	
	private static int erlaubteFahrten = 4;
	private LocalDate gueltDatum = LocalDate.now();
	

	public Mehrfahrtenkarte(int preis) {
		super(preis);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean gueltigInZone(int zone) {
		// TODO Auto-generated method stub
		return false;
	}

	public static int getErlaubteFahrten() {
		return erlaubteFahrten;
	}

	public static void setErlaubteFahrten(int erlaubteFahrten) {
		Mehrfahrtenkarte.erlaubteFahrten = erlaubteFahrten;
	}

	@Override
	public void fahren() {
		erlaubteFahrten--;
		if(erlaubteFahrten == 0 ||gueltDatum != LocalDate.now())
			setEntwertet(true);
	}

}
