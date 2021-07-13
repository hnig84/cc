package brunnen;

public class Ziehbrunnen {
	int wasserTrog = 0;
	Thread pumpe;
	Thread verteiler;
	int change;
	
	public Ziehbrunnen() {
		Schoepfer s1 = new Schoepfer(this);	
		s1.geraet = s1.getPumpe().geraet;
		pumpe = s1;
		
		Schoepfer s2 = new Schoepfer(this);
		s2.geraet = s2.getVerteiler().geraet;
		verteiler = s2;
		
		System.out.println("Wasserstand " + wasserTrog);
		pumpe.start();
		verteiler.start();
		try {
			verteiler.join();
			pumpe.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static void main(String[] args) {
		
		Ziehbrunnen zb = new Ziehbrunnen();
		

	}
	public synchronized void setWassertrog(int wasser) {
		if(this.wasserTrog > wasser)
			wasserTrog -= wasser;
		
		else 
			 {
			
			try {
				System.out.println("Stop");
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	public synchronized void goGetWater() {
		if(wasserTrog >= 20)
			System.out.println("Aufwachen");
		notifyAll();
	}

}
