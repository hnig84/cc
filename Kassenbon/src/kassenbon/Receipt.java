package kassenbon;

import java.util.ArrayList;


public class Receipt {
	
	
	
	public ArrayList<ReceiptItem> receipt;
	
	public Receipt() {
		receipt = new ArrayList<ReceiptItem>();
		
	}
	
	public static String header() {
		return "<HTML><CENTER>FreitagsShop 042<BR>Marchstr. 23 <BR>10587 Berlin<BR>30 314 213 86<BR></CENTER></HTML>";
		 
	}
	
	public static String printSum(ArrayList<ReceiptItem> items) {
		double total = 0;
		for(ReceiptItem item : items) {
			total = total + (item.getPrice() * item.getAmount());
			
		}
		String sum = String.format("%1.2f\t", total);
		return 	"Summe      EUR " + sum;
		
	}
	
		
	}
		
	
	

	
	
	


