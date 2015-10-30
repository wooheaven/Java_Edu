package day4.threadbasic;

class MultiThread extends Thread {

	String name;

	public MultiThread(String name) {
		this.name = name;
		if (getName().equalsIgnoreCase("Thread-0")) {
			System.out.println(getName() + " 스레드 생성!!");
		} else {
			System.out.println("\t" + getName() + " 스레드 생성!!");
		}
	}

	public void run() {
		for (int i = 0; i < 10; i++) {
			if (getName().equalsIgnoreCase("Thread-0")) {
				System.out.println(getName() + " [" + name + "]");
			} else {
				System.out.println("\t" + getName() + " [" + name + "]");
			}
			try {
				sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class ExtendsThread {

	public static void main(String[] args) {
		MultiThread mt1 = new MultiThread("스레드1");
		MultiThread mt2 = new MultiThread("스레드2");

		mt1.start();
		mt2.start();
	}
}