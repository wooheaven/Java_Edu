
package day5.reflectioninstance;

import java.util.Scanner;

public class ReflectionTest4 {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException
	{
/*		Class clazz = Class.forName("day5.reflectioninstance.Company");
		//Class clazz = day5.reflectioninstance.Company.class;
		Object obj = clazz.newInstance();
		System.out.println("Just made: " + obj);*/
		
		Scanner sc = new Scanner(System.in);
		String className = sc.nextLine();
		
		try {
			Class clazz = Class.forName(className);
			Object obj = clazz.newInstance();
			System.out.println("Just made: " + obj);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
