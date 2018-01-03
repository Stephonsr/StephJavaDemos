package javaFunctions;

import java.util.Scanner;

public class ConvertsToMeters {

	public static void main(String[] args) {
		// Write a Java program that reads a number in inches, converts it to meters.
		// Note: One inch is 0.0254 meter.
		Scanner input = new Scanner(System.in);

		System.out.print("Input a value for inch: ");
		double inch = input.nextDouble();
		double meters = inch * 0.0254;
		System.out.println(inch + " inch is " + meters + " meters");

	}

}
