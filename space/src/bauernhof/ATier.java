package bauernhof;

public abstract class ATier {
	private String name;
	private String farbe;
	private double gewicht;
	
	
	public ATier() {
		this("Fred", "schwarz",30.0);
	}
	public ATier(String name, String farbe, double gewicht) {
		super();
		this.name = name;
		this.farbe = farbe;
		this.gewicht = gewicht;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getFarbe() {
		return farbe;
	}
	public void setFarbe(String farbe) {
		this.farbe = farbe;
	}
	public double getGewicht() {
		return gewicht;
	}
	public void setGewicht(double gewicht) {
		this.gewicht = gewicht;
	}
	@Override
	public String toString() {
		return "[name=" + name + ", farbe=" + farbe + ", gewicht=" + gewicht + " kg]";
	}
	

}
