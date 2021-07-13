package hangman2;

import java.awt.GridLayout;
import java.awt.MenuBar;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

public class HangmanFrame extends JFrame {

	String letter;
	JMenuBar menubar;
	
	/**
	 * the player can choose the subject of the word to guess
	 * and the amount of attempts
	 */
	private static final long serialVersionUID = 1L;
    StartPanel startPanel;
    GamePanel gamePanel;
    
    
    
	public HangmanFrame() {
		startPanel = new StartPanel();
		gamePanel = new GamePanel();
		init();
		
	}
	
	public void init() {
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(true);
		setLocationRelativeTo(null);
		setSize(300, 300);
		setJMenuBar(createMenuBar());
		setVisible(true);
		
		
		
	}
	
	/*
	 * menu with option "close" and option to extend wordbook
	 */
	public JMenuBar createMenuBar() {
		JMenuBar bar = new JMenuBar();
		JMenu options = new JMenu("Options");
		JMenu game = new JMenu("Spiel");
		
		JMenuItem newGame = new JMenuItem("Neues Spiel");
		newGame.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				onNewGameClicked();
				
			}
		});
		
		JMenuItem close = new JMenuItem("Schlieﬂen");
		close.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
				
			}
		});
		
		JMenuItem newWord = new JMenuItem("Neuer Eintrag");
		newWord.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				SaveFrame sv = new SaveFrame();
				
			}
		});
		options.add(close);
		game.add(newGame);
		game.add(newWord);
		
		bar.add(game);
		bar.add(options);
		
		return bar;
	}
	
	
	
	/*
	 * method for StartbuttonListener to display the gamepanel after clicking button
	 */
	public void onNewGameClicked() {
		
		
		
	   
	}
	
}
