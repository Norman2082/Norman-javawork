package exception;

import java.sql.SQLException;
import java.sql.Connection;
import java.sql.DriverManager;

public class Sample2 {
	public static void main(String[] args) {

		try {
			int x = 10;
			int y = 0;
			int z = x / y;// logical Issue
			int[] nums = new int[5];
			nums[4] = 200;
			Connection con = DriverManager.getConnection("", "", "");
		} catch (ArithmeticException | ArrayIndexOutOfBoundsException | SQLException e) {
			System.out.println(e.getMessage());
			System.out.println("We can not div a num by zero");

		} finally {
			System.out.println("I will get executed always");

		}
		System.out.println("something after try-catch");
	}
}