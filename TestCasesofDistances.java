import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class TestCasesofDistances {

	Distances distances1 = new Distances();
	Distances distances2 = new Distances();
	Distances distances3 = new Distances();
	@Before
	public void setup(){
		distances1.setFeetAndInches(20, 14.5f);
		distances2.setFeetAndInches(30, 8.5f);
	}
	@Test
	public void testCasesDistances1() {
		int feet = distances1.feet + distances2.feet;
		float inch = distances1.inches + distances2.inches;
		distances3.setFeetAndInches(feet, inch);
		float result = (int) distances1.addDistances(feet, inch);
		assertEquals(51, result,0.0);
	}

}
