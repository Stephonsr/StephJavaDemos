package javaFunctions;

public class OperatorContinued {

	public static void main(String[] args) {
		// Here's an example of instance of operator.
		String test = "asdf";
    	boolean results;
    	
    	results = test instanceof String;
    	System.out.println(results);
    	
    	int number1 = 1, number2 = 2, number3 = 9;
    	boolean result;
    	
    	// At least one expression needs to be true for result to be true
    	result = (number1 > number2) || (number3 > number1);
    	// result will be true because (number1 > number2) is true
    	System.out.println(result);
    			
    	// All expression must be true from result to be true	
    	result = (number1 > number2) && (number3 > number1);
    	// result will be false because	(number3 > number1) is false
    	System.out.println(result);
	}
//will be true. It's because test is the instance of String class.
}
