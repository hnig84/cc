package verzweigung;

public class Eurobetrag {
	
	double netto, bruttoEur, bruttoDM;
	static double mwst;
	final static int mwstVoll = 19;
	final static int mwstMin = 7;
	final static double kurs = 1.95583;
	
	
	
	public double mwstBerechnen(int mwst) {
		double tmp = netto * (1 + (mwst/100));
		
		return tmp;
	}
	public double umrechnen(int mwst) {
		double tmp = mwstBerechnen(mwst);
		bruttoDM = tmp *= kurs;
		return bruttoDM;
	}
	

	@Override
	public String toString() {
		return "netto=" + netto + ", bruttoEur=" + mwstBerechnen(mwstVoll) + ", bruttoDM=" + umrechnen(mwstVoll) + "]";
	}
	public static void main(String[] args) {
		Eurobetrag eb = new Eurobetrag();
		eb.netto = 100;
		eb.umrechnen(mwstVoll);
		System.out.println(eb.toString())
		;
	}

}
