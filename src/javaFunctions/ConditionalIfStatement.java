package javaFunctions;

public class ConditionalIfStatement {

	public static void main(String[] args) {
		// x get the value of 7
		int x = 7;
		// if 7<42 than printline "hi"
		if (x < 15) {
			//must create 2 ifs if u want another else
			if (x < 1) {
				//both #  have 2 b larger than 7 to print hi
				System.out.println("Hi");
				// this statement is jumped 2 next if
				// the 1st statement false
				// so if 7isnt <42 it'll print out "Welcome"
			} else {
				//if 7 is larger than the variable than this prints
				System.out.println("Welcome!");
			}
			//if the first if is smaller than 7 than this prints
			
		} else {
			System.out.println("Error");
		}

	}
}