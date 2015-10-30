package day4.heapthread;

class Sum {
	int total;

	public Sum() {
		total = 0;
	}

	public void addTotal(int n) {
		total += n;
	}

	public int getTotal() {
		return total;
	}
}

class AddThread extends Thread {
	Sum ss;
	int start, end;

	public AddThread(Sum sum, int s, int e) {
		ss = sum;
		start = s;
		end = e;
	}

	public void run() {
		for (int i = start; i <= end; i++)
			ss.addTotal(i);
	}
}

class HeapThread {
	public static void main(String[] args) {
		Sum s = new Sum();
		AddThread t1 = new AddThread(s, 1, 50);
		AddThread t2 = new AddThread(s, 51, 100);
		t1.start();
		t2.start();

		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("1~100까지의 합: " + s.getTotal());
	}
}