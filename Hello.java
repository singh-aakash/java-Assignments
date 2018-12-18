class Hello
{
	static int fun(int a, int b)
	{
		int sum = a + b;
		return sum;
	}
	static void display()
	{
		System.out.println("Disc");
	}
	public static void main(String[] args)
	{
		
		System.out.print("Hello World   ");
		display();
		System.out.print("Hello World");
		int r = fun(1,2);
		System.out.println("sum is   " + r);
 	}
}