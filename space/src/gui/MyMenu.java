package gui;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

@SuppressWarnings("serial")

public class MyMenu extends JMenuBar{
	
	static JMenuBar menuBar = new JMenuBar();
	static JMenu optionsMenu = new JMenu("File");
	static JMenuItem menuClose = new JMenuItem("Close");
	
public MyMenu() {
	
}

//	MenuBar aufbauen
public JMenuBar createMenu() {
			
//			 MenuBar Eintrag
			
			menuBar.add(optionsMenu);
		
//			 Menu Einträge
			
			
			menuClose.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					System.exit(0);
					
				}
			});
			optionsMenu.add(menuClose);
//			editMenu.add(new JSeparator());
		menuBar.setVisible(true);
		return menuBar;
	
}

	public void addMenuItem(JMenuItem item) {
		optionsMenu.add(item);
	}
}
