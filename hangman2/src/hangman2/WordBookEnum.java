package hangman2;

public enum WordBookEnum {
	Blumen(0),
	Geographie(1),
	Informatik(2);
	
	public int value;
	WordBookEnum(int value){
		this.value = value;
	}
}
