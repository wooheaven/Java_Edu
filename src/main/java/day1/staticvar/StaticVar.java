package day1.staticvar;

class Var {
	static int num = 10;

	public int methodA() {
		return num += 2;
	}
}

public class StaticVar {

	public static void main(String[] args) {
		int result = Var.num + 5;

		System.out.println(result);
	}
}
