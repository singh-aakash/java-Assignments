import java.util.Scanner;


public class Result {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int x, y, z;
		System.out.println("enter first subject Marks");
		x = sc.nextInt();
		System.out.println("enter second subject Marks");
		y = sc.nextInt();
		System.out.println("enter third subject Marks");
		z = sc.nextInt();
		if(x > 60 && y > 60 && z > 60)
			System.out.println("Passed");
		else
			if(x > 60 || y > 60)
			{
				if(x > 60 && y > 60)
					System.out.println("promoted");
				else
				if(z > 60)
					System.out.println("promoted");
			}
			else
			System.out.println("Failed");
	}

}
