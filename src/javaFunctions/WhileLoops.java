package javaFunctions;

public class WhileLoops {

	public static void main(String[] args) {
		int x = 3;
		while (x > 0) {
			System.out.println(x);
			// x=3 so it'll run 3xs until it stops
			x--;
		}
		System.out.println("Loop ended");
		int v = 6;
		//results fail the loop body is skipped n the 1st
		//statement after the while loop is executed
		while (v < 10) {
			System.out.println(v);
			//counts from6 stops at 10 but doesn't print 10
			v++;
		}
		System.out.println("Loop ended");

	}

}