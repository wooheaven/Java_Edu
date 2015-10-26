package day1.staticmethod;

class Method {
	public static int add() {
		int localVar = 0;

		return localVar += 10;
	}
}

public class StaticMethod {

	public static void main(String[] args) {
		System.out.println(Method.add());

	}
}
