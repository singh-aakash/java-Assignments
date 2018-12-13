
public class RemoveSpaces {

	static String SpaceRemovalFunction(String name, String removeString, int position) {
		String[] words = name.split(" +");
		String modifiedSen = "";
		for(int count = 0; count<words.length;count++)
		{
			if(words[count].equals(removeString) && count == position)
				System.out.print("");
			else
				{
					modifiedSen = modifiedSen + words[count];
					if(count != words.length-1)
					modifiedSen = modifiedSen + " ";
				}
		}
		return modifiedSen;
	}
	

}
