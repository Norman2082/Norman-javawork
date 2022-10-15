package staticexample;

public class Test {
	public static void main(String[] args) {
		MySample obj1 = new MySample();// ++101
		obj1.x = 10;
		System.out.println(obj1.x);
		obj1.x++;
		System.out.println(obj1.x);// 102
		System.out.println(MySample.staticX++);// 103

		MySample obj2 = new MySample();// ++104
		obj2.x = 20;
		System.out.println(obj2.x);
		obj2.x++;
		System.out.println(obj2.x);
		System.out.println(MySample.staticX++);// 105

		MySample obj3 = new MySample();// ++//106

		System.out.println(MySample.staticX++);

//	Sample obj1=new Sample();
//	obj1.name="Ange1";
//	obj1.SNN=2034567;
//	
//	Sample obj2=new Sample();
//	obj1.name="Demon";
//	obj1.SNN=4568909;
//	System.out.println(Sample.nameofOrg);
//	Sample.nameofOrg="Oracle",

	}
}
