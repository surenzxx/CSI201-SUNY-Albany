package week7;

public class LetterFrequency {
	
	public char letter;
	public int letterCounter;
	
	//Constructor
	public LetterFrequency(char c) { // 'c' refers to any letter inside the value you place for letter
		letterCounter = 1;
		letter = c;
	}
	
	public int getNumofApperances() {
		return letterCounter;
	}
	
	
	public void incrementAppearance() {
		letterCounter = letterCounter + 1;
	}
	
	public boolean sameChar(char c) { 
		if(letter == c) {
			return true;
		}
		return false;
	}
	

	public static void main(String[] args) {
 
	}

}
