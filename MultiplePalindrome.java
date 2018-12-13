import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class MultiplePalindrome {
	
	static String palindromes(String values_of_Array)
	{
		String reverse = values_of_Array;
		values_of_Array = "";
		int length = reverse.length();
		for(int counter = length-1; counter >= 0; counter--)
		{
			values_of_Array = values_of_Array + reverse.charAt(counter);
		}
		return values_of_Array;
		
	}

	static ArrayList<String> palindromefinder(String[] inputnames) {
		ArrayList<String> allPalindromeStrings = new ArrayList<>();
		int length_of_Array = inputnames.length, counter = 0, counter1 = 0, actual_Counter = 0;
		
		for(counter = 0; counter < length_of_Array; counter++)
		{
			String result = palindromes(inputnames[counter]);
			if(result.equals(inputnames[counter]))
				allPalindromeStrings.add(result);
		}
		String modifiedString[] = new String[allPalindromeStrings.size()]; 
		for(counter = 0; counter < allPalindromeStrings.size(); counter++)
		{
			modifiedString[counter] = allPalindromeStrings.get(counter);
		}
		for(counter = 0; counter < modifiedString.length - 1; counter++)
		{
			for(counter1 = counter; counter1 < modifiedString.length; counter1++)
			{ 
				//nn
				if(modifiedString[counter].compareTo(modifiedString[counter1]) < 0)
				{
					String temporary = modifiedString[counter];
					modifiedString[counter] = modifiedString[counter1];
					modifiedString[counter1] = temporary;
				}
			}
		}
		for(counter = 0; counter < modifiedString.length; counter++)
		{
			System.out.println(modifiedString[counter]);
		}
		return allPalindromeStrings;
	}
}
