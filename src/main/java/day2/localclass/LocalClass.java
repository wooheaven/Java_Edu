
package day2.localclass;

class LocalClassExample{
    private int num1 = 0;
    private static int num2 = 10;
    private static final int num3 = 100;     

    public void outerMethod1() {
          String city1 = "서울";
          final String city2 = "뉴욕";
          System.out.println(city1);
          System.out.println(city2);
          System.out.println("파리");
    } 


    public void outerMethod2() {
          //public int aa= 0; 컴파일 에러
          String hello = "안녕하세요";
          //private final int bb = 1; 컴파일 에러
          //private static int cc = 2; 컴파일 에러
          final int finalNumber = 2015;             

          	class Local {
                 		public void localMethod() {
                     		System.out.println("외부클래스 메서드 접근가능");
                     		outerMethod1();
                    		System.out.println("외부클래스 변수 접근가능");
                     		System.out.println(num1);
                    		System.out.println(num2);
                     		System.out.println(num3);
                 		}

                 		public void localMemberDisplay() {
                     		System.out.println(
                      		"LocalClass를 포함하는 메서드의 변수 : ");
                     		//System.out.println(hello); 컴파일 에러
                     		System.out.println(finalNumber);
                		}
          }
          Local local = new Local();
          local.localMethod();
          local.localMemberDisplay();
    }
} 

public class LocalClass {

	public static void main(String[] args) {
		LocalClassExample test = new LocalClassExample();
         test.outerMethod2();

	}
}
