import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class TestCasesofDistances {

	Distances distances1 = new Distances();
	Distances distances2 = new Distances();
	@Before
	public void setup(){
		distances1.setFeet1(20);
		distances1.setFeet2(30);
		distances2.setInches1(14.8f);
		distances2.setInches2(9.5f);
	}
	@Test
	public void testCasesFeet() {
		int result = distances1.addDistancesInFeet();
		assertEquals(50, result);
	}
	@Test
	public void testCasesInch()
	{
		float result = distances1.addDistancesInInches();
		System.out.println(result);
		assertEquals(24.3f, result,0.0);
	}
	@Test
	public void testCasesDistance(){
		float result = distances2.addDistances();
		assertEquals(52.0, result,0.0);
	}
	

}
