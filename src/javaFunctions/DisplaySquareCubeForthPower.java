package javaFunctions;

import java.util.Scanner;

public class DisplaySquareCubeForthPower {

	public static void main(String[] args) {
		// Write a Java program that reads a number and display the square, cube, and
		// fourth power.
		Scanner in = new Scanner(System.in);
		System.out.print("Input the side length value: ");
		double val = in.nextDouble();

		System.out.printf("Square: %12.2f\n", val * val);
		System.out.printf("Cube: %14.2f\n", val * val * val);
		System.out.printf("Fourth power: %6.2f\n", Math.pow(val, 4));
	}

}
