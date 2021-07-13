package enumerations;

public enum Kaffeesorten {
	Kaffee(1), Cappucino(1.20), Espresso(1.13);
	
	private final double preis;
	
	Kaffeesorten(double preis){
		this.preis = preis;
	}
	public double getPreis() {
		return preis;
	}

}
