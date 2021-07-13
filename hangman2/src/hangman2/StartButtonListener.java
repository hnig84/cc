package hangman2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;

public class StartButtonListener implements ActionListener {
	StartPanel panel;
	
	
	public StartButtonListener(StartPanel panel) {
		this.panel = panel;
	}
	
	/*
	 * Button action 
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		/*
		 * in startScreen actionButton sets the wordBook and maxAttempts
		 * and switches the frame content from start to gameScreen
		 */
		
	    String selectedWordBook = panel.subjectButtons.getSelection().getActionCommand();
		System.out.println(selectedWordBook);
		GamePanel.selectedWordBook = WordBookEnum.valueOf(selectedWordBook);
		
		int attempts = Integer.parseInt(panel.attemptButtons.getSelection().getActionCommand());
		GamePanel.maxAttempts = attempts;
		panel.onStartButtonClicked();
		HMController.game();
		
		
	}

	
	
}
