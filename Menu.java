package Package;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Menu implements ActionListener {
	
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton binToHex = new JButton("Bin to Hex");
	JButton binToDec = new JButton("Bin to Dec");
	JButton hexToBin = new JButton("Hex to Bin");
	JButton hexToDec = new JButton("Hex to Dec");
	JButton decToHex = new JButton("Dec to Hex");
	JButton decToBin = new JButton("Dec to Bin");
	
	public void createMenu() {
		frame.setVisible(true);
		frame.add(panel);
		panel.add(binToHex);
		panel.add(binToDec);
		panel.add(hexToBin);
		panel.add(hexToDec);
		panel.add(decToHex);
		panel.add(decToBin);
		frame.pack();
		binToHex.addActionListener(this);
		binToDec.addActionListener(this);
		hexToBin.addActionListener(this);
		hexToDec.addActionListener(this);
		decToHex.addActionListener(this);
		decToBin.addActionListener(this);
				
	}
	
	public void actionPerformed(ActionEvent e) {
		String input = new String();
		if (e.getSource() == binToHex) {
			input = JOptionPane.showInputDialog(null, "Enter a binary number:");
			Binary.convertToHexadecimal(input);
		} 
		
		if (e.getSource() == binToDec) {
			input = JOptionPane.showInputDialog(null, "Enter a binary number:");
			Binary.convertToDecimal(input);
		} 
		
		if (e.getSource() == hexToBin) {
			input = JOptionPane.showInputDialog(null, "Enter a hexadecimal number:");
			Hexadecimal.convertToBinary(input);
		}
		
		if (e.getSource() == hexToDec) {
			input = JOptionPane.showInputDialog(null, "Enter a hexadecimal number:");
			Hexadecimal.convertToDecimal(input);
		}
		
		if (e.getSource() == decToHex) {
			input = JOptionPane.showInputDialog(null, "Enter a decimal number:");
			Decimal.convertToHexadecimal(input);
		}
		
		if (e.getSource() == decToBin) {
			input = JOptionPane.showInputDialog(null, "Enter a decimal number:");
			Decimal.convertToBinary(input);
		}
		
	}

}


