package constructor;

public class TestPerson {

	public static void main(String[] args) {
		Person p1 = new Person();
		p1.name = "Norman";
		p1.age = 39;
		p1.address = "Warminster";
		p1.phone = 234566;

		Person p2 = new Person("Hilda", 25, "UK", 345665);
		Person p3 = new Person("James", 23, "UK", 785665);
		Person p4 = new Person("Kev", 26);
		p4.address = ("London");
		p4.phone = 345678;

	}
}