package hangman2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

public class GameButtonListener implements ActionListener{
	HangmanData data;
	HangmanFrame frame;

	@Override
	public void actionPerformed(ActionEvent e) {
		/*
		 * checks if user won or lose then checks the input with HangmanData.attempt()
		 */
		if(data.getRandomWord().equalsIgnoreCase(frame.gamePanel.input.getText()))
				data.setWon(true);
			else if(data.getAttempts() > data.getMaxAttempts()) {
				frame.gamePanel.topLabel.setText(data.getRandomWord());
				JOptionPane.showMessageDialog(null, "Alle Versuche aufgebraucht!");
				
			}
			else if(!data.getHiddenWord().contains("_")) 
				data.setWon(true);
		
		else {
			try {
				String tmpStr = frame.gamePanel.input.getText();
				char tmpChar = tmpStr.charAt(0);
				frame.gamePanel.topLabel.setText(data.attempt(tmpChar));
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				System.out.println("leer");
			}
			
			}
		if(data.isWon()) {
			JOptionPane.showMessageDialog(null,"<html><h1>Gewonnen</h1><br>"+ data.getPoints() +" Punkte<br>" + data.getAttempts() + " Versuche");
			frame.gamePanel.topLabel.setText("Gewonnen");
			
		}
		frame.gamePanel.input.setText("");
	}
		
}


