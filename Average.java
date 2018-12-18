import java.util.Scanner;


public class Average {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[][] studentsMarksArray = new int[3][3];
		int total1=0, total2=0, total3=0;
		for(int counter1 = 0;counter1 < 3;counter1++)
		{
			System.out.println("enter the marks of subject " + (counter1+1));// takin input from the user
			for(int counter2 = 0;counter2 < 3;counter2++)
			{
				studentsMarksArray[counter1][counter2] = scanner.nextInt();
			}
		}
		for(int counter1 = 0;counter1 < 3;counter1++)
		{
			for(int counter2 = 0;counter2 < 3;counter2++)
			{
				if(counter1 == 0)
				total1 += studentsMarksArray[counter1][counter2];// total marks of all subject of student1
				else
					if(counter1 == 1)
				total2 += studentsMarksArray[counter1][counter2];// total marks of all subject of student2
					else
						if(counter1 ==2)
				total3 += studentsMarksArray[counter1][counter2];// total marks of all subject of student3
			}
		}
		int average1 = total1/3, average2 = total2/3, average3 = total3/3; 
		System.out.println("total  "+ total1 + "   average" + average1);// average of all subject of student1
		System.out.println("total  "+ total2 + "   average" + average2);// total marks of all subject of student1
		System.out.println("total  "+ total3 + "   average" + average3);// total marks of all subject of student1
	}

}
