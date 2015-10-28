package day2.enumparents1;

enum Parents {
	FATHER, MOTHER
}

public class EnumParents1 {
	public static void printParents(Parents p) {
		System.out.println(p);
	}

	public static void main(String[] args) {
		printParents(Parents.MOTHER);
	}
}