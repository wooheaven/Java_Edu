package day3.hashsettest1;

import java.util.Iterator;
import java.util.HashSet;

class Data {
	int num;

	public Data(int num) {
		this.num = num;
	}

	@Override
	public String toString() {
		return "Data [num=" + num + "]";
	}
}

class HashSetCheck1 {
	public static void main(String[] args) {
		HashSet<Data> hSet = new HashSet<Data>();
		hSet.add(new Data(new Integer(10)));
		hSet.add(new Data(15));
		hSet.add(new Data(15));

		System.out.println("저장된 데이터 수: " + hSet.size());

		Iterator<Data> itr = hSet.iterator();
		while (itr.hasNext())
			System.out.println(itr.next());
	}
}