import static org.junit.Assert.*;

import org.junit.Test;


public class ArmstrongTestCase {

	@Test
	public void test1() {
		//fail("Not yet implemented");
		Armstrong armstrong = new Armstrong();
		int result = armstrong.armstrongfunction(371);
		assertEquals(371, result);
	}
	@Test
	public void test2() {
		//fail("Not yet implemented");
		Armstrong armstrong = new Armstrong();
		int result = armstrong.armstrongfunction(371);
		assertEquals(123, result);
	}
		@Test
		public void test3() {
			//fail("Not yet implemented");
			Armstrong armstrong = new Armstrong();
			int result = armstrong.armstrongfunction(371);
			assertEquals(0, result);
	}
		@Test
		public void test4() {
			//fail("Not yet implemented");
			Armstrong armstrong = new Armstrong();
			int result = armstrong.armstrongfunction(371);
			assertEquals(-371, result);
	}

}
