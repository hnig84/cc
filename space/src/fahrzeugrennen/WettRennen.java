package fahrzeugrennen;


public class WettRennen {

	public static void main(String[] args) {
		Fahrrad fr1 = new Fahrrad();
		fr1.setCurrentVelocity(20);
		fr1.move(4*60);
		fr1.move(60);
				
		Auto a1 = new Auto();
		a1.setCurrentVelocity(150);
		a1.move(60);
		
		Rennwagen rw1 = new Rennwagen();
		rw1.setCurrentVelocity(200);
		rw1.move(60);
		
		Krankenwagen kw1 = new Krankenwagen();
		kw1.setCurrentVelocity(80);
		kw1.switchBlueLight();
		kw1.move(60);
		
		System.out.println(fr1);
		System.out.println(a1);
		System.out.println(rw1);
		System.out.println(kw1);
		
	}

}
