package lesson4;

public class basics10 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// Initializing a random array of length 20
		int size = 20;
		int[] array = new int[size];
		randomArray(array, 0, 20);

		// Shows the output from swapping the first and last values
		firstLastSwap(array);
		printArray(array);
		
		// Shows the output from doubling the size of the array
		doubleSize(array);
		printArray(array);
	}
	
	/**
	 * Fills an array with random numbers between min and max.
	 * 
	 * You do not need to modify this function. 
	 * 
	 * @param array
	 * @param min
	 * @param max
	 */
	public static void randomArray(int[] array, int min, int max) {
		for(int i = 0; i < array.length; i++) {
			array[i] = (int) (Math.random() * (max - min)) + min;
		}
	}
	
	/**
	 * TODO: Swap the first value and last value of the input array.
	 * For example, if the input array were [9, 20, 0], the end result
	 * of the array would be [0, 20, 9].
	 * 
	 * @param array
	 */
	public static void firstLastSwap(int[] array) {
		
		
	
	}
	
	/**
	 * TODO: Print the contents of your array. in the following
	 * format:
	 * 
	 * Index i: array[i]
	 * 
	 * @param array
	 */
	public static void printArray(int[] array) {
		
		
		
	}

	/**
	 * TODO: Write a function that doubles the size of the input array.
	 */
	public static void doubleSize(int[] array) {
		
		
	}
}
