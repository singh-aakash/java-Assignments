import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class TestCasesofComplex {

	Complex complex = new Complex();
	@Before
	
	public void setup(){
		complex.setImaginaryNumber(2.5f, 3.3f);
		complex.setRealnumber(6.5f, 9.8f);
	}
	@Test
	public void testCasesImaginaryNumber() {
		float result = complex.sumImaginaryNumber();
		System.out.println(result);
		assertEquals(5.8f, result,0.0);
	}
	@Test
	public void testCasesRealNumber()
	{
		float result = complex.sumRealNumber();
		System.out.println(result);
		assertEquals(16.3f, result,0.0);
	}
	@Test
	public void testCasesDistance(){
		float result = complex.sumImaginaryNumber();
		assertEquals(52.0, result,0.0);
	}
}
