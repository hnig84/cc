package minihorny;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class HornyViewGame {
	JFrame frame;
	JPanel panel;
	JLabel labelLeer;
	JLabel label;
	JButton gameButton;
	String name;
	int counter;
	String[] sequence = HornyData.getSequence();
	
	
	public HornyViewGame() {
		init();
	}
	
	public void init() {
		panel = new JPanel(new GridLayout(0,1));
		panel.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
		frame = new JFrame("I am Horny");
		frame.setContentPane(panel);
		frame.setSize(400,400);
		frame.setVisible(true);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		labelLeer = new JLabel();
		labelLeer.setOpaque(true);
		labelLeer.setBackground(Color.BLUE);
		
		label = new JLabel("", JLabel.CENTER);
		label.setOpaque(true);
		label.setBackground(Color.BLUE);
		label.setForeground(Color.WHITE);
		
		gameButton = new JButton("Klick mich hart");
		gameButton.setOpaque(true);
		gameButton.setBackground(Color.DARK_GRAY);
		gameButton.setForeground(Color.WHITE);
		
		panel.add(label);
		panel.add(labelLeer);
		panel.add(gameButton);
		
		gameButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					if(counter == 2)
						gameButton.setText("Weiter!");
					
					if(counter == sequence.length - 3 ) 
						playSound();
					if(counter == sequence.length - 3)
						gameButton.setText("Ay Caramba");
					if (counter == sequence.length -2)
						gameButton.setText("Nochmal?");
					
					counter++;
					label.setText(sequence[counter]);
					
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					JOptionPane.showMessageDialog(null, "Danke, aber ich bin fertig. Auf Wiedersehen!" );
				}
				
				
			}
		});
		
		
	}
	
	public void game() {
		String[] labelText;
		labelText = HornyData.getSequence();
		
	}
	public void playSound() throws UnsupportedAudioFileException, IOException, Exception {
		
		 try {
		        AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File("E:\\pain10.wav").getAbsoluteFile());
		        Clip clip = AudioSystem.getClip();
		        clip.open(audioInputStream);
		        clip.start();
		    } catch(Exception ex) {
		        System.out.println("Error with playing sound.");
		        ex.printStackTrace();
		    }
	}

}
