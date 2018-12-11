import java.util.Scanner;

public class Armstrong {

	public static int armstrongfunction(int number)
	{
		int sum = 0;
		while(number > 0)
		{
			int remainder = number % 10;
			sum += Math.pow(remainder,3);
			number = number/10;
		}
		return sum;
	}
}
