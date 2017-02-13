package week7;

import java.util.ArrayList;
import edu.princeton.cs.introcs.In;

public class CountingWorld {

	public static void main(String[] args) {
		In input = new In("states.txt");
		
		ArrayList<LetterFrequency> wordCount = new ArrayList<LetterFrequency>();
		
		char c = ' ';
		int i = 0;
		while (!input.isEmpty()){
			c = input.readChar();
			i = 0;
			
			while( i < wordCount.size() ){
				if( wordCount.get(i).sameChar(c) ) {
					wordCount.get(i).incrementAppearance();
					break;
				}
				i = i + 1;
			}
			
			if(i >= wordCount.size()) {
				wordCount.add(new LetterFrequency(c));
			}
			
		}
		
		System.out.println(wordCount.size());
	}

}
