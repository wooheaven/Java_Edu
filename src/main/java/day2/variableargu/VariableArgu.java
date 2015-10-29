package day2.variableargu;

import java.util.ArrayList;

public class VariableArgu {
	public static void main(String[] args) {
		ArrayList<Integer> alt = new ArrayList<Integer>();

		alt.add(10);
		alt.add(20);
		alt.add(30);

		vArgu(alt);
		vArgu(10, 20, 30);
		vArgu(10, 20, 30, 40, 50);
	}

	public static void vArgu(ArrayList<Integer> gnums) {
		for (int num : gnums) {
			System.out.print(" " + num);
		}
		System.out.println();
		System.out.printf("ArrayList 마지막 수 %d\n", gnums.get(gnums.size() - 1));
		System.out.println();
	}

	public static void vArgu(int... gnums) {
		for (int num : gnums) {
			System.out.print(" " + num);
		}
		System.out.println();
		System.out.printf("Varible Argument 마지막 수 %d\n",
				gnums[gnums.length - 1]);
		System.out.println();
	}
}