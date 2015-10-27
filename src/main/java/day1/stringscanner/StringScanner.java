package day1.stringscanner;

import java.util.Scanner;

public class StringScanner {

	public static void main(String[] args) {
		String input = "10 20 30";
		Scanner sc = new Scanner(input);

		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		int sum = num1 + num2 + num3;

		System.out.printf("문자열로 입력된 수 %d, %d, %d 의 합은 %d 이다\n", num1, num2,
				num3, sum);
	}
}
