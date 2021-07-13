package tickets;

import java.time.format.DateTimeFormatter;

public abstract class Ticket {
	public DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd.MM.yyyy");
	
	private int preis; // Der Preis
	private boolean entwertet; // Ungültig, wenn entwertet!
	public Ticket( int preis ) {
	this.preis = preis;
	entwertet = false;
	}
	public int getPreis() { return preis; }
	public void entwerten() { entwertet = true; }
	public boolean istEntwertet() { return entwertet; }
	public abstract boolean gueltigInZone( int zone );
	
	public boolean isEntwertet() {
		return entwertet;
	}
	public void setEntwertet(boolean entwertet) {
		this.entwertet = entwertet;
	}
	public void setPreis(int preis) {
		this.preis = preis;
	}
	
	
	@Override
	public String toString() {
		return "Ticket [preis=" + preis + ", entwertet=" + entwertet + "]";
	}
	public void fahren() {
		
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (entwertet ? 1231 : 1237);
		result = prime * result + preis;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Ticket other = (Ticket) obj;
		if (entwertet != other.entwertet)
			return false;
		if (preis != other.preis)
			return false;
		return true;
	}
	
}


