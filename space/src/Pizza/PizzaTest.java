package Pizza;

import java.util.ArrayList;

public class PizzaTest {

	public static void main(String[] args) {

		ArrayList<IPizza> pizzen = new ArrayList<IPizza>();
		pizzen.add(new PizzaNapolitana());
		pizzen.add(new PizzaNapolitana());
		pizzen.add(new PizzaMargherita(Margherita.klein));
		pizzen.add(new PizzaMargherita(Margherita.mittel));
		pizzen.add(new PizzaMargherita(Margherita.gross));
		
		double tmp = 0;
		for(IPizza pizza : pizzen) {
			tmp += pizza.getPreis();
		}
		System.out.println(pizzen.get(0).getZutaten());
		System.out.println(tmp);

	}

}
