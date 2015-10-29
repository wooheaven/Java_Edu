package day3.hashsettest2;

import java.util.HashSet;
import java.util.Iterator;

class Data {
	int num;

	public Data(int num) {
		this.num = num;
	}

	@Override
	public int hashCode() {
		return num % 3;
	}

	@Override
	public boolean equals(Object obj) {
		Data dt = (Data) obj;
		if (dt.num == num)
			return true;
		else
			return false;
	}

	@Override
	public String toString() {
		return "Data [num=" + num + "]";
	}

}

public class HashSetCheck2 {

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