package singleton;

public class Test {
	public static void main(String[] args) {
		System.out.println(Sample.getObjectOfSample());
		Sample.getObjectOfSample().hello();
		Sample.getObjectOfSample().hi();

	}

}
