package methods;

public class TestTv {
	public static void main(String[] args) {

		Television tele = new Television();
		tele.brand = "Samsung";
		tele.price = 1200;
		tele.screenSize = 55;
		tele.turnOn();
		// Method one to get return values from a java method
		int x = tele.switchToAchannel();
		System.out.println(x);
		// Method two to get return values form a java method
		System.out.println(tele.switchToAchannel());

		double discount = tele.getDiscount();
		System.out.println(discount);

		double discountOnBF = tele.discountOnBlackFriday(30);
		System.out.println(discountOnBF);

		double discountAtTheEnd = tele.discountOnBlackFriday(50);
		System.out.println(discountAtTheEnd);

		double totalDiscount = tele.dicountWithCityBank(30, 25);
		System.out.println(totalDiscount);

	}
}