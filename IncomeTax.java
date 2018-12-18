import java.util.Scanner;


public class IncomeTax {
	

	static float fun(float s) {
		// TODO Auto-generated method stub
		float res = 0;
		if(s > 0 && s <= 180000)
		{
			return s;
		}
		else
			if(s > 180000 && s <= 300000)
			{
				res = (float) (s - (s*0.1));
				return res;
			}
			else
				if(s > 300000 && s <= 500000)
				{
					res = (float) (s - (s*0.2));
					return res;
				}
				else
					if(s > 500000 && s <= 1000000)
					{
						res = (float) (s - (s*0.3));
						return res;
					}
					else
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("enter your Salary");
		float s = sc.nextFloat();
		float gross = 0;
		gross = fun(s);
		System.out.println("Gross Salary is   " + gross);
	}


}
