package java_homework.shipping;

public class ExpressShipping extends Shipping{
	
	public ExpressShipping(String destination, int weight) {
		super(destination, weight);
	}
	
	public int caluculateFee() {
		return 1000 + getWeight() * 200;
	}
	
	public String getShippingName() {
		return "速達配送";
	}

}
