package enumerations;

public enum Scheine {
	FiveEuro(5), TenEuro(10), TwentyEuro(20);
	private final double value;
	Scheine(double value){
		this.value = value;
	}
	public double getValue() {
		return value;
	}

}
