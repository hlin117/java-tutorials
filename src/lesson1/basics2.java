package lesson1;
import assets.TextIO;

public class basics2 {

	/**
	 * Debug this function!
	 */
	public static void main(String[] args) {
		
		// TODO: Fix the three lines below
		String phrase = "Enter in a number";
		TextIO.putln(phrase);
		int number = TextIO.getInt();				// Hint! TextIO.getln() returns a String!
												// TextIO.getInt() would be more appropriate here
		
		// You don't need to edit the code below
		if(number < 20) { 
			TextIO.putln(number + " is less than 20.");
		}
		else {			
			TextIO.putln(number + " is greater than or equal to 20.");
		}
	}

}
