package hangman;

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
	
	HangmanFrame startFrame;
	static HangmanData data;
	
	public GamePanel(HangmanFrame startFrame) {
		this.startFrame = startFrame;
		
		init();
		
		
	}
	
	
	private static JLabel topLabel;
	
	JTextField input;
	JButton confirm;

	
	public void init() {
		
		setLayout(new GridLayout(0,1));
		
		/*
		 * loading  the games data
		 */
		
		data = new HangmanData();
		data.setSubject(startFrame.selectedWordBook);
		data.setMaxAttempts(startFrame.attempts);
		data.loadWords();
		data.setRandomWord(data.randomizeGuessword());
		data.setHiddenWord(data.createHidden());

		topLabel = new JLabel(data.getHiddenWord(), JLabel.CENTER);
		
		
	    input = new JTextField();
	    confirm = new JButton("Eingabe");
	    confirm.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				/*
				 * checks if user won or lose then checks the input with HangmanData.attempt()
				 */
				if(data.getRandomWord().equalsIgnoreCase(input.getText()))
						data.setWon(true);
					
					else if(data.getAttempts() > data.getMaxAttempts()) {
						giveUp();
						JOptionPane.showMessageDialog(null, "Alle Versuche aufgebraucht!");
						
					}
					else if(!data.getHiddenWord().contains("_")) 
						data.setWon(true);
				
				else {
					
					try {
						String tmpStr = input.getText();
						char tmpChar = tmpStr.charAt(0);
						topLabel.setText(data.attempt(tmpChar));
					} catch (Exception e1) {
						// TODO Auto-generated catch block
						System.out.println("leer");
					}
					
					}
				if(data.isWon()) {
					JOptionPane.showMessageDialog(null,"<html><h1>Gewonnen</h1><br>"+ data.getPoints() +" Punkte<br>" + data.getAttempts() + " Versuche");
					topLabel.setText("<html><center><h2>Gewonnen</h2><br>" + data.getRandomWord() + "</html>");
					
				}
				input.setText("");
			}
		});
	    
	    add(topLabel);
	    add(input);
	    add(confirm);
	    
	    
	}
	
	public static void giveUp() {
		topLabel.setText("<html><center><h2>Verloren</h2><br><h3>" + data.getRandomWord() + "</html>");
	}
    
}
