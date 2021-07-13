package wörterbuch;

import java.util.ArrayList;

public class DictionaryEntry {
	
	private String german, english;
	
	
	

	public DictionaryEntry(String german, String english) {
		
		this.german = german;
		this.english = english;
	}
	
	

	
	public String getGerman() {
		return german;
	}

	public void setGerman(String german) {
		this.german = german;
	}

	public String getEnglish() {
		return english;
	}

	public void setEnglish(String english) {
		this.english = english;
	}
	
	

}
