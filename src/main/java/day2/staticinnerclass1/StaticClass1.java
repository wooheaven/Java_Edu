
package day2.staticinnerclass1;

public class StaticClass1 {

	static private int num1 = 10 ;
	private int num2 = 20 ;
      
          	public static void show(){
		System.out.println("static 메서드 출력 ");
	}

	static class Inner{
				
		public void add(){
			System.out.println(num1);  //정상출력
//			System.out.println(num2);  //컴파일 에러
		}
	}	
}