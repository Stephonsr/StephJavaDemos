package javaFunctions;

public class IncrementAndDecrement {

	public static void main(String[] args) {
		int num = 5;
		--num;
		// The decrement operator is used to decrease the value by one
		System.out.println(num);
		// The same applies add 1 to the value
		int bird = 8;
		++bird;
		System.out.println(bird);
		{
			//using the += add the 2 int 2gether
			int num1 = 4;
			int num2 = 8;
			num2 += num1;
			System.out.println(num2);
			{
				//using the -= subtracts the 2 
				int num3 = 4;
				int num4 = 8;
				num4 -= num3;
				//* multiplies the num		
				System.out.println(num3);{
					int num5 = 4;
					int num6 = 8;
					num5 *= num6;
					
					System.out.println(num5);{
					
						// / divides the num
						int num7 = 2;
						int num8 = 10;
						num8 /= num7;
						System.out.println(num8);
					}
				}

			}
		}

	}

}
