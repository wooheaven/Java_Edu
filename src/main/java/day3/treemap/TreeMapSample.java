package day3.treemap;

import java.util.TreeMap;
import java.util.Iterator;
import java.util.NavigableSet;

public class TreeMapSample {

	public static void main(String[] args) {
		TreeMap<Integer, String> tMap = new TreeMap<Integer, String>();

		tMap.put(1, "SDS");
		tMap.put(3, "Google");
		tMap.put(5, "Facebook");
		tMap.put(2, "MS");
		tMap.put(4, "Apple");

		NavigableSet<Integer> navi = tMap.navigableKeySet();

		System.out.println("오름차순 출력...");
		Iterator<Integer> itr = navi.iterator();
		while (itr.hasNext())
			System.out.println(tMap.get(itr.next()));

		System.out.println("내림차순 출력...");
		itr = navi.descendingIterator();
		while (itr.hasNext())
			System.out.println(tMap.get(itr.next()));
	}
}