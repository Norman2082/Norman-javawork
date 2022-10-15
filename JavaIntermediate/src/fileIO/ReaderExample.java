package fileIO;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class ReaderExample {
	public static void main(String[] args) {
		try {
			Reader r = new FileReader("upasana");
			int data = r.read();// only first character
			while (data != -1)// loop through all the char until it reaches end of file
			{
				System.out.print((char) data);
				data = r.read();// read next character
			}
			// System.out.println(data);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
