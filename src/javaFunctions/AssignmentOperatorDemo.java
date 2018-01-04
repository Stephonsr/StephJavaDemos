package javaFunctions;

public class AssignmentOperatorDemo {
	public static void main(String[] args) {
		//Literal Primitive Assignment
		byte b = 25;
		System.out.println("Primitive byte Assignment- "+ b);
		//Assigning one primitive to another primitive 
		byte c =b;
		System.out.println("Primitive byte Assignment from another byte variable- "+ c);
		//Literal assignment based on arithmetic operation
		int a = 23+b;
		System.out.println("Primitive int Assignment from arithmetic operation- "+ a);
		//Implicit Casting of variable x and y
		short s = 45;
		int x = b;		
		int y = s;
		System.out.println("Implicit Casting of byte to int- "+ x);
		System.out.println("Implicit Casting of short to int- "+ y);
		//Short-Hand Assignment Operators
		int i = 10;
		i+=10;
		System.out.println("Addition Oprator- "+ i);
		i-=10;
		System.out.println("Subtraction Oprator- "+ i);	
		i*=10;
		System.out.println("Multiplication Operator- " + i);
		i/=10;
		System.out.println("Division Operator- " + i);
		i%=3;
		System.out.println("Reminder Operator- " + i);
	}
}
