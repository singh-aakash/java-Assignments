import java.util.Scanner;

public class CuiAuthenticate {

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		String username = "singh", password = "Akash1";
		for(int i=0;i<=3;i++)
		{
			System.out.println("Enter username");
			String userId = sc.next();
			System.out.println("Enter Password");
			String pass = sc.next();
			if(i == 3)
				System.out.println("contact Admin");
			else
			{
				if(username.equals(userId) && password.equals(pass))
				{
					System.out.println("Welcome " + username);
					break;
				}
				else
					System.out.println("wrong username & Password");
			}
		}
	}
}
