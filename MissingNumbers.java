
public class MissingNumbers {
	static int MissingFunction(int[] numberarray)
	{
		int temp = 0, counter = 0, counter3 = 0, length_array = numberarray.length;		
		for(counter =0; counter < numberarray.length; counter++)
		{
			for(int counter2 = counter+1;counter2 < numberarray.length; counter2++)
			{
				if(numberarray[counter] > numberarray[counter2])
				{
					temp = numberarray[counter];
					numberarray[counter] = numberarray[counter2];
					numberarray[counter2] = temp;
				}
			}
		}
		for(counter = 0; counter < numberarray.length-1; counter++)
		{
			if((numberarray[counter]+1) != numberarray[counter + 1])
			{
				return numberarray[counter]+1;
			}
		}
		return 0;
		
	}

}
