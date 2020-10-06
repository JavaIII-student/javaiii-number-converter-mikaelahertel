package Package;

import javax.swing.JOptionPane;

public class Hexadecimal {
	
	public static void convertToBinary(String s) {
		int length = s.length();
		int decimal = 0;
		
		for (int i = 0; i < length; i++) {
			char place;
			if (s.charAt(i) == '0' ||s.charAt(i) == '1' || s.charAt(i) == '2' ||
					s.charAt(i) == '3' || s.charAt(i) == '4' || s.charAt(i) == '5' || 
					s.charAt(i) == '6' || s.charAt(i) == '7' || s.charAt(i) == '8' || 
					s.charAt(i) == '9') {
						place = s.charAt(i);
						int a = Character.getNumericValue(place);
						decimal = (int) (Math.pow(16, length - 1 - i)*a + decimal);
				
			}
			if (s.charAt(i) == 'A') {
				decimal = (int) (Math.pow(16, length - 1 - i)*10 + decimal);
			}
			if (s.charAt(i) == 'B') {
				decimal = (int) (Math.pow(16, length - 1 - i)*11 + decimal);
			}
			if (s.charAt(i) == 'C') {
				decimal = (int) (Math.pow(16, length - 1 - i)*12 + decimal);
			}
			if (s.charAt(i) == 'D') {
				decimal = (int) (Math.pow(16, length - 1 - i)*13 + decimal);
			}
			if (s.charAt(i) == 'E') {
				decimal = (int) (Math.pow(16, length - 1 - i)*14 + decimal);
			}
			if (s.charAt(i) == 'F') {
				decimal = (int) (Math.pow(16, length - 1 - i)*15 + decimal);
			}
		}
		
		String decimal2 = String.valueOf(decimal);
		Decimal.convertToBinary(decimal2);
	
		
	}
	
	public static void convertToDecimal(String s) {
		int length = s.length();
		int decimal = 0;
		
		for (int i = 0; i < length; i++) {
			char place;
			if (s.charAt(i) == '0' ||s.charAt(i) == '1' || s.charAt(i) == '2' ||
					s.charAt(i) == '3' || s.charAt(i) == '4' || s.charAt(i) == '5' || 
					s.charAt(i) == '6' || s.charAt(i) == '7' || s.charAt(i) == '8' || 
					s.charAt(i) == '9') {
						place = s.charAt(i);
						int a = Character.getNumericValue(place);
						decimal = (int) (Math.pow(16, length - 1 - i)*a + decimal);
				
			}
			if (s.charAt(i) == 'A') {
				decimal = (int) (Math.pow(16, length - 1 - i)*10 + decimal);
			}
			if (s.charAt(i) == 'B') {
				decimal = (int) (Math.pow(16, length - 1 - i)*11 + decimal);
			}
			if (s.charAt(i) == 'C') {
				decimal = (int) (Math.pow(16, length - 1 - i)*12 + decimal);
			}
			if (s.charAt(i) == 'D') {
				decimal = (int) (Math.pow(16, length - 1 - i)*13 + decimal);
			}
			if (s.charAt(i) == 'E') {
				decimal = (int) (Math.pow(16, length - 1 - i)*14 + decimal);
			}
			if (s.charAt(i) == 'F') {
				decimal = (int) (Math.pow(16, length - 1 - i)*15 + decimal);
			}
		}
		JOptionPane.showMessageDialog(null, decimal);
		
	}

}
