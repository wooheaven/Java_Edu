package day4.charstream1;

import java.io.*;

public class WriterChar {

	public static void main(String[] args) throws IOException {
		char c1 = 'A';
		char c2 = 'B';
		char c3 = 'C';

		Writer out = new FileWriter("char.txt");
		out.write(c1);
		out.write(c2);
		out.write(c3);
		out.close();

		System.out.println("char.txt 파일에 기록완료!!");
	}
}
