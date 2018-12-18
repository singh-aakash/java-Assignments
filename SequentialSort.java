import java.util.Scanner;


public class SequentialSort {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the size of array");
		int n = scanner.nextInt(), temp = 0;;
		int[] arr = new int[n]; 
		System.out.println("enter array");
		for(int i = 0; i < n; i++)
		{
			arr[i] = scanner.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(arr[i] > arr[j])
				{
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i] + " ");
		}
	}

}
