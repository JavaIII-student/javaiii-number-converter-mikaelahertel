package Package;

import javax.swing.JOptionPane;

public class Decimal {
	
	
	public static void convertToBinary(String s) {
		int dec = Integer.parseInt(s);
		StringBuilder binary = new StringBuilder();
		while (dec > 0) {
			int rem = dec % 2;
			dec = dec / 2;
			binary.insert(0, rem);
		}
		JOptionPane.showMessageDialog(null, binary);
		
		
	}
	
	public static void convertToHexadecimal(String s) {
		int dec = Integer.parseInt(s);
		StringBuilder hexadecimal = new StringBuilder();
		while (dec > 0) {
			int rem = dec % 16;
			dec = dec / 16;
			if (rem <= 9) {
			hexadecimal.insert(0, rem);
			} else {
				switch (rem - 9) {
				case 1: 
					hexadecimal.insert(0, "A");
				case 2: 
					hexadecimal.insert(0, "B");
				case 3: 
					hexadecimal.insert(0,  "C");
				case 4: 
					hexadecimal.insert(0, "D");
				case 5: 
					hexadecimal.insert(0, "E");
				case 6: 
					hexadecimal.insert(0, "F");
					
			}
			}
		} 
		JOptionPane.showMessageDialog(null, hexadecimal);
		
	}

}
