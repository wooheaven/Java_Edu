package day5.reflectionconstructor;

import java.lang.reflect.*;
import java.util.Scanner;

public class ReflectionTest2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String className = sc.nextLine();

		try {
			Class cls = Class.forName(className);

			Constructor constructorArr[] = cls.getDeclaredConstructors();
			for (int i = 0; i < constructorArr.length; i++) {
				Constructor ct = constructorArr[i];
				System.out.println("클래스 이름 = " + ct.getName());
				System.out.println("패키지를 포함한 클래스 이름 = "
						+ ct.getDeclaringClass());

				Class paramArr[] = ct.getParameterTypes();
				for (int j = 0; j < paramArr.length; j++)
					System.out.println("파라미터 #" + j + " " + paramArr[j]);

				Class exeptArr[] = ct.getExceptionTypes();
				for (int j = 0; j < exeptArr.length; j++)
					System.out.println("예외 #" + j + " " + exeptArr[j]);

				System.out.println("-----");
			}
		} catch (Throwable e) {
			System.err.println(e);
		}
	}
}
