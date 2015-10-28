package day2.innerclass;

public class OuterClass {

	private int num1 = 10;

	class Inner {
		private int num2 = 10;

		public void add() {
			int result = num1 + num2;
			System.out.println("num1+num2 의 합은 " + result + " 입니다");
		}
	}

	public static void main(String[] args) {
		OuterClass out = new OuterClass();
		OuterClass.Inner in = out.new Inner();

		in.add();
	}
}