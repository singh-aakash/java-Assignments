import static org.junit.Assert.*;

import org.junit.Test;


public class PalindromeTestCase {

	@Test
	public void test() {
		Palindrome palindrome = new Palindrome();
		int result = palindrome.palindromeFunction(-121);
		assertEquals(-121, result);
	}
	@Test
	public void test2()
	{
		Palindrome palindrome = new Palindrome();
		int result = palindrome.palindromeFunction(121);
		assertEquals(121, result);
	}
	@Test
	public void test3()
	{
		Palindrome palindrome = new Palindrome();
		int result = palindrome.palindromeFunction(12);
		assertEquals(121, result);
	}
	

}
