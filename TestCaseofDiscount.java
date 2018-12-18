import static org.junit.Assert.*;

import org.junit.Test;


public class TestCaseofDiscount {

	@Test
	public void test() {
		Discounted discounted = new Discounted();
		float discount = (float) 0.35;
		int result = discounted.discountedFunction(1000, discount);
		assertEquals(650, result);
	}

	@Test
	public void test2() {
		Discounted discounted = new Discounted();
		float discount = (float) 0.35;
		int result = discounted.discountedFunction(0, discount);
		assertEquals(0, result);
	}
	@Test
	public void test3() {
		Discounted discounted = new Discounted();
		float discount = (float) 0.35;
		int result = discounted.discountedFunction(-1000, discount);
		assertEquals(-650, result);
	}


}
