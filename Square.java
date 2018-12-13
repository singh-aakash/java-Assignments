import java.util.Scanner;


public class Square {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the number");
		int n = sc.nextInt(), count=0;
		
		for(int i = 1;i <= 10;i++)
		{
			count = n * i;
			System.out.println(" "+ n + " * " + i + " = " + count + " _____ " +squar(count));
		}
	}

	private static int squar(int count) {
		int s = count * count;
		return s;
	}
}
