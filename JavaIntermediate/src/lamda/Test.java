package lamda;

public class Test {
	public static void main(String[] args) {
		// Person p=new Person();
		// p.greet();
		// Greeting gr=new Greeting();
        // Greeting gr=new Person();//dependency on class

		// Anonymous class
		Greeting gr = new Greeting() {
			public void greet()

			{
				System.out.println("hello world");
			}

		};
		gr.greet();

		//Lamda expression
		//leftside ->rightside
		//arguments -> body
		//() -{printing /calculation)
		//Lamda without any args and no return
		Greeting gr1 = () -> {System.out.println("hello world");};
		gr1.greet();

	}	// Lamda with args and no return type

	GreetingWithName grName = (x) -> System.out.println("hello " + x);
	{
		;
		grName.greet("Kevin");

		//Lamda with args and with return type
		GreetingWithReturn grReturn = (x) -> {return "Hello " + x;};
		System.out.println(grReturn.greet("Hasan"));

	}

}
