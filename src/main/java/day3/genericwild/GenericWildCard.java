package day3.genericwild;

class Car {
	public void drive() {
		System.out.println("운전중 ^^");
	}
}

class Sonata extends Car {
	public void drive() {
		super.drive();
		System.out.println("소나타 운전 중 ^^");
	}
}

class Cargo<T> {
	T car;

	public void cargoIn(T car) {
		this.car = car;
	}

	public T cargoOut() {
		return car;
	}
}

public class GenericWildCard {

	public static void drivingCar(Cargo<? extends Car> cg) {
		Car myCar = cg.cargoOut();
		myCar.drive();
	}

	public static void main(String[] args) {
		Cargo<Car> cg1 = new Cargo<Car>();
		cg1.cargoIn(new Car());

		Cargo<Sonata> cg2 = new Cargo<Sonata>();
		cg2.cargoIn(new Sonata());

		drivingCar(cg1);
		drivingCar(cg2);
	}
}
