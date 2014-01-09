package lesson3;

import assets.TextIO;

public class basics7 {

	public static void main(String[] args) {
		
		/**
		 * TODO: Write a program that only allows a user to finish using
		 * a program if the user types "please".
		 * 
		 * Some code has already been completed for you.
		 */
		boolean isPlease = false;			// This is a flag.
		
		while(!isPlease) {
			TextIO.putln("Please type the word please.");
			String input = TextIO.getln();
			
			/* TODO: Finish the code inside this while loop.
			 * 
			 * HINT: Strings are objects, and objects have their own 
			 * special "equals" operator/function as oppose to the "==" operator we 
			 * use on primitives.
			 * 
			 * To check whether string1 is the same as "string2" (ignoring case), perform
			 * string1.equalsIgnoreCase("string2")
			 * 
			 */

		}
		
		TextIO.putln("Thank you for saying please.");

	}

}
