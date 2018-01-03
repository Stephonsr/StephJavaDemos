package javaFunctions;

// array that contain other arrays
//The two-dimensional array is the most basic multidimensional array. 
public class MultidimensionalArray {

	public static void main(String[] args) {
		// provide two indexes, one for the array, and another for the element inside
		// that array.
		int[][] sample = { { 1, 2, 3 }, { 4, 5, 6 } };
		// two indexes are called row index and column index.
		int x = sample[1][0];
		System.out.println(x);

		//example 2 don't quite understand
		int[ ][ ] myArr = { {1, 2, 3}, {4}, {5, 6, 7} };
        myArr[0][2] = 42;
        int y = myArr[1][0];
        
        System.out.println(y);
	}

}
