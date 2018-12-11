import static org.junit.Assert.*;

import org.junit.Test;


public class ReverseStringTestCase {

	@Test
	public void test() {
		ReverseString reverstring = new ReverseString();
		String result = reverstring.reverseString("NITIN IS BOY");
		assertEquals("NITIN SI YOB", result);
	}
	@Test
	public void test1() {
		ReverseString reverstring = new ReverseString();
		String result = reverstring.reverseString("NITIN IS BOY");
		assertEquals("YOB NITIN", result);
	}
}
