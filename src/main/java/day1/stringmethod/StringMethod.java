package day1.stringmethod;

public class StringMethod {

	public static void main(String[] args) {
		String str1 = "SDS Ltd";
		String str2 = "SAMSUNG";

		System.out.println(str1.substring(4));
		System.out.println(str1.substring(0, 3));
		System.out.println(str2.concat(str1));
		System.out.println(str2.indexOf("S"));
		System.out.println(str2.lastIndexOf("S"));

		if (str1.compareTo(str2) > 0) {
			System.out.println("SDS Ltd 가 더 크다");
		} else {
			System.out.println("SAMSUNG 이 더 크다");
		}

		System.out.println("");
		String[] arr = str1.split(" ");
		System.out.println("분리된 문자열은");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
