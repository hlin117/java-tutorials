package lesson2;

import assets.TextIO;

public class basics6 {

	/**
	 * This function calculates the cost of shipping a package
	 */
	public static void main(String[] args) {
		
		TextIO.putln("What's the weight of your package?");
		int weight = TextIO.getInt();
		
		TextIO.putln("Would you like to have expedited shipping? (true/false)");
		boolean expedited = TextIO.getlnBoolean();
		
		TextIO.putln("Are you a premium member? (true/false)");
		boolean premium = TextIO.getlnBoolean();
		int cost;

		/**
		 * TODO: You need to assign a cost to the package using the following scale:
		 * 	*	If the weight of the package is less than 5 pounds OR he/she is a premium member,
		 * 		cost = 0
		 * 
		 * 	*	If the user has expedited shipping AND the package is more than 10 pounds, 
		 * 		then the cost of the package is given by:
		 * 		cost = 2 * weight
		 * 
		 * 	*	Otherwise,
		 * 		cost = weight 
		 */
		
		if (weight <5 || premium)
		{
			cost = 0;
		}
		
		else if(expedited && weight >10)
		{
			cost = 2*weight;
		}
		
		else {
			cost = weight;
		}
		
		TextIO.putln("The cost of shipping is " + cost);
	}

}
