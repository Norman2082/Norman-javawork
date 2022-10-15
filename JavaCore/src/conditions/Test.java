package conditions;


public class Test {
String name= "Norman";
int age =78;

public static void main(String[] args) {

Test a =new Test();
a.printDetails();
}
public void setName(String name) {
		this.name=name;
	
}

public void getAge(int age) { 
	this.age= this.age;
}
public void printDetails() {
	System.out.println(name + ", " + age);
}
	 
		
}
	

