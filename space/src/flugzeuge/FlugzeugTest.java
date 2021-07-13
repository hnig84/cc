package flugzeuge;

public class FlugzeugTest {

	public static void main(String[] args) {

		Verkehrsflugzeug vf1 = new Verkehrsflugzeug("Northrop", 700, "154485", 150);
		Doppeldecker dd_geschlossen = new Doppeldecker("Messerschmidt", 350, "2245", false);
		Doppeldecker dd_offen = new Doppeldecker("Messerschmidt", 400, "1165465");
		Doppeldecker dd_langsam_offen = new Doppeldecker("Messerschmidt", 250, "2184", true);
		
		System.out.println(vf1);
		System.out.println(dd_geschlossen);
		System.out.println(dd_offen);
		System.out.println(dd_langsam_offen);
		
		

	}

}
