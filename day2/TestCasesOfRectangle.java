import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class TestCasesOfRectangle {

	RectangleCalculate rectangleCalculate = new RectangleCalculate();
	@Before
	public void setup(){
		rectangleCalculate.setbreadth1(20);
		rectangleCalculate.setlength1(30);
		rectangleCalculate.setLength2(30);
		rectangleCalculate.setBreadth2(20);
	}
	@Test
	public void testArea() {
		
		float area = rectangleCalculate.areaOfRectangle1();
		assertEquals(600, area,0);
	}

	@Test
	public void testPerimeter() {
		float area = rectangleCalculate.perimeterOfRectangle1();
		assertEquals(100, area,0);
	}
	
	@Test
	public void testCompareArea(){
		boolean result = rectangleCalculate.compareAreaOfRectangle();
		assertTrue(result);
	}
	@Test
	public void testComparePerimeter(){
		boolean result = rectangleCalculate.comparePerimeterOfRectangle();
		assertTrue(result);
	}
}
