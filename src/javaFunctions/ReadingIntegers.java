package javaFunctions;

import java.util.Scanner;

public class ReadingIntegers {

	public static void main(String[] args) {
		// Write a Java program that reads an integer between 0 and 1000 and adds all
		// the digits in the integer.
		Scanner input = new Scanner(System.in);

		System.out.print("Input an integer between 0 and 1000: ");
		int num = input.nextInt();

		int firstDigit = num % 10;
		int remainingNumber = num / 10;
		int SecondDigit = remainingNumber % 10;
		remainingNumber = remainingNumber / 10;
		int thirdDigit = remainingNumber % 10;

		int sum = thirdDigit + SecondDigit + firstDigit;

		System.out.println("The sum of all digits in " + num + " is " + sum);

	}

}
