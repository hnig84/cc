package tickets;

import java.time.LocalDate;


public class Monatskarte extends Ticket {
	private LocalDate kaufDatum = LocalDate.now();
	private LocalDate ablaufDatum = LocalDate.now().plusMonths(1);
	private String eigentuemer;

	public Monatskarte(int preis) {
		super(preis);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean gueltigInZone(int zone) {
		// TODO Auto-generated method stub
		return false;
	}

	public LocalDate getKaufDatum() {
		return kaufDatum;
	}

	public void setKaufDatum(LocalDate kaufDatum) {
		this.kaufDatum = kaufDatum;
	}

	public LocalDate getAblaufDatum() {
		return ablaufDatum;
	}

	public void setAblaufDatum(LocalDate ablaufDatum) {
		this.ablaufDatum = ablaufDatum;
	}



	@Override
	public String toString() {
		return "Monatskarte [kaufDatum=" + kaufDatum + ", ablaufDatum=" + ablaufDatum + ", eigentuemer=" + eigentuemer
				+ ", toString()=" + super.toString() + "]";
	}

	@Override
	public void fahren() {
		
		if(LocalDate.now().isAfter(ablaufDatum))
			setEntwertet(true);
		System.out.println("abgelaufen");
	}

}
