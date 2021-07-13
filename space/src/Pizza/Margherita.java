package Pizza;

public enum Margherita {
	
	
	klein(4.5), mittel(5.5), gross(6.5);
	Margherita(double preis){
		this.preis = preis;
	}
	private final double preis;
}
