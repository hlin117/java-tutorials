package lesson4;

public class functions_example2 {

	/**
	 * More about functions
	 * 
	 * The following functions below have return values
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	// Returns true if i is even
	public static boolean isEven(int i) {
		return i % 2 == 0;
	}
	
	// Checks whether an array has a given number.
	public static boolean has(int[] array, int num) {
		for(int i = 0; i < array.length; i++)
			if(array[i] == num) return true;
		
		return false;
		
	}
	
	// Returns an array of some size with a min and max value
	public static int[] makeArray(int size, int min, int max) {
		int[] array = new int[size];
		for(int i = 0; i < array.length; i++)
			array[i] = (int) ((max-min) * Math.random()) + min;
		return array;
	
	}

}
