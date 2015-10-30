package day4.bytestream4;

import java.io.*;

public class DataFilterStream {

	public static void main(String[] args) throws IOException {

		DataOutputStream fout = new DataOutputStream(new FileOutputStream(
				"data.txt"));
		fout.writeInt(365);
		fout.writeDouble(95.7);
		fout.close();

		DataInputStream fin = new DataInputStream(new FileInputStream(
				"data.txt"));
		int data1 = fin.readInt();
		double data2 = fin.readDouble();
		fin.close();

		System.out.println("정수 실행결과 " + data1);
		System.out.println("실수 실행결과 " + data2);
	}
}

// 정수 실행결과 365
// 실수 실행결과 95.7