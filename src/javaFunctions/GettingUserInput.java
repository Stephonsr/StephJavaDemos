package javaFunctions;

import java.util.Scanner;

public class GettingUserInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		//Scanner input = new Scanner(System.in);
		//int number = input.nextInt();

		System.out.print("Enter an integer: ");
		// Switch when String is involved ex.String number=input.nextLine();
		int number = input.nextInt();
		System.out.println("You entered " + number);

		// To get long, float, double and String input from the user, you can use
		// nextLong(), nextFloat(), nextDouble() and next() methods respectively.

		Scanner output = new Scanner(System.in);

		// Getting float input
		System.out.print("Enter float: ");
		float myFloat = output.nextFloat();
		System.out.println("Float entered = " + myFloat);

		// Getting double input
		System.out.print("Enter double: ");
		float myDouble = output.nextFloat();
		System.out.println("Float entered = " + myDouble);

		// Getting String input
		System.out.print("Enter text: ");
		String myString = output.next();
		System.out.println("Text entered = " + myString);
	}
}
