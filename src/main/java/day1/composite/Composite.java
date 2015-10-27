package day1.composite;

class Book {

	private String kind;

	Book(String kind) {
		this.kind = kind;
	}

	public void readBook() {
		System.out.println(kind + "을 읽습니다");
	}
}

class Student {

	private String name;
	Book book;

	Student(String name) {
		this.name = name;
		book = new Book("자바책");
	}

	public void study() {
		book.readBook();
		System.out.println(name + "이 열심히 공부합니다!!");
	}
}

public class Composite {

	public static void main(String[] args) {
		Student std = new Student("이삼성");

		std.study();
	}
}
