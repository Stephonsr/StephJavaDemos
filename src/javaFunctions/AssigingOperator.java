package javaFunctions;

public class AssigingOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number3, number4;

		// Assigning 5 to number3
		number3 = 5;
		System.out.println(number3);

		// Assigning value of variable number4 to number3
		number4 = number3;
		System.out.println(number4);

		double number1 = 12.5, number2 = 3.5, result;

		// Using addition operator
		result = number1 + number2;
		System.out.println("number1 + number2 = " + result);

		// Using subtraction operator
		result = number1 - number2;
		System.out.println("number1 - number2 = " + result);

		// Using multiplication operator
		result = number1 * number2;
		System.out.println("number1 * number2 = " + result);

		// Using division operator
		result = number1 / number2;
		System.out.println("number1 / number2 = " + result);

		// Using remainder operator
		result = number1 % number2;
		System.out.println("number1 % number2 = " + result);
		{
			// results have 2 b changed 2 result n order 2 work
			// ArithmeticOperators
			String start, middle, end, results;

			start = "Talk is cheap. ";
			middle = "Show me the code. ";
			end = "- Linus Torvalds";

			results = start + middle + end;
			System.out.println(results);
		}
	}

}
