package day5.reflectionfields;

import java.lang.reflect.*;
import java.util.Scanner;

public class ReflectionTest3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String className = sc.nextLine();
		try {
			Class cls = Class.forName(className);

			Field fieldlist[] = cls.getDeclaredFields();
			for (int i = 0; i < fieldlist.length; i++) {
				Field fld = fieldlist[i];
				System.out.println("name = " + fld.getName());
				System.out.println("decl class = " + fld.getDeclaringClass());
				System.out.println("type = " + fld.getType());
				int mod = fld.getModifiers();
				System.out.println("modifiers = " + Modifier.toString(mod));
				System.out.println("-----");
			}
		} catch (Throwable e) {
			System.err.println(e);
		}
	}
}
