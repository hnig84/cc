package hangman;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.KeyEvent;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class StartPanel extends JPanel {
	
	HangmanFrame startFrame;
	
	public StartPanel(HangmanFrame startFrame) {
		this.startFrame = startFrame;
		init();
	
	}
	
	private JLabel label;
	private String startLabel = "<html><center><h2> Hangman</h3><br><h3>Themengebiet wählen<html>";
	
	JRadioButton firstButton;
	JRadioButton secondButton;
	JRadioButton thirdButton;
	JRadioButton attempts10;
	JRadioButton attempts15;
	
	JButton start;
	
	ButtonGroup subjectButtons;
	ButtonGroup attemptButtons;
	
	public void init() {
		setLayout(new GridLayout(0,1));
		label = new JLabel(startLabel, JLabel.CENTER);
		
		
		firstButton = new JRadioButton(WordBookEnum.Blumen.name());
	    firstButton.setActionCommand(WordBookEnum.Blumen.name());
	    firstButton.setSelected(true);
	
	    secondButton = new JRadioButton(WordBookEnum.Geographie.name());
	    secondButton.setActionCommand(WordBookEnum.Geographie.name());
	    secondButton.setSelected(true);
	    
	    thirdButton = new JRadioButton(WordBookEnum.Informatik.name());
	    thirdButton.setActionCommand(WordBookEnum.Informatik.name());
	    thirdButton.setSelected(true);
	    
	    subjectButtons = new ButtonGroup();
	    subjectButtons.add(firstButton);
	    subjectButtons.add(secondButton);
	    subjectButtons.add(thirdButton);
	    
	    attempts10 = new JRadioButton("10 Versuche");
	    attempts10.setActionCommand("10");
	    attempts10.setSelected(true);
	    
	    attempts15 = new JRadioButton("15 Versuche");
	    attempts15.setActionCommand("15");
	    attempts15.setSelected(true);
	    
	    attemptButtons = new ButtonGroup();
	    attemptButtons.add(attempts10);
	    attemptButtons.add(attempts15);
	    
	    JPanel panelBottom = new JPanel();
	    panelBottom.setLayout(new GridLayout(0,2));
	    panelBottom.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
	    
	    JPanel left = new JPanel();
	    left.setLayout(new GridLayout(0,1));
	    left.add(firstButton);
	    left.add(secondButton);
	    left.add(thirdButton);
	    
	    JPanel right = new JPanel();
	    right.setLayout(new GridLayout(0,1));
	    right.add(attempts10);
	    right.add(attempts15);
	    
	    panelBottom.add(left);
	    panelBottom.add(right);
	    
	    StartButtonListener startButtonListener = new StartButtonListener(startFrame);
	    
	    start = new JButton("Spiel starten");
	    add(label);
	    add(panelBottom);
	    add(start);
	    start.addActionListener(startButtonListener);
	    
	}
    
}
