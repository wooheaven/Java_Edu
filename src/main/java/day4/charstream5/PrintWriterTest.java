package day4.charstream5;

import java.io.*;

public class PrintWriterTest {

	public static void main(String[] args) throws IOException {
		PrintWriter out = new PrintWriter(new FileWriter("BWtest.txt"));
		out.println("삼성 멀티 캠퍼스에 오신 것을 환영 합니다 ^^");
		out.println("JAVA 재미있으신가요? ");
		out.println("잘 정리해서 돌아가시기 바랍니다 ^^");
		out.printf("%s", "printf 도 쓸 수 있어요");
		out.println(" ");
		out.println(" ");
		out.print("ycna@sogang.ac.kr");
		out.close();

		System.out.println("파일 출력 완료!!");
	}
}