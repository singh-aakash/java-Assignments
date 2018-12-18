
public class ValueFinder {
	static boolean valueFinderFunction(int[][] multidemsionalArray, int searchNumber)
	{
		int rows = multidemsionalArray.length, columns = multidemsionalArray[0].length,
				counter = 0, counter1 = 0, flag = 0;
		for(counter =0; counter < rows; counter++)
		{
			for(counter1 =0; counter1 < columns; counter1++)
			{
				if(multidemsionalArray[counter][counter1] == searchNumber)
					++flag;
			}
		}
		if(flag > 0)
			return true;
		else
			return false;
		
	}

}
