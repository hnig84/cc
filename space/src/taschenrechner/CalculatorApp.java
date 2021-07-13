package taschenrechner;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JSplitPane;
import javax.swing.JTextArea;

import gui.MyFrame;
import gui.MyMenu;


public class CalculatorApp {
	
		MyFrame frame;
		
		public static JPanel calcPanel;
		public static JTextArea screenPanel;
		public static Tastenfeld keypadPanel;
	
	public CalculatorApp() {
		initialize();
	}
		
	public void initialize() {
		MyFrame frame = new MyFrame();
		
		MyMenu menu = new MyMenu();
		menu = (MyMenu) menu.createMenu();
		JMenuItem discard = new JMenuItem("löschen");
		menu.addMenuItem(discard);
	
		frame.setJMenuBar(menu);
		calcPanel = new JPanel();
		calcPanel.setLayout(new GridLayout(0,1));
		screenPanel = new JTextArea("leer");
		frame.setSize(180, 250);
		keypadPanel = new Tastenfeld();
		
		frame.add(calcPanel);
		calcPanel.add(screenPanel);
		
		calcPanel.add(keypadPanel.getKeypad());
		
		screenPanel.setText("Zahlen eingeben");
		
		
	
	}
	
	
	

	public static void main(String[] args) {
		
			CalculatorApp calc = new CalculatorApp();
			
			

	}

}
