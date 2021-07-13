package hangman2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class HMController {

	static HangmanData data;
	static HangmanFrame frame;
	static GamePanel gamePanel;
	StartPanel startPanel;
	
	public HMController() {
		
			init();
	}
	private void init() {
		
		frame = new HangmanFrame();
		frame.setContentPane(new StartPanel());
		
		
	}
		
	public static void game() {
		
		frame = new HangmanFrame();
		frame.setContentPane(new GamePanel());
		gamePanel = (GamePanel) frame.getContentPane();
		data = new HangmanData();
		data.setSubject(GamePanel.selectedWordBook);
		data.setMaxAttempts(GamePanel.maxAttempts);
		data.loadWords();
		data.randomizeGuessword();
		data.setRandomWord(data.randomizeGuessword());
		data.setHiddenWord(data.createHidden());
		
		gamePanel.topLabel = new JLabel(data.getHiddenWord(), JLabel.CENTER);
		
	    gamePanel.input = new JTextField();
	    gamePanel.confirm = new JButton("Eingabe");
	    gamePanel.confirm.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				/*
				 * checks if user won or lose then checks the input with HangmanData.attempt()
				 */
				if(data.getRandomWord().equalsIgnoreCase(gamePanel.input.getText()))
						data.setWon(true);
					else if(data.getAttempts() > data.getMaxAttempts()) {
						gamePanel.topLabel.setText(data.getRandomWord());
						JOptionPane.showMessageDialog(null, "Alle Versuche aufgebraucht!");
						gamePanel.topLabel.setText(data.getRandomWord());
						
					}
					else if(!data.getHiddenWord().contains("_")) 
						data.setWon(true);
				
				else {
					try {
						String tmpStr = gamePanel.input.getText();
						char tmpChar = tmpStr.charAt(0);
						gamePanel.topLabel.setText(data.attempt(tmpChar));
					} catch (Exception e1) {
						// TODO Auto-generated catch block
						System.out.println("leer");
					}
					
					}
				if(data.isWon()) {
					JOptionPane.showMessageDialog(null,"<html><h1>Gewonnen</h1><br>"+ data.getPoints() +" Punkte<br>" + data.getAttempts() + " Versuche");
					gamePanel.topLabel.setText("Gewonnen");
					
				}
				gamePanel.input.setText("");
			}
		});
	    	    
	}	
}

   
	
	


