
package day2.staticinnerclass2;

public class StaticClass2 {

	static private int num1 = 10 ;
	      
    	public static void show(){
		System.out.println("static 메서드 출력 ");
	}


	static class Inner{
		
		private int num2 = 20 ;
				
		public void add(){
			show() ;
			System.out.println(num1+num2);  
			
		}
	}
	
	public static void main(String[] args) {
		StaticClass2.Inner in = new StaticClass2.Inner();
		
		in.add() ;
	}
}
