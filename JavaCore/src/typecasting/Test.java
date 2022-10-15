package typecasting;

public class Test {
	public static void main(String[] args) {

		int x;// 32 bit of data
		long y = 23456789L;// 64 bit of data
		x = (int) y;
		System.out.println(x);

		float m = 234.66f;
		int n = (int) m;
		System.out.println(n);

//String nameString ="Upasana";
//char nn=char nae;
//char k='Y';
//String l=(String)k;
		char[] h = { 'U', 'p', 'S' };

		String temp = h.toString();
		System.out.println(temp);

		char[] helloArray = { 'h', 'e', 'l', 'l', 'o', '_' };//
		String helloString = new String(helloArray);

		System.out.println(helloString);
	}
}