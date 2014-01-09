package lesson2;

import assets.TextIO;

public class basics5 {

	public static void main(String[] args) {
		TextIO.putln("What's your favorite number?");
		// TODO: Store the user's answer into a variable
		int num = TextIO.getInt();
		/**
		 * TODO: Create two integer variables below called "me" and "henry". Assign
		 * these two variables two different value
		 * 
		 * If the user's number is the same as "me", print "Cool! That's my favorite number too!"
		 * If the user's number is the same as "henry", print "Eww, that's Henry's favorite number"
		 * If the user's number is greater than 9000, print "IT'S OVER NINE-THOUSAND!!!"
		 *
		 * (For simplicity, both "me" and "henry" must be less than 9000) 
		 */
		
		int me = 5;
		int henry = 20;
		
		if(num==me){
			TextIO.putln("Cool! That's my favorite number too!");
		}
		else if(num == henry){
			TextIO.putln("Eww, that's Henry's favorite number.");
		}
		else if (num >9000){
			TextIO.putln("IT'S OVER 9000!");
		}
		else {
			TextIO.putln("EH it's alright.");
		}
	
	
	}

}
