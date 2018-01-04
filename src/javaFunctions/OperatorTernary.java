package javaFunctions;

public class OperatorTernary {

	public static void main(String[] args) {
		// If the Expression is true, expression1 is assigned to variable.
		// If the Expression is false, expression2 is assigned to variable.
		// The conditional operator or ternary operator ?: is shorthand for if-then-else
		// statement. The syntax of conditional operator is:
		// variable = Expression ? expression1 : expression2
		int februaryDays = 29;
    	String result;
    	
    	result =  (februaryDays == 28) ? "Not a leap year" : "Leap year";
    	System.out.println(result);
	}

}
