
package day1.tostring;

class Person{
	private String name;
	private int age;
	
	public Person(String name, int age){
		this.name = name;
		this.age = age;
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
}

public class ToString {

	public static void main(String[] args) {
			
		Person p1 = new Person("AAA", 24);
		Person p2 = new Person("BBB", 30);
		
		System.out.println(p1);
		System.out.println(p2);

	}
}
