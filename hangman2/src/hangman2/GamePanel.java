package hangman2;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class GamePanel extends JPanel {
	
	HangmanFrame gameFrame;
	static WordBookEnum selectedWordBook;
	static int maxAttempts;
		
	public GamePanel() {
		
		
		init();
		
		
	}
	
	JLabel topLabel = new JLabel();
	JTextField input = new JTextField();
	JButton confirm = new JButton();
	

	
	public void init() {
		
		setLayout(new GridLayout(0,1));
		confirm.addActionListener(new GameButtonListener());
	
	    
	    add(topLabel);
	    add(input);
	    add(confirm);
	    
	    
	}
	
	
    
}
