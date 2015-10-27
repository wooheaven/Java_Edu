package day1.hasa;

class Book {

	private String kind;

	Book(String kind) {
		this.kind = kind;
	}

	public void readBook() {
		System.out.println(kind + "�� �н��ϴ�");
	}
}

class Student extends Book {

	private String name;

	Student(String kind, String name) {
		super(kind);
		this.name = name;
	}

	public void study() {
		System.out.println(name + "�� ������ �����մϴ�!!");
	}
}

public class HasA {

	public static void main(String[] args) {

		Student std = new Student("�ڹ�å", "�̻Ｚ");

		std.readBook();
		std.study();
	}
}
