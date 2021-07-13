package minihorny;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class HornyViewStart {
	JFrame frame;
	JPanel panel;
	JTextField input;
	JLabel label;
	JButton startButton;
	String name;
	
	public HornyViewStart() {
		init();
	}
	
	public void init() {
		panel = new JPanel(new GridLayout(0,1));
		panel.setBorder(BorderFactory.createLineBorder(Color.WHITE, 1));
		
		frame = new JFrame("I am Horny");
		frame.setContentPane(panel);
		frame.setSize(300,350);
		frame.setVisible(true);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		label = new JLabel("<html>Herzlich Willkommen bei<p>"
				+ "<h3><center>I am Horny</center></h3><p>Bitte gib deinen Namen ein", JLabel.CENTER);
		label.setOpaque(true);
		label.setBackground(Color.BLACK);
		label.setForeground(Color.WHITE);
		
		input = new JTextField();
		input.setOpaque(true);
		input.setBackground(Color.BLACK);
		input.setForeground(Color.WHITE);
		input.setHorizontalAlignment(SwingConstants.CENTER);
		startButton = new JButton("Los geht's");
		startButton.setBackground(Color.BLACK);
		startButton.setForeground(Color.WHITE);
		
		panel.add(label);
		panel.add(input);
		panel.add(startButton);
		frame.revalidate();
		
		startButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				HornyViewGame game = new HornyViewGame();
				game.name = input.getText();
				game.counter = 0;
				game.label.setText("<html>Hallo <h3>" + game.name + "</h3> schön dich kennenzulernen!<br>Drück den Knopf für mich!");
				
			}
		});
		
	}
	
	
}
