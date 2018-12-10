import java.util.Scanner;


public class Search {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[15]; 
		System.out.println("enter array");
		for(int i = 0; i < 15; i++)
		{
			arr[i] = sc.nextInt();
		}
		System.out.println("enter the number u want to search ");
		int m = sc.nextInt(), c=0;
		for(int i = 0; i < 15; i++)
		{
			if(m == arr[i])
			{
				++c;
				System.out.println(m + " Number is in array");
				break;
			}
		}
		if(c == 0)
			System.out.println(m + " Number is not in array");	
	}

}
