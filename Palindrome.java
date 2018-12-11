
public class Palindrome {
	static int palindromeFunction(int number)
	{
		int sum = 0;
		while(number>0)
		{
			int remainder = number % 10;
			sum = sum * 10 + remainder;
			number /=10;
		}
		return sum;
	}
}
