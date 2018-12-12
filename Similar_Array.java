
public class Similar_Array {
	static boolean arrayFunction(int[] inputarray,int k)
	{
		int counter3 = 0;
		for(int counter =0; counter < inputarray.length; counter++)
		{
			for(int counter2 =0; counter2 < inputarray.length; counter2++)
			{
				if(counter == counter2)//
					System.out.print("");
				else
					if(inputarray[counter] == inputarray[counter2])
					{	
						if(k >= (counter2 - counter))//System.out.println("Difference is " + sum);
						{
							counter3++;//System.out.println("value of counters" + counter + "   " + counter2);
							break;
						}
					else
						System.exit(0);
					}
			}
		}
		if(counter3 > 0)
		return true;
		else
		return false;
		
	}

}

