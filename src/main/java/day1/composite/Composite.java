package day1.composite;

class Book {

	private String kind;

	Book(String kind) {
		this.kind = kind;
	}

	public void readBook() {
		System.out.println(kind + "�� �н��ϴ�");
	}
}

class Student {

	private String name;
	Book book;

	Student(String name) {
		this.name = name;
		book = new Book("�ڹ�å");
	}

	public void study() {
		book.readBook();
		System.out.println(name + "�� ������ �����մϴ�!!");
	}
}

public class Composite {

	public static void main(String[] args) {
		Student std = new Student("�̻Ｚ");

		std.study();
	}
}
