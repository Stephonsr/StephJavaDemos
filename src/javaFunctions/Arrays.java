package javaFunctions;

public class Arrays {

	public static void main(String[] args) {

		// The name of the array is arr.
		// The type of elements it will hold is int.
		// list start at 0,1,2,3,4
		String[] myNames = { "A", "B", "C", "D" };
		// must place commas in between 2 separate

		System.out.println(myNames[2]);

		// access the length of an array using length property
		int[] intArr = new int[5];
		System.out.println(intArr.length);

		int[] myArr = { 6, 42, 3, 7 };
		int sum = 0;
		
		// for loop is the most used loop when working with arrays
		//for loop to iterate through the array and add 
		//each elements value to the variable
		for (int x = 0; x < myArr.length; x++) {
			// use the length of the array to determine how many
			// times to run the loop.
			sum += myArr[x];
		}
		//declaring a variable a sum 
		System.out.println(sum);
	}

}
