package öpnv;

public class OEPNVTest {

	public static void main(String[] args) {

		Bus b1 = new Bus();
		SBahn sb1 = new SBahn();
		
		System.out.println(b1);
		System.out.println(sb1);
		
		System.out.println(b1.equals(sb1));
		
		Bus b2 = new Bus(2, "Holzweg", "sfkfj", 30);
		SBahn sb2 = new SBahn(3, "kfke","jfkwge", "Fred Feuerstein", 3, 30);
		sb2.setLinienNummer(-2);
		
		System.out.println(b2);
		System.out.println(sb2);
		
		System.out.println(b2.equals(sb2));
	}

}
