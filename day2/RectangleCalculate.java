
/*
 Consider a Rectangle Shape.
Identify its properties and behaviours and implement the same.
Write a Test Cases to check if the behaviours(methods) are implemented properly.
If their are 2 Rectangle objects of different sizes than we should be able to check if they are having same area or not.

Test the Program with different combinations test cases possible.

 */
public class RectangleCalculate {
	public int length;
	public int breadth;
	public int getlength() {
		return length;
	}
	public void setlength(int length) {
		this.length = length;
	}
	public int getbreadth() {
		return breadth;
	}
	public void setbreadth(int breadth) {
		this.breadth = breadth;
	}
	public float areaOfRectangle(){
		return length * breadth;
		
	}

	public float perimeterOfRectangle(){
		return 2 * ( length + breadth);
		
	}

	
	public boolean compareAreaOfRectangle(RectangleCalculate rectangleCalculate1, RectangleCalculate rectangleCalculate2){
		if(rectangleCalculate1.areaOfRectangle() == rectangleCalculate2.areaOfRectangle())
			return true;
		else
			return false;
		
	}
	public boolean comparePerimeterOfRectangle(RectangleCalculate rectangleCalculate1, RectangleCalculate rectangleCalculate2){
		if(rectangleCalculate1.perimeterOfRectangle() == rectangleCalculate2.perimeterOfRectangle())
			return true;
		else
			return false;
		
	}
}
