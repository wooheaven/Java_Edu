package day1.poly;

import java.util.Scanner;

class Car {
	int speed = 0;

	public int speedUP() {
		return speed;
	}
}

class CompactCar extends Car {
	public int speedUP() {
		return speed + 10;
	}
}

class Sedan extends Car {
	public int speedUP() {
		return speed + 20;
	}
}

class SportsCar extends Car {
	public int speedUP() {
		return speed + 30;
	}
}

public class Poly {
	public static void main(String[] args) {
		Car myCar = null;

		Scanner input = new Scanner(System.in);
		int key = input.nextInt();

		switch (key) {
		case 1:
			myCar = new CompactCar();
			System.out.println("경차가 선택되었습니다");
			break;

		case 2:
			myCar = new Sedan();
			System.out.println("세단이 선택되었습니다");
			break;

		case 3:
			myCar = new SportsCar();
			System.out.println("스포츠카가 선택 되었습니다");
		}

		int currentSpeed = myCar.speedUP();

		System.out.println("선택하신 자동차의 현재 속도는 " + currentSpeed + " 입니다");
	}
}
