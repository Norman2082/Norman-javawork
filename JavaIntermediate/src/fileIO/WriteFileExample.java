package fileIO;

import java.io.Writer;
import java.io.FileWriter;
import java.io.IOException;

public class WriteFileExample {

	public static void main(String[] args) {
		try {
			Writer w = new FileWriter("upasana");
			String content = "Welcome to the World of java";
			w.write(content); // does the writing
			w.close();// close the file
			System.out.println("file written successfully");
		} catch (IOException e) {

			{

				e.printStackTrace();
			}

		}
	}
}