import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class TestCasesofComplex {

	Complex complex1 = new Complex();
	Complex complex2 = new Complex();
	Complex complex3 = new Complex();
	
	@Before
	public void setup(){
		complex1.setComplexNumber(2.5, 5.6);
		complex2.setComplexNumber(6.6, 9.8);
	}
	@Test
	public void testCasesShowComplexNumber1() {
		
		assertEquals("2.5 + 5.6i", complex1.showComplexNumber());
	}
	@Test
	public void testCasesShowComplexNumber2() {
		
		assertEquals("6.6 + 9.8i", complex2.showComplexNumber());
	}
	@Test
	public void testCasesSumComplexNumber()
	{
		assertEquals("5.0 + 19.6i", complex3.sumComplexNumber(complex1, complex2));
	}
}
