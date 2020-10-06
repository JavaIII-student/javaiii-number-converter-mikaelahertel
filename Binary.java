package Package;

import javax.swing.JOptionPane;

public class Binary {

	
	public static void convertToDecimal(String s) {
		int length = s.length();
		int decimal = 0;
		char place;
		for (int i=0; i < length; i++) {
			place = s.charAt(i);
			int a = Character.getNumericValue(place);
			decimal = (int) (Math.pow(2, i)*a + decimal);	
		}
		JOptionPane.showMessageDialog(null, decimal);
	}
	
	public static void convertToHexadecimal(String s) {
		int length = s.length();
		int decimal = 0;
		char place;
		for (int i=0; i < length; i++) {
			place = s.charAt(i);
			int a = Character.getNumericValue(place);
			decimal = (int) (Math.pow(2, i)*a + decimal);	
		}
		String decimal2 = String.valueOf(decimal);
		Decimal.convertToHexadecimal(decimal2);
		
	}
}
