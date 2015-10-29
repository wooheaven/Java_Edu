package day3.treeset1;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetTest1 {

	public static void main(String[] args) {
		TreeSet<Integer> sTree = new TreeSet<Integer>();
		sTree.add(11);
		sTree.add(51);
		sTree.add(39);
		sTree.add(11);
		sTree.add(27);

		System.out.println("저장된 데이터 수: " + sTree.size());

		Iterator<Integer> itr = sTree.iterator();
		while (itr.hasNext())
			System.out.println(itr.next());
	}
}