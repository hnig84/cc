package hangman2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class HangmanData {
	
	private File flowers = new File("E:\\flowers.txt"); // words to fill the wordbank
	private File geography = new File("E:\\geography.txt");
	private File informatik = new File("E:\\informatik.txt");
	
	private String randomWord = ""; // the word random chosen by CPU
	private String hiddenWord = ""; // Initial of randomWord + underscores like A _ _ _ _ _ _ 
	private char usersGuess; // the guess of the user #
	private int points; // points decrementing with every failed attempt
	private int attempts; // attempt counter
	private int maxAttempts;
	private boolean isWon;
	private int rounds; // gamerounds to count
	
	private WordBookEnum subject; // user chooses the subject of wordbank
	private ArrayList<String> wordBank;
	
	Scanner filescanner;
	
	/*
	 * the method switches on the subject and creates the specific word array
	 */
	public void loadWords() {
		try {
			switch (subject) {
		case Blumen: filescanner = new Scanner(flowers);
					fillArray();
						break;
		case Geographie: filescanner = new Scanner(geography);
					fillArray();
						break;
		case Informatik: filescanner = new Scanner(informatik);
					fillArray();
						break;
		}
		} catch (FileNotFoundException e) {
			JOptionPane.showMessageDialog(null, "File nor found", null, JOptionPane.ERROR_MESSAGE);;
		}
	}
	
		
	/*
	 * fill an ArrayList with words from the File
	 */
	public void fillArray() {
		wordBank = new ArrayList<String>();
		while(filescanner.hasNextLine()) {
			String word = filescanner.nextLine();
			wordBank.add(word);
		}
	}
	
	
	
	/*
	 * randomly choosen guessword 
	 */
	public String randomizeGuessword() {
		attempts = 0;
		int choose = (int) (Math.random() * wordBank.size());
		String guessword = wordBank.get(choose);
		
		return guessword;
	}
	
	/*
	 * method creates the displayed hidden word like "A__________"
	 */
	public String createHidden() {
		String underScores = "";
		for(int i = 1; i < randomWord.length(); i++) {
			underScores += "_";
		}
			;
		String hidden = randomWord.charAt(0) + underScores;
		return hidden;
	}
	
	/*
	 * attempt method creates a tmp stringbuilder 
	 * loop checks every position, if equals 
	 * the _ gets replaced by the matching char at the correct
	 * if no match in one attempt, points are decremented
	 */
	public String attempt(char input) {
		StringBuilder newStr = new StringBuilder(hiddenWord);
		boolean flag = false;
		
			for(int i = 1; i < randomWord.length(); i++) {
				if(randomWord.charAt(i) == input) {
					flag = true;
					newStr.setCharAt(i, input);
			}
						
		}
		
		if(!flag)
			points--;
		String word = newStr.toString();
		attempts++;
		hiddenWord = word;
		return word;
	}
	
	/*
	 * displays statistics after the game
	 */
	public void endGame() {
		
		
	}

	

	/*
	 * Getters and Setters
	 */
	
	public File getFlowers() {
		return flowers;
	}


	public void setFlowers(File flowers) {
		this.flowers = flowers;
	}


	public File getGeography() {
		return geography;
	}


	public void setGeography(File geography) {
		this.geography = geography;
	}


	public String getRandomWord() {
		return randomWord;
	}


	public void setRandomWord(String randomWord) {
		this.randomWord = randomWord;
	}


	public String getHiddenWord() {
		return hiddenWord;
	}


	public void setHiddenWord(String hiddenWord) {
		this.hiddenWord = hiddenWord;
	}


	public char getUsersGuess() {
		return usersGuess;
	}


	public void setUsersGuess(char usersGuess) {
		this.usersGuess = usersGuess;
	}


	public int getPoints() {
		return points;
	}


	public void setPoints(int points) {
		this.points = points;
	}


	public int getAttempts() {
		return attempts;
	}


	public void setAttempts(int attempts) {
		this.attempts = attempts;
	}


	public WordBookEnum getSubject() {
		return subject;
	}


	public void setSubject(WordBookEnum subject) {
		this.subject = subject;
	}


	public ArrayList<String> getWordBank() {
		return wordBank;
	}


	public void setWordBank(ArrayList<String> wordBank) {
		this.wordBank = wordBank;
	}


	public Scanner getFilescanner() {
		return filescanner;
	}


	public void setFilescanner(Scanner filescanner) {
		this.filescanner = filescanner;
	}


	public int getMaxAttempts() {
		return maxAttempts;
	}


	public void setMaxAttempts(int maxAttempts) {
		this.maxAttempts = maxAttempts;
	}


	public boolean isWon() {
		return isWon;
	}


	public void setWon(boolean isWon) {
		this.isWon = isWon;
	}


	public File getInformatik() {
		return informatik;
	}


	public void setInformatik(File informatik) {
		this.informatik = informatik;
	}


	public int getRounds() {
		return rounds;
	}


	public void setRounds(int rounds) {
		this.rounds = rounds;
	}
	
	
	
}
