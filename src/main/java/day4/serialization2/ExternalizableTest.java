package day4.serialization2;

import java.io.*;

class Person implements Externalizable {
	private String name;
	transient private int age;

	public Person() {

	}

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public void writeExternal(ObjectOutput out) throws IOException {
		out.writeObject(this.name);

		if (this.name.equals("SDS")) {
			out.writeObject(25);
		} else {
			out.writeObject(this.age);
		}
	}

	public void readExternal(ObjectInput in) throws IOException,
			ClassNotFoundException {
		this.name = (String) in.readObject();
		this.age = (Integer) in.readObject();
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
}

public class ExternalizableTest {

	public static void main(String[] args) throws IOException,ClassNotFoundException {
		ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("ObjectOut.bin"));
		out.writeObject(new Person("SAMSUNG", 20));
		out.writeObject(new Person("SDS", 30));
		out.writeObject(new String("String Test ^^"));
		out.close();

		ObjectInputStream in = new ObjectInputStream(new FileInputStream("ObjectOut.bin"));
		Person p1 = (Person) in.readObject();
		Person p2 = (Person) in.readObject();
		String str = (String) in.readObject();
		in.close();

		System.out.println(p1);
		System.out.println(p2);
		System.out.println(str);
	}
}

// 실행결과
// Person [name=SAMSUNG, age=20]
// Person [name=SDS, age=25]
// String Test ^^
