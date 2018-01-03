package javaFunctions;

public class SwitchStatement {

	public static void main(String[] args) {
		//
		int day = 3;
		//switch(expression)
		switch (day) {
		
		case 1:
			System.out.println("Monday");
			//not every case needs a break it'll just keep flowing
			//until a break occurs
		case 2:
			System.out.println("Tuesday");   
			//statements^^^^^^^^^^^
			break;
		case 3:
			System.out.println("Wednesday");
			break;
			//default is used when no commands r meet therefore
			//if all else fell it prints weekday 
			//default always the last statement in switch
		default:
		    System.out.println("Weekday");
		    //no break is needed in the default case
		}

	}
}
