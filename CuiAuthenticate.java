import java.util.Scanner;

public class CuiAuthenticate {

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		String username = "singh", password = "Akash1";
		for(int i=0;i<=3;i++)
		{
			System.out.println("Enter username");
			String userId = sc.next();// taking input from the user
			System.out.println("Enter Password");
			String pass = sc.next();// taking input from the user
			if(i == 3)
				System.out.println("contact Admin");// if user enter 3 times incorrect 
			//username and passsword then next time it will contact to admin
			else
			{
				if(username.equals(userId) && password.equals(pass))
				{
					System.out.println("Welcome " + username);// compare the username
					break;
				}
				else
					System.out.println("wrong username & Password"); // compare the password
			}
		}
	}
}
