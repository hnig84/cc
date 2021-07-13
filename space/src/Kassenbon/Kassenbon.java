package Kassenbon;


import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import gui.MyFrame;
import gui.MyMenu;


public class Kassenbon {
	
	JLabel labelArticles = new JLabel();
	JLabel labelTotal = new JLabel();
	JButton btn = new JButton();
	
	
	private ArrayList<ReceiptItem> items = new ArrayList<ReceiptItem>();
	
//		Maske für Erfassung der Artikel	
	
	public void eingabeArtikel() {
		JTextField artikelName = new JTextField();
		JTextField artikelPreis = new JTextField();
		JTextField artikelAnzahl = new JTextField();
		JButton btnPrint = new JButton("Kassenbon ausgeben");
		JButton btnSave = new JButton("Artikel speichern");
	
//		Eingabepanel	
		
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(9,1));
		panel.add(new JLabel("<HTML><H3>Artikel eingeben</H3></HTML>"), SwingConstants.CENTER);
		panel.add(new JLabel("Artikelbezeichnung:"));
		panel.add(artikelName);
		panel.add(new JLabel("Preis:"));
		panel.add(artikelPreis);
		panel.add(new JLabel("Anzahl:"));
		panel.add(artikelAnzahl);
		panel.add(btnSave);
		panel.add(btnPrint);
		
		panel.setOpaque(true);
		panel.setBackground(Color.lightGray);
		panel.setBorder(BorderFactory.createLineBorder(Color.black, 2));
//		Speicherbutton
		
		btnSave.setOpaque(true);
		btnSave.setBackground(Color.GREEN);
		btnSave.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					String price = artikelPreis.getText().replace(',', '.');
					items.add(new ReceiptItem(artikelName.getText(), Integer.parseInt(artikelAnzahl.getText()), Double.parseDouble(price)));
				} catch (Exception e2) {
					JOptionPane.showMessageDialog(null, "falsche Eingabe");
				}
				artikelAnzahl.setText("");
				artikelName.setText("");
				artikelPreis.setText("");
				
			}
		});

// 		Button zum Kassenbon erzeugen
		
		btnPrint.setOpaque(true);
		btnPrint.setBackground(Color.BLACK);
		btnPrint.setForeground(Color.WHITE);
		btnPrint.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				kassenbonErzeugen();
				
			}
		});
		
//		Eigenes Frame
		
		MyFrame frame = new MyFrame();
		frame.setContentPane(panel);
//		frame.setSize(200, 300);
		frame.setSize(new Dimension(200,300));
		
	// 		Menu mit Daten verwerfen Option
			
		JMenuBar menuBar = new MyMenu();
		menuBar = ((MyMenu) menuBar).createMenu();
			
			JMenuItem discard = new JMenuItem("Daten verwerfen");
			discard.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					items = new ArrayList<ReceiptItem>();
					
				}
			});
		
			
			((MyMenu) menuBar).addMenuItem(discard);
			frame.setJMenuBar(menuBar);
		
		}
	
	public void kassenbonErzeugen() {
		JPanel panel = new JPanel();
		panel.setOpaque(true);
		panel.setBorder(BorderFactory.createLineBorder(Color.black, 1));
		JLabel labelHeader = new JLabel(Receipt.header(), SwingConstants.CENTER);
		
		panel.setLayout(new GridLayout(items.size()+4,1));
		panel.add(labelHeader);
		labelHeader.setText(Receipt.header());
		
		panel.add(new JLabel("========================", SwingConstants.CENTER));
//		labelHeader.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
		
		
		for(ReceiptItem item : items) {
			panel.add(new JLabel(item.toString()));
			
			
		}
		
		panel.add(new JLabel("========================", SwingConstants.CENTER));

		panel.add(labelTotal);
		labelTotal.setText(Receipt.printSum(items));

		
//		JMenuBar menuBar = new JMenuBar();
//		JMenu optionsMenu = new JMenu("Options");
//		JMenuItem menuClose = new JMenuItem("Close");
//		menuBar.add(optionsMenu);
//		
////		 Menu Einträge
//		
//		
//		menuClose.addActionListener(new ActionListener() {
//			
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				System.exit(0);
//				
//			}
//		});
//		optionsMenu.add(menuClose);
////		editMenu.add(new JSeparator());
//		menuBar.setVisible(true);
//		
		MyFrame frame = new MyFrame();
		frame.setContentPane(panel);
//		frame.setSize(200, 500);
		frame.pack();
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		JMenuBar menuBar = new MyMenu();
		menuBar = ((MyMenu) menuBar).createMenu();
		
		frame.setJMenuBar(menuBar);
		

	}
	
	
	public static void main(String[] args) {
		
		Kassenbon kb = new Kassenbon();
//		kb.kassenbonErzeugen();
		kb.eingabeArtikel();
		
		
		
		
	}

}
