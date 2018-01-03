package javaFunctions;

public class ForLoop {

	public static void main(String[] args) {
		// Initialization: Expression executes only once during the beginning of loop
		// Condition: Is evaluated each time the loop iterates. The loop executes the
		// statement repeatedly, until this condition returns false.
		// Increment/Decrement: Executes after each iteration of the loop.

		for (int x = 1; x <= 5; x++) {
			// initialization^,condition^,in/de^

			System.out.println(x);
		}
		System.out.println("line end");
		// You can have any type of condition and any type of increment statements in
		// the for loop.
		// The example below prints only the even values between 0 and 10:
		for (int x = 0; x <= 10; x = x + 2) {
			System.out.println(x);

		}
	}
}