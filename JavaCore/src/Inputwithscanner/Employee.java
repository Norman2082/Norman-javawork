package Inputwithscanner;

public class Employee {
	
	String name;
	int age;
	String JobTitle;

Employee(String name,int age,String JobTitle){
	this.name =name;
	this.age =age;
	this.JobTitle=JobTitle;
	



}


public Employee() {

}


public String toString() {
	return name+" "+age +" "+ JobTitle;
}
}