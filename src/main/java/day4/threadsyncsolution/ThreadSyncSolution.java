package day4.threadsyncsolution;

class SameAccessInstance {
	int a = 0;
	int b = 0;

	public void m1() {
		synchronized (key1) {
			a += 1;
		}
	}

	public void m2() {
		synchronized (key1) {
			a += 1;
		}
	}

	public void m3() {
		synchronized (key2) {
			b += 2;
		}
	}

	public void m4() {
		synchronized (key2) {
			b += 2;
		}
	}

	@Override
	public String toString() {
		return "SameAccessInstance [a=" + a + ", b=" + b + "]";
	}

	Object key1 = new Object();
	Object key2 = new Object();
}

class SameAccessThread extends Thread {
	SameAccessInstance sai;

	public SameAccessThread(SameAccessInstance sai) {
		this.sai = sai;
	}

	public void run() {

		for (int i = 0; i < 1000; i++) {
			for (int j = 0; j < 1000; j++) {
				sai.m1();
				sai.m2();
			}
		}

		for (int i = 0; i < 1000; i++) {
			for (int j = 0; j < 1000; j++) {
				sai.m3();
				sai.m4();
			}
		}
	}
}

public class ThreadSyncSolution {

	public static void main(String[] args) {
		SameAccessInstance same = new SameAccessInstance();

		SameAccessThread t1 = new SameAccessThread(same);
		SameAccessThread t2 = new SameAccessThread(same);

		t1.start();
		t2.start();

		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println(same);
	}
}