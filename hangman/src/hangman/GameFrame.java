package hangman;

import javax.swing.JFrame;

public class GameFrame extends JFrame{
	
	public GameFrame() {
		setContentPane(new GamePanel((HangmanFrame) this.getContentPane()));
	}

}
