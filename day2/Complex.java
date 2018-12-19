
public class Complex {
	public double realnumber;
	public double imaginaryNumber;
	public void setComplexNumber(double realnumber, double imaginaryNumber) {
		this.realnumber = realnumber;
		this.imaginaryNumber = imaginaryNumber;
	}
	public String showComplexNumber(){
		return realnumber + " + " + imaginaryNumber + "i";		
	}
	
	public String sumComplexNumber(Complex complex1, Complex complex2) {
		
		double real = complex1.realnumber + complex1.realnumber;
		double imag = complex2.imaginaryNumber + complex2.imaginaryNumber;
		System.out.println(real + " + " + imag + "i");
		return real + " + " + imag + "i";
	}
}
