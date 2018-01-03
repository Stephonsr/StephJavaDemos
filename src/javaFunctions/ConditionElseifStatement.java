package javaFunctions;

public class ConditionElseifStatement {

	public static void main(String[] args) {
		int age = 25;
		// 25<=0 than print "Error"
		if (age <= 0) {
			System.out.println("Error");
			// nested else if statement replaces the else
			// lets u add the problem inside goes from top 2 bottom
			// if25<=16 print Too Young
		} else if (age <= 16) {
			System.out.println("Too Young");
			// since 25 is less than or equal 2 100
			// it prints Welcome
		} else if (age < 100) {
			System.out.println("Welcome!");
		} else {
			System.out.println("Really?");
		}
		// created a new int age1 cause age cannot be duplicated
		// this is nested if statements

		int age1 = 22;
		int money = 800;
		// same like above if 22 is > than 18
		// also 800>500 4 this statement to print Welcome
		if (age1 > 18) {
			if (money > 500) {
				// or u can do it like
				// if (age > 18 && money > 500)

				System.out.println("Welcome%");

			}
			int age2 = 25;
			int money1 = 100;
			// the OR operator check if any condition is true if so it prints Welcome
			if (age2 > 18 || money1 > 500) {
				System.out.println("Welcome$");

			}
			
			// The NOT (!) logical operator is used to reverse the logical state of its
			// operand.
			// If a condition is true, the NOT logical operator will make it false.
			int age3 = 25;
			if (!(age3 > 18)) {
				System.out.println("Too Young");
			} else {
				System.out.println("Welcome#");
			}
		}
	}
}