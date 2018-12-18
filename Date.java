import java.util.Scanner;
public class Date {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);// taking input from the user
		int dat = 0, month = 0, year = 0;
		System.out.println("enter date");
		dat = sc.nextInt();
		System.out.println("enter month");
		month = sc.nextInt();
		System.out.println("enter year");
		year = sc.nextInt();
		System.out.println("input is " + dat +","+ month +","+ year);
		int x = month;
		switch(x)// using switch cases for calculator
		{
			case 1: 
				System.out.println("output is " + dat +"/" + "January" + "/"+ year);
			break;
			case 2:
				System.out.println("output is " + dat +"/" + "Febuary" + "/"+ year);
			break;
			case 3:
				System.out.println("output is " + dat +"/" + "March" + "/"+ year);
			break;
			case 4: 
				System.out.println("output is " + dat +"/" + "April" + "/"+ year);
			break;
			case 5: 
				System.out.println("output is " + dat +"/" + "May" + "/"+ year);
			break;
			case 6: 
				System.out.println("output is " + dat +"/" + "June" + "/"+ year);
			break;
			case 7: 
				System.out.println("output is " + dat +"/" + "July" + "/"+ year);
			break;
			case 8: 
				System.out.println("output is " + dat +"/" + "August" + "/"+ year);
			break;
			case 9: 
				System.out.println("output is " + dat +"/" + "September" + "/"+ year);
			break;
			case 10: 
				System.out.println("output is " + dat +"/" + "October" + "/"+ year);
			break;
			case 11: 
				System.out.println("output is " + dat +"/" + "November" + "/"+ year);
			break;
			case 12: 
				System.out.println("output is " + dat +"/" + "December" + "/"+ year);
			break;

			default:
				System.out.println("enter valid month");
			break;
		}
	}

}
