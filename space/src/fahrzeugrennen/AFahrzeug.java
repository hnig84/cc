package fahrzeugrennen;

public abstract class AFahrzeug {
	private double position;
	private double currentVelocity;
	private int maxVelocity;
	private int anzahlRaeder;
	
	
	public AFahrzeug() {
		this(0,0,0,0);
		
	}
	public AFahrzeug(double position, double currentVelocity, int maxVelocity, int anzahlRaeder) {
		super();
		this.position = position;
		this.currentVelocity = currentVelocity;
		this.maxVelocity = maxVelocity;
		this.anzahlRaeder = anzahlRaeder;
	}

	public double getPosition() {
		return position;
	}

	public void setPosition(double position) {
		this.position = position;
	}

	public double getcurrentVelocity() {
		return currentVelocity;
	}

	public void setCurrentVelocity(int currentVelocity) {
		if(currentVelocity >= 0 && currentVelocity <= getMaxVelocity())
		this.currentVelocity = currentVelocity;
			else this.currentVelocity = getMaxVelocity();
	}
	
	
	public int getMaxVelocity() {
		return maxVelocity;
	}

	public void setMaxVelocity(int maxVelocity) {
		this.maxVelocity = maxVelocity;
	}
	

	public int getAnzahlRaeder() {
		return anzahlRaeder;
	}

	public void setAnzahlRaeder(int anzahlRaeder) {
		this.anzahlRaeder = anzahlRaeder;
	}
	@Override
	public String toString() {
		return "[Position=" + getPosition() + ", currentVelocity=" + getcurrentVelocity()
				+ ", MaxVelocity=" + getMaxVelocity() + ", AnzahlRaeder=" + getAnzahlRaeder()
				+ "] ";
	}

	public void move(double minutes) {
		double tmp;
		tmp = this.position + this.currentVelocity / 60 * minutes;
		
		
		setPosition(tmp);
	}

}
