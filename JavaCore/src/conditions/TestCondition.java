package conditions;

public class TestCondition {
	public static void main(String[] args) {

		int num1 = 10;
		int num2 = 20;
		if (num1 > num2)
			System.out.println("num1 is bigger");
		else
			System.out.println("num2 is bigger");

		int x = 10;
		int y = 20;
		int z = 30;
		if (x > y && y > z)

			System.out.println("x is biggest");
		else if (x > y && x > z)
			System.out.println("y is biggest");
		else
			System.out.println("x is biggest");

		String city = "New York";
		if (city == "New York")
			System.out.println("welcome to NewYork");
		else {
			System.out.println("you are in some other parts of the world");
		}
	}
}