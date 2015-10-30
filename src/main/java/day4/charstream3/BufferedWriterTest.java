package day4.charstream3;

import java.io.*;

public class BufferedWriterTest {

	public static void main(String[] args) throws IOException {
		BufferedWriter out = new BufferedWriter(new FileWriter("BWtest.txt"));
		out.write("삼성 멀티 캠퍼스에 오신 것을 환영 합니다 ^^");
		out.newLine();
		out.write("JAVA 재미있으신가요? ");
		out.newLine();
		out.write("잘 정리해서 돌아가시기 바랍니다 ^^");
		out.newLine();
		out.newLine();
		out.write("ycna@sogang.ac.kr");
		out.close();
		System.out.println("파일 출력 완료!!");
	}
}
