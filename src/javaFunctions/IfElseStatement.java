package javaFunctions;

public class IfElseStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 10;

		if (number > 0) {
			System.out.println("Number is positive.");
		} else {
			System.out.println("Number is not positive.");
		}

		System.out.println("This statement is always executed.");

		int numbers = 0;
		{
             
			if (numbers > 0) {
				System.out.println("Number is positive.");
			} else if (numbers < 0) {
				System.out.println("Number is negative.");
			} else {
				System.out.println("Number is 0.");
				
				//Nested if else Statement
				Double n1 = -1.0, n2 = 4.5, n3 = -5.3, largestNumber;

				if (n1 >= n2) {
					if (n1 >= n3) {
						largestNumber = n1;
					} else {
						largestNumber = n3;
					}
				} else {
					if (n2 >= n3) {
						largestNumber = n2;
					} else {
						largestNumber = n3;
					}
				}
				 System.out.println("Largest number is " + largestNumber);}
		}
	}
}
