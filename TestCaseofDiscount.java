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

}
