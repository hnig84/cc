package gui;


import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Rectangle2D;
import java.awt.geom.RoundRectangle2D;
import java.util.InputMismatchException;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class UmrechnerMain {
	

	static JTextField textField = new JTextField(1);
	static JButton btn = new JButton("Dezimal -> Hex/Bin");
	static JButton btn1 = new JButton("Hex -> Dezimal");
	static JButton btn2 = new JButton("Bin -> Dezimal");
	static JLabel label = new JLabel();
	
	
	public static void umrechner() {
		
		JPanel panel = new JPanel();
		MyFrame frame = new MyFrame(panel);
		// frame.setSize(500,500);
		panel.setLayout(new GridLayout(5,1));
		
		panel.add(textField);
		panel.add(btn);
		panel.add(btn1);
		panel.add(btn2);
		panel.add(label);
		
		
		btn.setOpaque(true);
		btn.setBackground(Color.YELLOW);
		
		btn1.setOpaque(true);
		btn1.setBackground(Color.ORANGE);
		
		btn2.setOpaque(true);
		btn2.setBackground(Color.GRAY);
		btn2.setForeground(Color.WHITE);
		
		label.setOpaque(true);
		label.setBackground(Color.black);
		label.setForeground(Color.white);
		
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				
				
				try {
					decToHexBin();;
				
				} catch (NumberFormatException e2) {
					JOptionPane.showMessageDialog(panel, "Keine Ganzzahl");
					
				}
				
				
			}
		});
		btn1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					hexToDec();;
				} catch (Exception e2) {
					JOptionPane.showMessageDialog(panel, "Keine Hexzahl");
				}
				
			}
		});
		
	btn2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					binToDec();
				} catch (Exception e2) {
					JOptionPane.showMessageDialog(panel, "Keine Binärzahl");
				}
				
				
			}
		});
		
	}
	public static void binToDec() {
		int dez = Integer.parseInt(textField.getText(), 2);
		label.setText("Dezimal: " + dez);
	}
	public static void hexToDec() {
		int dez = Integer.parseInt(textField.getText(), 16);
		label.setText("Dezimal: " + dez);
	}
	public static void decToHexBin() {
		int intZahl = Integer.parseUnsignedInt(textField.getText());
		
		label.setText("Binär: " + Integer.toBinaryString(intZahl) + "     Hex: " + Integer.toHexString(intZahl).toUpperCase());
	}

	public static void main(String[] args) {
	umrechner();
	}

}
