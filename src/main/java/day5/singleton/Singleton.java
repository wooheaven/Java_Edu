package day5.singleton;

class SingletonTest {
	private static SingletonTest sgt = new SingletonTest();
	private int cnt = 0;

	private SingletonTest() {
	}

	public static SingletonTest getInstance() {
		return sgt;
	}

	public int getNextInt() {
		return cnt += 1;
	}
}

public class Singleton {

	public static void main(String[] args) {
		Singleton s = new Singleton();
		s.methodX();
		s.methodY();
	}

	public void methodX() {
		SingletonTest st = SingletonTest.getInstance();
		int count = st.getNextInt();
		System.out.println("메서드X 호출 뒤 " + count);
	}

	public void methodY() {
		SingletonTest st = SingletonTest.getInstance();
		int count = st.getNextInt();
		System.out.println("메서드Y 호출 뒤 " + count);
	}
}
