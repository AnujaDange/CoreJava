package com.BranchingStatement;

public class ArrContinuest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "peck of pickled peppers";
		int p_position = 0;
		int max = str.length();
		for (int i = 0; i < max; i++) {
			if (str.charAt(i) == 'p') {
				// here we use charAt() method to seperate single character from the sentence
				// continue;
				p_position++;
			}

		}

		System.out.println(p_position);
	}

}
