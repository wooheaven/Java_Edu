package day2.varinterface1;

import java.util.Scanner;

public class VariousInterface1 {
	public static void main(String[] args) {
		System.out.println("요일을 선택^^");
		System.out.println("0.일요일, 1.월요일, 2.화요일, 3.수요일, 4.목요일, 5.금요일, 6.토요일");
		System.out.print("번호선택: ");

		Scanner sc = new Scanner(System.in);
		int sel = sc.nextInt();

		switch (sel) {
		case 0:
			System.out.println("오늘은 쉬는날, 그러나 내일은...");
			break;
		case 1:
			System.out.println("아...월요병.");
			break;
		case 2:
			System.out.println("이제 이틀 지나감....");
			break;
		case 3:
			System.out.println("절반이 지났다 !");
			break;
		case 4:
			System.out.println("주말 이브 ^^");
			break;
		case 5:
			System.out.println("TGiF");
			break;
		case 6:
			System.out.println("늦잠 자도 됨!!");
		}
	}
}