package day4.charstream4;

import java.io.*;

public class BufferedReaderTest {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new FileReader("BWtest.txt"));

		String str;
		while (true) {
			str = in.readLine();
			if (str == null)
				break;

			System.out.println(str);
		}
		in.close();
	}
}
