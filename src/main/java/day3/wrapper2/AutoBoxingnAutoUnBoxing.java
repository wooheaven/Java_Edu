package day3.wrapper2;

public class AutoBoxingnAutoUnBoxing {

	public static void main(String[] args) {
		Integer i = 10; // Boxing
		Double d = 10.1; // Boxing

		System.out.println(i);
		System.out.println(d);

		i += 20; // UnBoxing 후 Boxing
		d += 0.4; // UnBoxing 후 Boxing

		System.out.println(i);
		System.out.println(d);

	}
}