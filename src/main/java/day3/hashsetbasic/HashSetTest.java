package day3.hashsetbasic;

import java.util.Iterator;
import java.util.HashSet;

class HashSetTest {
	public static void main(String[] args) {
		HashSet<String> hSet = new HashSet<String>();
		hSet.add("SDS");
		hSet.add("LG");
		hSet.add("SK");
		hSet.add("LG");

		System.out.println("저장된 데이터 수: " + hSet.size());

		Iterator<String> itr = hSet.iterator();
		while (itr.hasNext())
			System.out.println(itr.next());
	}
}
