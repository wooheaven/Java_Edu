package day2.enumparents3;

enum Parents {
	   FATHER("아버지"), MOTHER("어머니");
	   
	   private String call;
	   
	   Parents(String call){
	        this.call = call;
	    }

	    String getCall(){
	        return call;
	    }
}

public class EnumParents3 {
	public static void printParents (Parents p){
		System.out.println(p);
	}

	public static void print(Parents d){
		switch (d) {
		case FATHER: 
			System.out.println("아빠");
			break;
		
		case MOTHER:        
			System.out.println("엄마");
			break;
			
		default:
			System.out.println("부모님 중 한 분만 !!");	
		}
	}

	public static void main(String[] args) {
		printParents(Parents. MOTHER);
		print(Parents.FATHER);
		print(Parents.MOTHER);
//		print(Parents.BROTHER);  컴파일 에러
		
		for(Parents p : Parents.values()){
		    System.out.println("enum 내부 데이터 : " + p);
		}

		System.out.println(Parents.FATHER.getCall());
	}
}