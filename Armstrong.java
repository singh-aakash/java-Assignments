import java.util.Scanner;

public class Armstrong {  

	public static int armstrongfunction(int number)// function to calculate armstron
	{
		int sum = 0;
		while(number > 0)//conditions
		{
			int remainder = number % 10;
			sum += Math.pow(remainder,3);//Math.pow is predefined function in java
			number = number/10;
		}
		return sum;// return sum
	}
}
