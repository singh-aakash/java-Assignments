
public class Complex {
	public float realnumber1;
	public float imaginaryNumber1;
	public float realnumber2;
	public float imaginaryNumber2;
	public float getRealnumber2() {
		return realnumber2;
	}
	public void setRealnumber(float realnumber1, float realnumber2) {
		this.realnumber1 = realnumber1;
		this.realnumber2 = realnumber2;
	}
	public void setImaginaryNumber(float imaginaryNumber1, float imaginaryNumber2) {
		this.imaginaryNumber1 = imaginaryNumber1;
		this.imaginaryNumber2 = imaginaryNumber2;
	}
	public float sumRealNumber(){
		return realnumber1 + realnumber2;
	}
	public float sumImaginaryNumber(){
		return imaginaryNumber1 + imaginaryNumber2;
	}
	/*public float complexNumber(){
		float sum1 = realnumber1 + realnumber2;
		float sum2 = imaginaryNumber1 + imaginaryNumber2;
		return sum1;
	}*/
}
