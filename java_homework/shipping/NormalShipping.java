package java_homework.shipping;

public class NormalShipping extends Shipping {

	public NormalShipping(String destination, int weight) {
		super(destination, weight);
	}
	
	public int caluculateFee() {
		return 500 + getWeight() * 100;
	}
	
	public String getShippingName() {
		return "通常配送";
	}
	

}
