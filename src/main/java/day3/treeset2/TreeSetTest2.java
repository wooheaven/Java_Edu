package day3.treeset2;

import java.util.Iterator;
import java.util.TreeSet;

class Student implements Comparable<Student> {
	String subject;
	int score;

	public Student(String subject, int score) {
		this.subject = subject;
		this.score = score;
	}

	public int compareTo(Student p) {
		if (score > p.score)
			return 1;
		else if (score < p.score)
			return -1;
		else
			return 0;
	}

	@Override
	public String toString() {
		return "Student [subject=" + subject + ", score=" + score + "]";
	}
}

public class TreeSetTest2 {

	public static void main(String[] args) {
		TreeSet<Student> sTree = new TreeSet<Student>();
		sTree.add(new Student("JAVA", 100));
		sTree.add(new Student("C", 85));
		sTree.add(new Student("Python", 90));

		Iterator<Student> itr = sTree.iterator();
		while (itr.hasNext())
			System.out.println(itr.next().toString());
	}
}