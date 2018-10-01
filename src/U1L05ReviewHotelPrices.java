import javax.swing.JOptionPane;

public class U1L05ReviewHotelPrices {

	public static void main(String[] args) {	
		int nights = 0;
		int hotel1 = 0;
		int hotel2 = 0;
		int hotel3 = 0;
		String message1 = "";
		String message2 = "";
		String message3 = "";
		
		//asking how many nights
		do {
		String answer = JOptionPane.showInputDialog("How many nights are you staying the hotel? Make sure it is 1 or more days, please.");
		double num = Double.parseDouble(answer);
		nights = (int)(num);
		}while (nights <= 0);
		//calculating total cost
		hotel1 = nights * 150;
		hotel2 = nights * 300;
		hotel3 = nights * 600;
		
		//calculating number of starts needed
		while (hotel1 > 0) {
			hotel1 -= 50;
			message1 = message1 + "*";
		}
		while (hotel2 > 0) {
			hotel2 -= 50;
			message2 = message2 + "*";
		}
		while (hotel3 > 0) {
			hotel3 -= 50;
			message3 = message3 + "*";
		}
		
		//printing graph
		JOptionPane.showMessageDialog(null, "Each * is $50");
		JOptionPane.showMessageDialog(null, "Unsafe Motel: " + message1 + "\nHotel: " + message2 + "\nExpensive Hotel: " + message3);
		
		
	}
	
}
