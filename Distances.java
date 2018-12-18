
public class Distances {
	public int feet;
	public float inches;
	public void setFeetAndInches(int feet, float inches) {
		this.feet = feet;
		this.inches = inches;
	}

	public float addDistances(int feets, float inch){
		
		while(inch > 12.0f)
		{
			inch -= 12.0f; 
			++feets;
		}
		
		feets = (int) (feets + inch / 12.0f);
		return feets;
	}

}
