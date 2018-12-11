
public class ReverseString {
	static String reverseString(String name)
	{
		int length_of_String = name.length();
		String[] words = name.split(" ");
		String reverse = "";
		String reverseSen = "";
		for(int count = 0; count<words.length;count++)
		{
		for(int counter = words[count].length()-1; counter >= 0; counter--)
		{
			reverse = reverse + words[count].charAt(counter);
		}
		reverseSen = reverseSen + reverse;
		reverse = "";
		if(count != words.length-1)
			reverseSen = reverseSen + " ";
			
		}
		return reverseSen;
	}
}
