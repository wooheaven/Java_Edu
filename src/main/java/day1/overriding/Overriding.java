package day1.overriding;

class Car {
	private int speed;

	public void showCurrentSpeed() {
		System.out.println("�ڵ��� �ӵ�: " + speed);
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public int getSpeed() {
		return speed;
	}
}

class Truck extends Car {
	private int cargo;

	public void showCurrentSpeed() {
		super.showCurrentSpeed();
		int speed = getSpeed() - 10;

		System.out.println("Ʈ���� ����ӵ��� ������ " + cargo + " ����� " + speed + " �Դϴ�");
	}

	public void setCargo(int cargo) {
		this.cargo = cargo;
	}
}

class Overriding {
	public static void main(String[] args) {
		Car bs = new Truck();

		bs.setSpeed(100);
		((Truck) bs).setCargo(10);
		bs.showCurrentSpeed();
	}
}
