
public class StringFinder {
	static int finderfunction(String[] inputStrings, String findingname)
	{
		int counter = 0, counter1 = 0, counter3 = 0;
		System.out.println("Similar String");
		for(counter = 0; counter < inputStrings.length; counter++)
		{
			if(findingname.equals(inputStrings[counter]))
			{
				counter3 = 1;
				for(counter1 = 0; counter1 < inputStrings.length; counter1++)
				{
				if(counter == counter1)
					System.out.print("");
				else
				if(inputStrings[counter] == inputStrings[counter1])
				{
					++counter3;
					if(counter1 == inputStrings.length-1)
						return counter3;
				}
				}
			}
			else
				return 0;
		}
	
		return 0;
		
	}

}
