package day4.runnable;

class PrintMessage {
	String message;
	int i;

	public void printm(String thread) {
		i++;
		System.out.println(Thread.currentThread().getName() + " [" + thread	+ "]" + i + " 번째 스레드");
	}
}

class MultiThread extends PrintMessage implements Runnable {

	String name;

	public MultiThread(String name) {
		this.name = name;
		System.out.println(name + " 생성!!");
	}

	public void run() {

		for (int i = 0; i < 10; i++) {

			printm(name);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class RunnableThread {

	public static void main(String[] args) {
		MultiThread mt1 = new MultiThread("스레드1");
		MultiThread mt2 = new MultiThread("스레드2");

		Thread t1 = new Thread(mt1);
		Thread t2 = new Thread(mt2);

		t1.start();
		t2.start();

	}
}