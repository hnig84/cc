package hangman;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StartButtonListener implements ActionListener {

	HangmanFrame startFrame;
	
	public StartButtonListener(HangmanFrame startFrame) {
		this.startFrame = startFrame;
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
		
	    String selectedWordBook = startFrame.panel.subjectButtons.getSelection().getActionCommand();
		System.out.println(selectedWordBook);
		startFrame.selectedWordBook = WordBookEnum.valueOf(selectedWordBook);
		
		int attempts = Integer.parseInt(startFrame.panel.attemptButtons.getSelection().getActionCommand());
		startFrame.attempts = attempts;
		startFrame.onStartButtonClicked();
		
	}

	
	
}
