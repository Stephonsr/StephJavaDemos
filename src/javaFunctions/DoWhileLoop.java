package javaFunctions;

//do while loop similar 2 while except execute at least once 
public class DoWhileLoop {

	public static void main(String[] args) {
		int x = 1;
		do {
			System.out.println(x);
			x++;
			// runs until it hit five prints last#b4 5
		} while (x < 5);
		int y = 9;
		do {
			// even if false condition the code will run once
			System.out.println(y);
			y++;
		} while (x < 0);
		// Adding break transfers execution to the statement immediately following the
		// loop.
		int z = 1;

		while (z > 0) {
			System.out.println(z);
			if (z == 4) {
				break;
			}
			z++;
			for(int c=10; c<=40; c=c+10) {
				  if(c == 30) {
				    continue;
				    //prints 10,20,40 skips over 30
				  }
				  System.out.println(c);

		}
	}
}}