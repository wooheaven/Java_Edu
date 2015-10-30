package day4.bytestream3;

import java.io.*;

public class DataStream {

	public static void main(String[] args) throws IOException {
		OutputStream out = new FileOutputStream("data.txt");

		out.write(365);
		// out.write(95.7);
		out.close();

		InputStream in = new FileInputStream("data.txt");

		int num1 = in.read();

		in.close();
		System.out.println("실행결과 " + num1);
	}
}

// 실행결과 109
