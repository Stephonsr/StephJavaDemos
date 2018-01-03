package javaFunctions;

//used to traverse elements in arrays.
public class EnhancedForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] primes = { 2, 3, 5, 7 };

		for (int t : primes) {
			System.out.println(t);
			// The enhanced for loop declares a variable of a type compatible with the
			// elements of the array being accessed. The variable will be available within
			// the for block, and its value will be the same as the current array element.
			// So, on each iteration of the loop, the variable t will be equal to the
			// corresponding element in the array.
		}
	}

}
