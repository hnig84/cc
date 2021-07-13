package hangman;

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

	WordBookEnum selectedWordBook;
	int attempts;
	int rounds;
	String letter;
	JMenuBar menubar;
	
	/**
	 * the player can choose the subject of the word to guess
	 * and the amount of attempts
	 */
	private static final long serialVersionUID = 1L;
    StartPanel panel;
    GamePanel gamePanel;
    
    
    
	public HangmanFrame() {
		init();
		
	}
	
	public void init() {
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(true);
		setLocationRelativeTo(null);
		setSize(300, 300);
		setVisible(true);
		
		
		panel = new StartPanel(this);
		setContentPane(panel);
		setJMenuBar(createMenuBar());
		revalidate();
		
	}
	
	/*
	 * menu with option "close" and option to extend wordbook
	 */
	public JMenuBar createMenuBar() {
		JMenuBar bar = new JMenuBar();
		JMenu options = new JMenu("Options");
		JMenu game = new JMenu("Spiel");
		
		JMenuItem giveUp = new JMenuItem("Auflösen");
		giveUp.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				GamePanel.giveUp();
				
			}
		});
		
		JMenuItem newGame = new JMenuItem("Neues Spiel");
		newGame.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				onNewGameClicked();
				
			}
		});
		
		JMenuItem close = new JMenuItem("Schließen");
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
		game.add(giveUp);
		game.add(newGame);
		game.add(newWord);
		
		bar.add(game);
		bar.add(options);
		
		return bar;
	}
	
	
	/*
	 * method for StartbuttonListener to display the gamepanel after clicking button
	 */
	public void onStartButtonClicked() {
		
		rounds++;
		setContentPane(new GamePanel(this));
		
		this.revalidate();
		
		
		
	}
	/*
	 * method for StartbuttonListener to display the gamepanel after clicking button
	 */
	public void onNewGameClicked() {
		
		new HangmanFrame();
		setSize(300, 300);
		setContentPane(new StartPanel(this));
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		
		this.revalidate();
	   
	}
	
}
