package javaFunctions;

import java.util.Scanner;

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
		
		//Java switch example two
		char operator;
    	Double number1, number2, result;
    	
    	Scanner scanner = new Scanner(System.in);
    	System.out.print("Enter operator (either +, -, * or /): ");
    	operator = scanner.next().charAt(0);
    	System.out.print("Enter number1 and number2 respectively: ");
    	number1 = scanner.nextDouble();
    	number2 = scanner.nextDouble();
    	
    	switch (operator) {
         case '+':
           result = number1 + number2;
    	   System.out.print(number1 + "+" + number2 + " = " + result);
           break;

         case '-':
           result = number1 - number2;
           System.out.print(number1 + "-" + number2 + " = " + result);
           break;

         case '*':
           result = number1 * number2;
           System.out.print(number1 + "*" + number2 + " = " + result);
           break;

         case '/':
           result = number1 / number2;
           System.out.print(number1 + "/" + number2 + " = " + result);
           break;

         default: 
           System.out.println("Invalid operator!");
           break;

	}
}}
