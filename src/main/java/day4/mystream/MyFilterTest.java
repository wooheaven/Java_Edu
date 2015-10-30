package day4.mystream;

import java.io.*;

import day4.charstream6.MyFilter;

public class MyFilterTest {

	public static void main(String[] args) throws IOException {
		int c;

		InputStream in = new MyFilter(
				new BufferedInputStream(
						new FileInputStream(
								"src/test/java/day4/mystream/MyFilterTest/secondfilterdata.txt")));

		while ((c = in.read()) >= 0) {
			System.out.print((char) c);
		}
		in.close();
	}
}
