package loops;

public class LeapYear {
	public static void main(String[] args) {
		int year = 1988;
		if (year % 4 == 0) {
			if (year % 100 == 0) {
			if	(year % 400 == 0) {
				System.out.println("Its a leap year");
			}else {

				System.out.println("Its not a leap year");
			}
			}else { 
					System.out.println("leap");
			}
			
			}else {
			System.out.println("Its not leap year");

		}
	}
}