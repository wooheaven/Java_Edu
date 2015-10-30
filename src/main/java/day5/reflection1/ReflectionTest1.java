package day5.reflection1;

import java.lang.reflect.Method;
import java.util.Scanner;

public class ReflectionTest1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String className = sc.nextLine();

		try {
			Class c = Class.forName(className);
			Method m[] = c.getDeclaredMethods();
			for (int i = 0; i < m.length; i++)
				System.out.println(m[i].toString());
		} catch (Throwable e) {
			System.err.println(e);
		}
	}
}
