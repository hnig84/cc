package bauernhof;

public class Lamm extends Schaf {
	private String augenfarbe;
	
	

	public Lamm() {
		this("Gunter", "weiﬂ", 15.0, "blau");
		// TODO Auto-generated constructor stub
	}

	public Lamm(String name, String farbe, double gewicht, String augenfarbe) {
		super(name, farbe, gewicht);
		this.augenfarbe = augenfarbe;
		// TODO Auto-generated constructor stub
	}

	
	public String getAugenfarbe() {
		return augenfarbe;
	}

	public void setAugenfarbe(String augenfarbe) {
		this.augenfarbe = augenfarbe;
	}

	@Override
	public String toString() {
		return super.toString() + "[augenfarbe =" + augenfarbe + "]";
	}
	

}
