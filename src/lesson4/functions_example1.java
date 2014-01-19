package lesson4;

import assets.TextIO;

public class functions_example1 {

	/**
	 * This is not an exercise! The purpose of this is to give
	 * an example of the syntax of a function.
	 */
	public static void main(String[] args) {
		
		int size = 10;
		int[] myArray = new int[size];
		
		for(int i = 0; i < myArray.length; i++)
			myArray[i] = i;
		
		TextIO.putln("Old contents");
		for(int i = 0; i < myArray.length; i++)
			TextIO.putln(myArray[i]);
		
		incrementArray(myArray);
		
		TextIO.putln();
		
		TextIO.putln("New contents");
		for(int i = 0; i < myArray.length; i++)
			TextIO.putln(myArray[i]);

	}
	
	// Example of a function with no parameters, and no return value
	// Simply prints "hello" to the screen
	public static void hello() {
		TextIO.putln("hello!");
	}
	
	// Example of a function that takes one parameter (a String array) and
	// prints all of its contents
	public static void printArray(String[] array) {
		TextIO.putln("The contents of this array are:");
		for(int i = 0; i < array.length; i++) {
			if(array[i] == null) TextIO.putln(i + " EMPTY");
			else TextIO.putln(i + " " + array[i]);
		}
	}
	
	// Example of a function that takes an int[] and increments each number inside
	public static void incrementArray(int[] array) {
		for(int i = 0; i < array.length; i++)
			array[i] = array[i] + 1;
	}
	

}
