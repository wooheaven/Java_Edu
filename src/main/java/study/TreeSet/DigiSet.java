package study.TreeSet;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

// ref : http://promc.tistory.com/11
public class DigiSet {
	public static void main(String[] args) {
		TreeSet<Integer> digiSet = new TreeSet<Integer>(new MyComparotor<Integer>());
		for (int i = 10; i > 0; i--) {
			digiSet.add(i);
		}
		digiSet.add(0);
		Iterator<Integer> it = digiSet.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}
}

class MyComparotor<T> implements Comparator<T> {

	public int compare(T o1, T o2) {
		if (o1 instanceof Integer && o2 instanceof Integer) {
			Integer a = (Integer) o1;
			Integer b = (Integer) o2;
			return a > b ? 1 : a == b ? 0 : -1;
		} else {
			return 0;
		}
	}	
}