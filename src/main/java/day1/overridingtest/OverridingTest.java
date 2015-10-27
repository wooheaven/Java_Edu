package day1.overridingtest;

class GrandFather {
	public void call() {
		System.out.println("할아버지 ^^");
	}

	public void hello() {
		System.out.println("할아버지가 호출되었습니다");
	}
}

class Father extends GrandFather {
	public void call(int father) {
		System.out.println("아버지 ^^");
	}

	public void hello() {
		System.out.println("아버지가 호출되었습니다");
	}
}

class Son extends Father {
	public void call(double son) {
		System.out.println("아들 ^^");
	}

	public void hello() {
		System.out.println("아들이 호출되었습니다");
	}
}

public class OverridingTest {

	public static void main(String[] args) {
		GrandFather gfa = new Son();
		Father fa = new Son();
		Son son = new Son();

		son.call();
		son.call(1);
		son.call(1.0);

		gfa.hello();
		fa.hello();
		son.hello();
	}
}