
/*
 Consider a Rectangle Shape.
Identify its properties and behaviours and implement the same.
Write a Test Cases to check if the behaviours(methods) are implemented properly.
If their are 2 Rectangle objects of different sizes than we should be able to check if they are having same area or not.

Test the Program with different combinations test cases possible.

 */
public class RectangleCalculate {
	public int length1;
	public int breadth1;
	public int length2;
	public int breadth2; 
	public int getLength2() {
		return length2;
	}
	public void setLength2(int length2) {
		this.length2 = length2;
	}
	public int getBreadth2() {
		return breadth2;
	}
	public void setBreadth2(int breadth2) {
		this.breadth2 = breadth2;
	}
	public int getlength1() {
		return length1;
	}
	public void setlength1(int length1) {
		this.length1 = length1;
	}
	public int getbreadth1() {
		return breadth1;
	}
	public void setbreadth1(int breadth1) {
		this.breadth1 = breadth1;
	}
	public float areaOfRectangle1(){
		return length1 * breadth1;
		
	}
	public float areaOfRectangle2(){
		return length2 * breadth2;
		
	}

	public float perimeterOfRectangle1(){
		return 2 * ( length1 + breadth1);
		
	}

	public float perimeterOfRectangle2(){
		return 2 * ( length2 + breadth2);
		
	}
	
	public boolean compareAreaOfRectangle(){
		if(areaOfRectangle1() == areaOfRectangle2())
			return true;
		else
			return false;
		
	}
	public boolean comparePerimeterOfRectangle(){
		if(perimeterOfRectangle1() == perimeterOfRectangle2())
			return true;
		else
			return false;
		
	}
}
