package Adressen;

public class AddressTest {

	public static void main(String[] args) {
		
		Address a1 = new Address("Hans","Meier","Holzweg",8,52477,"Alsdorf");
		Address a2 = new Address("Fred","Feuerstein","Aue",2,58753,"Homodorf");
		a1.printAddress();
		a2.printAddress();

	}

}
