package java_homework.shipping;

public class CoolShipping extends Shipping {
	
	public CoolShipping(String destination, int weight) {
		super(destination, weight);
	}
	
	public int caluculateFee() {
		return 800 + getWeight() * 150;
	}
	
	public String getShippingName() {
		return "クール便";
	}

}
