package Pizza;

public class PizzaMargherita implements IPizza{
	
		private String[] zutaten = {
				"Teig", "Käse", "Tomaten"
		};
		private double preis;
		private Margherita groesse;
		
		public PizzaMargherita(Margherita groesse) {
			this.groesse = groesse;
			
		}

		@Override
		public String getZutaten() {
			String tmp = "";
			for(int i = 0; i < zutaten.length; i++) {
				tmp += zutaten[i];
				
			}
			return tmp;
		}

		@Override
		public double getPreis() {
			switch(groesse) {
			case klein: preis = 4.50; break;
			case mittel: preis = 5.50; break;
			case gross: preis = 6.50; break;
			default: System.out.println("nur klein, mittel groß, Mittel wird angenommen");
					 preis = 5.50;
			}
			
			return preis;
		}

		public Margherita getGroesse() {
			return groesse;
		}

		public void setGroesse(Margherita groesse) {
			this.groesse = groesse;
		}
		
		
		
		

	
}
