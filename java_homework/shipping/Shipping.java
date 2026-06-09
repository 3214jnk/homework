package java_homework.shipping;

public abstract class Shipping {
	private String destination;
	private int weight;
	
	public Shipping(String destination, int weight) {
		this.destination = destination;
		this.weight = weight;
	}
	
	public String getDestination() {
		return this.destination;
	}
	
	public int getWeight() {
		return this.weight;
	}
	
	public abstract int caluculateFee();
	
	public abstract String getShippingName();

}
