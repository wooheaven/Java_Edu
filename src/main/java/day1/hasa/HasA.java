package day1.hasa;

class Book {

	private String kind;

	Book(String kind) {
		this.kind = kind;
	}

	public void readBook() {
		System.out.println(kind + "을 읽습니다");
	}
}

class Student extends Book {

	private String name;

	Student(String kind, String name) {
		super(kind);
		this.name = name;
	}

	public void study() {
		System.out.println(name + "이 열심히 공부합니다!!");
	}
}

public class HasA {

	public static void main(String[] args) {

		Student std = new Student("자바책", "이삼성");

		std.readBook();
		std.study();
	}
}
