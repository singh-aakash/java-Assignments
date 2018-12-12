import static org.junit.Assert.*;

import org.junit.Test;


public class TestCasePresent {

	@Test
	public void test() {
		StringFinder stringFinder = new StringFinder();
		String[] inputStrings = {"Dave", "Ann", "George", "Sam", "Ted", "Gag", "Saj", 
			"Agati", "Mary", "Dave", "Bill", "Williams", "Jones", "Dave", "Davis", "Miller", "Wilson", "Dave", 
			"Taylor", "Dave"};
		int result = stringFinder.finderfunction(inputStrings, "Dave");
		assertEquals(5, result);
	}

}
