import java.util.HashSet;
import java.util.Set;


public class RemoveDuplicacy {

	static String removeDuplicacyFunction(String string) {
	    StringBuilder newstring = new StringBuilder();
	    Set<Character> seen = new HashSet<Character>();

	    for(int counter = 0; counter < string.length(); ++counter) {
	        char character = string.charAt(counter);
	        if(!seen.contains(character)) {
	            seen.add(character);
	            newstring.append(character);
	        }
	    }
	    return newstring.toString();
	}

}
