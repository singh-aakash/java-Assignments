import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class TestCasesOfRectangle {

	RectangleCalculate rectangleCalculate1 = new RectangleCalculate();
	RectangleCalculate rectangleCalculate2 = new RectangleCalculate();
	RectangleCalculate rectangleCalculate3 = new RectangleCalculate();
	
	@Before
	public void setup(){
		rectangleCalculate1.setbreadth(20);
		rectangleCalculate1.setlength(30);
		rectangleCalculate2.setlength(30);
		rectangleCalculate2.setbreadth(20);
	}
	@Test
	public void testArea() {
		
		float area = rectangleCalculate1.areaOfRectangle();
		assertEquals(600, area,0);
	}

	@Test
	public void testPerimeter() {
		float area = rectangleCalculate1.perimeterOfRectangle();
		assertEquals(100, area,0);
	}
	
	@Test
	public void testCompareArea(){
		boolean result = rectangleCalculate3.compareAreaOfRectangle(rectangleCalculate1, rectangleCalculate2);
		assertTrue(result);
	}
	@Test
	public void testComparePerimeter(){
		boolean result = rectangleCalculate3.comparePerimeterOfRectangle(rectangleCalculate1, rectangleCalculate2);
		assertTrue(result);
	}
}
