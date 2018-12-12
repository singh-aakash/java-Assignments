import static org.junit.Assert.*;

import org.junit.Test;


public class TestCaserRemoveDuplicacy {

	@Test
	public void test() {
		RemoveDuplicacy removeDuplicacy = new RemoveDuplicacy();
		String result = removeDuplicacy.removeDuplicacyFunction("abcabdefdefg");
		assertEquals("abcdefg", result);
	}

}
