package lesson4;

import assets.TextIO;

public class array_example {

	/**
	 * Example of the syntax to create arrays, and operations on them
	 */
	public static void main(String[] args) {
		
		// Simple manipulations with an array
		int size = 5;
		String[] string_array = new String[size];
		string_array[0] = "henry";		// Arrays ALWAYS start at index 0 (in java, c++, javascript, python, others...)		
		string_array[1] = "joey";
		string_array[2] = "michelle";
		string_array[3] = "mitra";
		string_array[4] = "shantanu";
		
		// Prints everyone out on the list
		TextIO.putln("The people on the guest list are...");
		for(int i = 0; i < size; i++)
			TextIO.putln(i + ": " + string_array[i]);
		
		TextIO.putln();		// Just creates an empty new line.

		
		// Initializes an array of length 20, and puts values in it using a for-loop
		int[] int_array = new int[20];
		for(int i = 0; i < int_array.length; i++)		// note we used "int_array.length" here
			int_array[i] = i;							// sets a value in index i of the array

		for(int i = 0; i < int_array.length; i++)
			TextIO.putln(int_array[i]);
		
		
		// Example of resizing the int_array above - it's a little complicated

		// First step: Copy the current contents of the old array into a new array of larger size
		int newSize = size*2;
		int[] new_array = new int[newSize];
		for(int i = 0; i < new_array.length; i++)
			new_array[i] = int_array[i];
		
		// Next is to fill the array from index (newSize - size) to newSize-1. This is up to the
		// user to do.
		
	}

}
