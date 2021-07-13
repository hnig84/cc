package wörterbuch;

import java.util.ArrayList;
import java.util.Scanner;

public class Dictionary {
	
	Scanner sc = new Scanner(System.in);
	private DictionaryEntry wordpair;
	static ArrayList<DictionaryEntry> dictionary = new ArrayList<DictionaryEntry>();
	
	
	
	public static void addWordpair(String english, String german) {
		
		dictionary.add(new DictionaryEntry(german, english));
	}
	
	public void inputWordpair() {
		System.out.println("Wortpaar eingeben");
		System.out.println("deutsch: ");
		wordpair.setGerman(sc.next());
		System.out.println("english: ");
		wordpair.setEnglish(sc.next());
		addWordpair(wordpair.getEnglish(), wordpair.getGerman());
		
	}
	public String translateIntoGerman(String english) {
		String tmp = "";
		for(DictionaryEntry word : dictionary) {
			if(english.equalsIgnoreCase(word.getEnglish())) {
				tmp = word.getGerman();
			}
		}
		return tmp;
	}

	public String translateIntoEnglish(String german) {
		String tmp = "";
		for(DictionaryEntry word : dictionary) {
			if(german.equalsIgnoreCase(word.getGerman())) {
				tmp = word.getEnglish();
			}
		}
		return tmp;
	}
	public static void main(String[] args) {
		

	}

}
