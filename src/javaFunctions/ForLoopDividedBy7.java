package javaFunctions;

public class ForLoopDividedBy7 {

	public static void main(String[] args) {
		//
		for (int i = 100; i > 20; --i) {
			// prints all values divisible by7 in the range
			// of 1 to 100 in reverse order
			if (i % 7 == 0) {
				System.out.print(i);
				System.out.print(", ");
			}
		}
	}
}