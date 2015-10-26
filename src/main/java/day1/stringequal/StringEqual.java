package day1.stringequal;

public class StringEqual {

	public static void main(String[] args) {
		String str1 = "SDS";
		String str2 = "SDS";
		String str3 = new String(str2);

		if (str1 == str2) { // 첫번째
			System.out.println("같은 문자열 참조 중");
		} else {
			System.out.println("다른 문자열 참조 중");
		}

		if (str1 == str3) { // 두번째
			System.out.println("같은 문자열 참조 중");
		} else {
			System.out.println("다른 문자열 참조 중");
		}

		if (str1.equals(str3)) { // 세번째
			System.out.println("같은 문자열 참조 중");
		} else {
			System.out.println("다른 문자열 참조 중");
		}
	}
}
