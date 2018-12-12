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
		//String[] allPalindromeStrings = new String[4];
		int length_of_Array = inputnames.length, counter = 0, counter2 = 0, actual_Counter = 0;
		for(counter = 0; counter < length_of_Array; counter++)
		{
			String result = palindromes(inputnames[counter]);
			if(result.equals(inputnames[counter]))
				allPalindromeStrings.add(result);
		}
		 System.out.println(allPalindromeStrings);

		return allPalindromeStrings;
	}
}
