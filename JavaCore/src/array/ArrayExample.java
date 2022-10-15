package array;

public class ArrayExample {

	public static void main(String[] args) {

//Declare
//instantiate
//initialise

		String[] student;// Declare
		student = new String[5];// instantiate
		student[0] = "Hilda";// initialise
		student[1] = "Hasan";
		student[2] = "Kev";
		student[3] = "Arifi";
		student[4] = "Edith";

		String[] City = new String[5];

		String[] fruits = { "Banana", "apple", "grapes", "guava", "pineapple", "avocado" };
		System.out.println("Student----------");
		for (int i = 0; i < student.length; i++)

		{
			System.out.println(student[i]);
		}
		System.out.println("Fruits-----------");
		for (int i = 0; i < fruits.length; i++)

			System.out.println(fruits[i]);
		{
			System.out.println("zipcodes----------");
			int[] zipcodes = { 2345, 3456, 3456, 5678, 6540, 4896, 6099, 5654, 8897, 5432 };

			for (int i = 0; i < zipcodes.length; i++)
				System.out.println(zipcodes[i]);

		}
	}
}
