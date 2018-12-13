import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Test;


public class TestCasesforPalindrome {

	@Test
	public void test() {
		MultiplePalindrome multiplePalindrome = new MultiplePalindrome();
		String[] inputnames = {"MAM", "NITIN", "INIT", "RAW", "AKASH", "SAS", "FOX", "TET", "MEET","JICKY"};
		String[] reSults = {"TET","SAS","NITIN","MAM"};
		ArrayList<String> actual_String_Array = multiplePalindrome.palindromefinder(inputnames);
		assertEquals(reSults, actual_String_Array);
	}

}
