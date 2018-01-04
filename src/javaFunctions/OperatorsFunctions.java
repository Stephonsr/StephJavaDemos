package javaFunctions;

public class OperatorsFunctions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double number = 5.2, resultNumber;
		boolean flag = false;

		System.out.println("+number = " + +number);
		// number is equal to 5.2 here.

		System.out.println("-number = " + -number);
		// number is equal to 5.2 here.

		// ++number is equivalent to number = number + 1
		System.out.println("number = " + ++number);
		// number is equal to 6.2 here.

		// -- number is equivalent to number = number - 1
		System.out.println("number = " + --number);
		// number is equal to 5.2 here.

		System.out.println("!flag = " + !flag);
		// flag is still false.
		{

			// You can also use ++ and -- operator as both prefix and postfix in Java. The
			// ++ operator increases value by 1 and -- operator decreases value by 1.
			double numbers = 5.2;

			System.out.println(numbers++);
			System.out.println(numbers);

			System.out.println(++numbers);
			System.out.println(numbers);
		} // When System.out.println(number++); statement is executed, the original value
			// is evaluated first. The number is increased only after that. That's why you
			// are getting 5.2 as an output. Then, when System.out.println(number); is
			// executed, the increased value 6.2 is displayed.

		// However, when System.out.println(++number); is executed, number is increased
		// by 1 first before it's printed on the screen.
		int number1 = 5, number2 = 6;

    	if (number1 > number2) {
    	//Here, we have used > operator to check if number1 is greater than number2 or not.
    		System.out.println("number1 is greater than number2.");
    	}
    	else
    	{ 
    		System.out.println("number2 is greater than number1.");
	
	
	
	}

}}