import static org.junit.Assert.*;

import org.junit.Test;

public class TestcaseMissing {

	@Test
	public void test() {
		MissingNumbers missingNumbers = new MissingNumbers();
		int[] numberArray = {9,6,4,2,3,5,7,0,1};
		int result = missingNumbers.MissingFunction(numberArray);
		assertEquals(8, result);
	}

}
