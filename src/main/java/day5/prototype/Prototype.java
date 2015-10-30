package day5.prototype;

class Inform implements Cloneable {
	private String name;
	private int age;

	public Inform(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public void showInform() {
		System.out.printf("[%s, %d]", name, age);
	}

	public void changeInform(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}

class AddedInform implements Cloneable {
	Inform manager, emp;

	public AddedInform(String i1, int i2, String i3, int i4) {
		manager = new Inform(i1, i2);
		emp = new Inform(i3, i4);
	}

	public void showInform() {
		System.out.println("회사정보");
		System.out.print("첫번째");
		manager.showInform();
		System.out.println("");
		System.out.print("두번째 ");
		emp.showInform();
		System.out.println("\n");
	}

	public void changeInform(String i1, int i2, String i3, int i4) {
		manager.changeInform(i1, i2);
		emp.changeInform(i3, i4);
	}

	public Object clone() throws CloneNotSupportedException {
		AddedInform copy = (AddedInform) super.clone();
		copy.manager = (Inform) manager.clone();
		copy.emp = (Inform) emp.clone();
		return copy;
	}
}

public class Prototype {

	public static void main(String[] args) {
		AddedInform org = new AddedInform("SDS", 20, "SE", 35);
		AddedInform cpy;

		try {
			cpy = (AddedInform) org.clone();
			org.changeInform("SAMSUNG", 30, "SDS", 40);
			org.showInform();
			cpy.showInform();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}
}

// <실행결과>
//
// 회사정보
// 첫번째[SAMSUNG, 30]
// 두번째 [SDS, 40]
//
// 회사정보
// 첫번째[SDS, 20]
// 두번째 [SE, 35]
