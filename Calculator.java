import java.util.Scanner;
class Calculator
{
	static int add(int x, int y)
	{
		int result = x+y;
		return result;
	}
	static int multiply(int x, int y)
	{
		int result = x*y;
		return result;
	}
	static int substract(int x, int y)
	{
		int result = x-y;
		return result;
	}
	static int divide(int x, int y)
	{
		int result = x/y;
		return result;
	}
	public static void main(String[] args)
	{
		int i=0, x=10, y=5, r=0;
		System.out.println("enter the number what type of calculation u want like \n 1. Add \n 2. Multiply \n 3. Substract \n 4. Divide ");
		Scanner sc = new Scanner(System.in);
		i = sc.nextInt();
		System.out.println("enter the first number");
		x = sc.nextInt();
		System.out.println("enter the second number");
		y = sc.nextInt();
		switch(i)
		{
			case 1: 
			r = add(x,y);
			System.out.println("add = " + r);
			break;
			case 2: 
			r = multiply(x,y);
			System.out.println("multiply = " + r);
			break;
			case 3: 
			r = substract(x,y);
			System.out.println("substract = " + r);
			break;
			case 4: 
			r = divide(x,y);
			System.out.println("divide = " + r);
			break;
			default:
			System.out.println("enter valid input");
			break;
		}
	}
}