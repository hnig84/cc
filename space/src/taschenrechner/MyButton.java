package taschenrechner;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;

@SuppressWarnings("serial")
public class MyButton extends JButton implements ActionListener{
	
	
	public MyButton(String str) {
		setText(str);
		setSize(50, 50);
		setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
		
	}
	public MyButton() {
		
		}
	

	@Override
	public void actionPerformed(ActionEvent e) {
	
		
	}

	
}
