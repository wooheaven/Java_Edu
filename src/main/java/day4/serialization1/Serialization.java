package day4.serialization1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Person implements Serializable {
	private String name;
	transient private int age;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
}

public class Serialization {

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
