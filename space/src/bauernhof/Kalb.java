package bauernhof;

public class Kalb extends Kuh {
	private int fleckengroesse;
	
	

	public Kalb() {
		this("Hermann", "gefleckt",50.0, 2);
	}
	

	public Kalb(String name, String farbe, double gewicht, int fleckengroesse) {
		super(name, farbe, gewicht);
		this.fleckengroesse = fleckengroesse;
	}


	public int getFleckengroesse() {
		return fleckengroesse;
	}

	public void setFleckengroesse(int fleckengroesse) {
		this.fleckengroesse = fleckengroesse;
	}

	@Override
	public String toString() {
		return super.toString() + "[fleckengroesse=" + fleckengroesse + "]";
	}
	

}
