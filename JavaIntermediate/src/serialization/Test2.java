package serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Test2 {
public static void main(String[] args) {
	Employee emp=new Employee(3456, "Norman", 33321, "Engineer", "norm@gmail.com");
	try {
		
		FileOutputStream fileOut=new FileOutputStream("Norman.txt");
		//to convert object into stream of bytes 
	ObjectOutputStream oOut=new ObjectOutputStream(fileOut);
	//to write into the file
		oOut.writeObject(emp);
		
		//-----------------------read operation-------------
		FileInputStream fileIn=new FileInputStream("Norman.txt");
		//to convert bytes to object
		ObjectInputStream oIn=new ObjectInputStream(fileIn);
		Employee empCopy=(Employee)oIn.readObject();
		System.out.println(empCopy.empId);
		System.out.println(empCopy.name);
		System.out.println(empCopy.salary);
		System.out.println(empCopy.designation);
		System.out.println(empCopy.email);
		
	}catch (Exception e) {
		e.printStackTrace();
	}
	}
}

