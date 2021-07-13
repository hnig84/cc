package hangman;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;



@SuppressWarnings("serial")
public class SaveFrame extends JFrame {
	
	File wordBookToSave;
	
	JLabel saveLabel;
	JComboBox<String> wordBookBox;
	JTextField input;
	
	public SaveFrame() {
		init();
	}
	
	final class SaveListener implements ActionListener{
		HangmanData data = new HangmanData();

		@Override
		public void actionPerformed(ActionEvent e) {
			switch((String) wordBookBox.getSelectedItem()) {
				
				case "Blumen": wordBookToSave = data.getFlowers();
					break;
				case "Geographie": wordBookToSave = data.getGeography();
					break;
				case "Informatik": wordBookToSave = data.getInformatik();
					break;
				default: System.out.println("fehler"); break;
				}
				
			try {
				BufferedWriter bw = new BufferedWriter(new FileWriter(wordBookToSave, true));
				bw.write("\n" + input.getText());
				bw.flush();
				bw.close();
				input.setText("");
				System.out.println(wordBookToSave.getName());
				System.out.println(input.getText());
				
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				System.out.println("fehler beim schreiben");
			}
			
			
		}
		
	}

	public void init() {
		JPanel savePanel = new JPanel();
		savePanel.setLayout(new BorderLayout());
		
		input = new JTextField();
		String[] wordbook = {WordBookEnum.Blumen.name(), WordBookEnum.Geographie.name(), WordBookEnum.Informatik.name() };
		
		wordBookBox = new JComboBox<String>(wordbook);
		
		saveLabel = new JLabel("<html><center><h3>Wörterbuch</h3><br>neuen Eintrag hinzufügen</center></html>");
		JButton confirm = new JButton("Speichern");
		
		SaveListener sl = new SaveListener();
		confirm.addActionListener(sl);
		
		savePanel.add(saveLabel, BorderLayout.NORTH);
		savePanel.add(wordBookBox, BorderLayout.EAST);
		savePanel.add(input, BorderLayout.CENTER);
		savePanel.add(confirm, BorderLayout.SOUTH);
		
		setContentPane(savePanel);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setLocationRelativeTo(null);
		setSize(300, 165);
		setVisible(true);
		
	}
	
}
