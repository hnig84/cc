package littlewitch;

public class LittleWitch 
{

	public static void main(String[] args) 
	{
		
		int clock = 6;
		
		for(; clock<=12; clock++) {
			
		if(clock <=10)
			System.out.println("Morgens früh um " + clock);
		
		switch(clock) { 
		
						case 6: System.out.println("kommt die kleine Hex.");
								break;
								
						case 7: System.out.println("schabt sie gelbe Rüben.");
								break;
						case 8: System.out.println("wird Kaffee gemacht.");
								break;
						case 9: System.out.println("geht sie in die Scheun'.");
								break;
						case 10: System.out.println("hackt sie Holz und Spähn'.");
								 break;
						case 11: System.out.println("Feuert an um " + clock + ",");
								 break;
						case 12: System.out.println("kocht dann bis um " + clock + ":");
						 		 break;		 		 
						}
		
		
		}
		
		System.out.println("Fröschebein und Krebs und Fisch.");
		System.out.println("Hurtig Kinder kommt zu Tisch!");
		}

	}


