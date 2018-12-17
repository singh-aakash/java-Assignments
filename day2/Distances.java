
public class Distances {
	public static int feet1;
	public static float inches1;
	public static int feet2;
	public static float inches2;
	public static int getFeet1() {
		return feet1;
	}
	public void setFeet1(int feet1) {
		this.feet1 = feet1;
	}
	public float getInches1() {
		return inches1;
	}
	public void setInches1(float inches1) {
		this.inches1 = inches1;
	}
	public int getFeet2() {
		return feet2;
	}
	public void setFeet2(int feet2) {
		this.feet2 = feet2;
	}
	public float getInches2() {
		return inches2;
	}
	public void setInches2(float inches2) {
		this.inches2 = inches2;
	}
	public int addDistancesInFeet(){
	
		return feet1 + feet2;
	}
	public float addDistancesInInches(){
		return inches1 + inches2;	
	}
	public float addDistances(){
		float sum = inches1 + inches2;
		int sum2 = feet1 + feet2;
		while(sum > 12.0f)
		{
			sum -= 12.0f; 
			++sum2;
		}
		
		sum2 = (int) (sum2 + sum / 12.0f);
		return sum2;
	}

}
