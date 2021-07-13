package enumerations;

public enum Preisstufen {
	K(1.40), A(2.3), B(4.7), C(9.6), D(11.4);
	
	private final double preis;Preisstufen(double preis){
		this.preis = preis;
	}
	public double getPreis() {
		return preis;
	}
	

}
