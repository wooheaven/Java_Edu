
package day2.varinterface2;

import java.util.Scanner;

interface Week
{
   int SUN=0, MON=1, TUE=2, WED=3, THU=4, FRI=5, SAT=6 ;
}

public class VariousInterface2 {

	public static void main(String[] args) {
		System.out.println("요일을 선택^^");
		System.out.println("0.일요일, 1.월요일, 2.화요일, 3.수요일, 4.목요일, 5.금요일, 6.토요일");
		System.out.print("번호선택: ");
		
		Scanner sc=new Scanner(System.in);
		int sel=sc.nextInt();
		
		switch(sel)
		{
		case Week.SUN :
			System.out.println("오늘은 쉬는날, 그러나 내일은...");
			break;
		case Week.MON :
			System.out.println("아...월요병.");
			break;
		case Week.TUE :
			System.out.println("이제 이틀 지나감....");
			break;
		case Week.WED :
			System.out.println("절반이 지났다 !");
			break;
		case Week.THU :
			System.out.println("주말 이브 ^^");
			break;
		case Week.FRI :
			System.out.println("TGiF");
			break;
		case Week.SAT :
			System.out.println("늦잠 자도 됨!!");
	
		}

	}

}
