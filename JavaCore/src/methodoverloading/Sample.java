package methodoverloading;

public class Sample {

//Method-overloading when we have more than one method with the same name but differ in 
	//number of arguments 
	//data of args
	//order of args
public void sum(int x,int y) {}
public void sum(float x,float y) {}
public void sum(int x,float y) {}
public void sum(float x,int y) {}
public void sum(double x,double y, double z) {}
public void sum(int x,int y, int z) {}
}
