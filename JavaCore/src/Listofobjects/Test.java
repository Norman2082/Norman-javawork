package Listofobjects;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {
public static void main(String[] args) {
	Product prod1=new Product("Bluetooth",50,10,"Boat");
	//System.out.println(prod.toString());
	Product prod2=new Product("TV",1000,5,"Apple");
	//System.out.println(prod2.toString());
	Product prod3=new Product("Camera",500,8,"Sony");
	//System.out.println(prod3.toString());
	Product prod4=new Product("Tripod",70,15,"Digitech");

//System.out.println(prod4.toString());
ArrayList<Product>list=new ArrayList();
list.add(prod1);
list.add(prod2);
list.add(prod3);
list.add(prod4);
list.add(new Product("lipstick",20,100,"Mac"));
//System.out.println(list);
 
for(int i=0;i<list.size();i++) {

if(list.get(i).price>100 && list.get(i).quantity>5)
		{
	System.out.println(list.get(i));
		}
Scanner scn=new Scanner(System.in);
System.out.println("Enter name");
String findName=scn.next();

}}}