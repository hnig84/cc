package Pizza;

public class PizzaNapolitana implements IPizza {
	private String[] zutaten = {
			"Teig", "Käse", "Tomaten", "Basilikum", "frische Tomaten"
	};
	
	public PizzaNapolitana() {
	}
	private final double preis = 6.50;
	@Override
	public String getZutaten() {
		System.out.println("Zutaten: ");
		String tmp = "";
		for(int i = 0; i < zutaten.length; i++) {
			tmp += zutaten[i] + " ";
			
		}
		return tmp;
	}
	@Override
	public double getPreis() {
		
		return preis;
	}
	

}
