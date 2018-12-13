
public class MultipleArmstrong {

	static int fun(int n)
	{
		int count=0, r=0, o=0;
		o = n;
		while(n > 0)
		{
			r = n % 10;
			count += Math.pow(r,3);
			n = n/10;
		}
		return count;
	}
	public static void main(String[] args) {
		int count =0;
		for(int i = 100;i <= 999;i++)
		{
			count = fun(i);
			if(count == i)
				System.out.println(count + " is an Armstrong number ");	
		}

	}

}
