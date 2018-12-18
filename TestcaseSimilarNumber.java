import static org.junit.Assert.*;

import org.junit.Test;


public class TestcaseSimilarNumber {

	@Test
	public void test() {
		Similar_Array similar_Array = new Similar_Array();
		int[] arrayNumber = {1,2,3,6,4,9,5,8,1};
		boolean result = similar_Array.arrayFunction(arrayNumber, 5);
		assertTrue(result);
	}

	@Test
	public void test2() {
		Similar_Array similar_Array = new Similar_Array();
		int[] arrayNumber = {1,2,3,1};
		boolean result = similar_Array.arrayFunction(arrayNumber, 5);
		assertTrue(result);
	}

	@Test
	public void test3() {
		Similar_Array similar_Array = new Similar_Array();
		int[] arrayNumber = {1};
		boolean result = similar_Array.arrayFunction(arrayNumber, 5);
		assertTrue(result);
	}

}
