package java_homework.shipping;

public class InternationalShipping extends Shipping {
	
	public InternationalShipping(String destination, int weight) {
		super(destination, weight);
	}
	
	public int caluculateFee() {
		return 2000 + getWeight() * 500;
	}
	
	public String getShippingName() {
		return "海外配送";
	}

}
