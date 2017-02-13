package week6;

import edu.princeton.cs.introcs.In;

public class ReadStates {

	public static void main(String[] args) {
		In input = new In("file:states.txt"); // opens file
		int i = 1;
		String str = "";

		while (!input.isEmpty()) {
			str = input.readString();

			if (i % 5 == 0) {
				System.out.println(str);
			}

			i = i + 1;
		}

	}

}
