import static org.junit.Assert.*;

import org.junit.Test;


public class TestCaseForValueFinder {

	@Test
	public void test() {
		ValueFinder valueFinder = new ValueFinder();
		int[][] multidemsionalArray = {{1,2,3},{4,5,6},{7,8,9}};
		boolean result = valueFinder.valueFinderFunction(multidemsionalArray, 7);
		assertTrue(result);
	}

}
