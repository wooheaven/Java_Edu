
package day3.genericmethod;

class AAA
{
	public String methodA()
	{
		return "Class AAA 의 메서드 호출";
	}
	
	public String toString()
	{
		return "Class AAA 의 인스턴스";
	}
}

class BBB
{
	public String methodB()
	{
		return "Class BBB 의 메서드 호출";
	}
	
	public String toString()
	{
		return "Class BBB 의 인스턴스";
	}
}

class GenericMethodCall
{
	public <T> void gMethod(T inst)
	{
		String whatMethod ;
		
		System.out.println(inst);
		
		if(inst instanceof AAA){
			whatMethod = ((AAA) inst).methodA() ;
		}
		else{
			whatMethod = ((BBB)inst).methodB() ;
		}
		
		System.out.println(whatMethod);
	}
	
}

public class GenericMethod {

	public static void main(String[] args) {
		
		AAA aaa=new AAA();
		BBB bbb=new BBB();
		
		GenericMethodCall shower=new GenericMethodCall();
		shower.gMethod(aaa);
//		shower.<AAA>gMethod(aaa);
		shower.<BBB>gMethod(bbb);

	}
}
