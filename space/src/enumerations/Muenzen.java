package enumerations;

public enum Muenzen {
	OneCent(0.01), TwoCent(0.02), FiveCent(0.05), TenCent(0.10), TwentyCent(0.20),
	FiftyCent(0.50), OneEuro(1.00), TwoEuro(2.00);
	
	private final double cents;
	Muenzen(double cents){
		this.cents = cents;
	}
	public double getCents() {
		return cents;
	}

}
