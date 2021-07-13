package bauernhof;

public class Ferkel extends Schwein{
	private int ohrengroesse;
	

		public Ferkel() {
		this("Horst", "blau",30.0, 2);
		// TODO Auto-generated constructor stub
	}
		

		public Ferkel(String name, String farbe, double gewicht, int ohrengroesse) {
			super(name, farbe, gewicht);
			this.ohrengroesse = ohrengroesse;
		}


		public int getohrengroesse() {
			return ohrengroesse;
		}
	
		public void setohrengroesse(int ohrengroesse) {
			this.ohrengroesse = ohrengroesse;
		}
	
		@Override
		public String toString() {
			return super.toString() + "[ohrengroesse=" + ohrengroesse + "]";
		}
		
	
}

