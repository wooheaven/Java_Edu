
package day2.markerinterface;

import java.util.ArrayList;

interface Mark{
	
}

class Data1 implements Mark{
	private String name ;
	private int age ;
	
	Data1(String name, int age){
		this.name = name ;
		this.age = age ;
	}

	@Override
	public String toString() {
		return "Data1 [name=" + name + ", age=" + age + "]";
	}	
}

class Data2{
	private String name ;
	private int age ;
	
	Data2(String name, int age){
		this.name = name ;
		this.age = age ;
	}

	@Override
	public String toString() {
		return "Data2 [name=" + name + ", age=" + age + "]";
	}	
}

class InputCheck{
	public static void check(ArrayList<Mark> arrList, Object data){
		ArrayList<Mark> list = arrList ;
				
		if(data instanceof Mark){
			Data1 d1 = (Data1)data ;
			list.add(d1) ;
		}
		else{
			System.out.println("Data2 클래스는 입력이 되지 않습니다") ;
		}
	}
}

public class MarkerInterface {

	public static void main(String[] args) {
		ArrayList<Mark> box = new ArrayList<Mark>() ;
		
		Data1 d1 = new Data1("John", 27) ;
		Data2 d2 = new Data2("Jane", 24) ;
		
		InputCheck.check(box, d1);
		InputCheck.check(box, d2);
		
		for(int i=0;i<box.size();i++){
			System.out.println(box.get(i));
		}
	}
}
