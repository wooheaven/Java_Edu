package day4.charstream2;

import java.io.*;

public class ReaderChar {

	public static void main(String[] args) throws IOException {
		int read;
		char c;

		Reader in = new FileReader("char.txt");

		while ((read = in.read()) != -1) {
			c = (char) read;
			System.out.println(c);
		}
		in.close();
	}
}
