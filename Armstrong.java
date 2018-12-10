import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the number");
		int n = sc.nextInt(), count=0, r=0, o=0;
		o = n;
		while(n > 0)
		{
			r = n % 10;
			count += Math.pow(r,3);
			n = n/10;
		}
		System.out.println(o);
		if(o == count)
		System.out.println(" is an Armstrong number ");
		else
		System.out.println(" is not an Armstrong number");
	}

}
