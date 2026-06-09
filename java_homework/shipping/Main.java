package java_homework.shipping;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
//	　配列の場合
//		Shipping[] shippings = {
//				new NormalShipping("東京都", 3),
//				new ExpressShipping("大阪府", 2),
//				new CoolShipping("北海道", 5),
//				new InternationalShipping("アメリカ", 4)
//		};
		
//	　ArrayListの場合
		ArrayList<Shipping> shippings = new ArrayList<>();
		shippings.add(new NormalShipping("東京都", 3));
		shippings.add(new ExpressShipping("大阪府", 2));
		shippings.add(new CoolShipping("北海道", 5));
		shippings.add(new InternationalShipping("アメリカ", 4));
		
		
		
		
		for (Shipping shipping : shippings) {
			System.out.println(shipping.getShippingName() + "：" + 
		                       shipping.getDestination() + " / " + 
					           shipping.getWeight() + "kg / 送料" + 
		                       shipping.caluculateFee() + "円");
		}
		
		

	}

}
