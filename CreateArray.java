import java.util.Scanner;

import java.util.Scanner;


public class CreateArray {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the size of array");
		int length_of_Array = scanner.nextInt(), count1 = 1,temp = 0,count2=0;
		int[] arr = new int[length_of_Array];// initialisation of array
		int[] arr1 = new int[100];
		System.out.println("enter array");
		for(int counter = 0; counter < length_of_Array; counter++)// enter the array from user
		{// taking input from the user in array format
			arr[counter] = scanner.nextInt();
		}
		for(int counter=0;counter<length_of_Array;counter++)// Sorting of aaray
		{
			for(count2=counter+1;count2<length_of_Array;count2++)
			{
				if(arr[counter] > arr[count2])
				{
					temp = arr[counter];//  swapping the value
					arr[counter] = arr[count2];
					arr[count2] = temp;
				}
			}
		}
		System.out.println("");
	      for (int counter=0; counter<length_of_Array-1; counter++){  //remove duplicacy of array
	            if (arr[counter] != arr[counter+1]){  
	                arr1[count1++] = arr[counter];// storing the new array with previous array
	            }  
	         }  
	        arr1[count1++] = arr[length_of_Array-1];
	        System.out.println("new array");
	        for (int counter=1; counter<count1; counter++)
	        {
		        System.out.println(arr1[counter]);  // print the modified array
	        }
		
	}

}
