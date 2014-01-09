package lesson2;

import assets.TextIO;

public class basics4 {

	/**
	 * This exercise is to have you get used to using the ! operator
	 */
	public static void main(String[] args) {

		// TODO: Prompt the user an integer here, and store the number into num.
		// Hint: Refer to basics2.java (lesson1)
		TextIO.putln("Pick a number any number..");
		int num = TextIO.getInt();
		// Pretend that for whatever reason, the < key on your computer doesn't work.
		// Fill in the blank to make the following statement evaluate to true if num < 20.
		if(!(num >= 20))
			TextIO.putln(num + " is less than 20.");
	}

}
