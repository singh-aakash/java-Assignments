import static org.junit.Assert.*;

import org.junit.Test;


public class ArmstrongTestCase {

	@Test
	public void test() {
		//fail("Not yet implemented");
		Armstrong armstrong = new Armstrong();
		int result = armstrong.armstrongfunction(371);
		assertEquals(371, result);
	}

}
