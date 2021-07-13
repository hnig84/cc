package gui;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.nio.charset.CharsetDecoder;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JSeparator;


public class MyFrame extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	

	public MyFrame(JPanel panel){
		setVisible(true);
		setResizable(true);
		setSize(200, 200);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		
		setContentPane(panel);
		
//		MenuBar aufbauen
				JMenuBar menuBar = new JMenuBar();
//				
//				 MenuBar Eintrag
				JMenu fileMenu = new JMenu("File");
				menuBar.add(fileMenu);

//				
//				 Menu Einträge
				
				JMenuItem menuClose = new JMenuItem("Close");
				menuClose.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						System.exit(ABORT);
						
					}
				});
				
				JMenuItem goBack = new JMenuItem("Zurück zur Eingabe");
				goBack.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						
					}
				});
				fileMenu.add(menuClose);
				fileMenu.add(goBack);
//				editMenu.add(new JSeparator());
		
//				 Menubar einbinden
				setJMenuBar(menuBar);
//				
				
	}
	public MyFrame(){
		setVisible(true);
		setResizable(true);
		setSize(200, 200);
	
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
			
	
	}
}
