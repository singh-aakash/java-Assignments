
public class Discounted {
	static int discountedFunction(int oldPrice, float discount){
		int newItemPrice = (int) (oldPrice - oldPrice*discount);
		return newItemPrice;
	}

}
