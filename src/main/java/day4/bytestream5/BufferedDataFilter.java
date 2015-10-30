
package day4.bytestream5;

import java.io.*;

public class BufferedDataFilter {

	public static void main(String[] args ) throws IOException {
		DataOutputStream out=new DataOutputStream(new BufferedOutputStream(new FileOutputStream("data.txt")));
		out.writeInt(365);
		out.writeDouble(95.7);
		out.close();
		
		DataInputStream in=new DataInputStream(new BufferedInputStream(new FileInputStream("data.txt")));
		int data1=in.readInt();
		double data2=in.readDouble();
		in.close();
		
		System.out.println("정수 실행결과 "+data1);
		System.out.println("실수 실행결과 "+data2);	
	}
}