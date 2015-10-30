package day4.threadinterdependence;

import java.util.*;

class Car {
	private List<String> carList = new ArrayList<String>();
	static String carName = "그랜져";

	public synchronized void salesCar() {
		if (carList.size() == 0) {
			try {
				System.out.println("아직 차량이 생산되지 않았으니 대기 바랍니다");
				this.wait();
			} catch (InterruptedException ie) {
				ie.printStackTrace();
			}
		}

		carName = (String) carList.remove(carList.size() - 1);
		System.out.println("\"" + carName + "\" 판매되었습니다");
	}

	public synchronized void manufacture(String car) {
		carList.add(car);
		System.out.println("\"" + car + "\" 생산되었습니다");

		if (carList.size() > 1) {
			this.notifyAll();
		}
	}
}

class CarProducer extends Thread {
	private Car car;

	public CarProducer(Car car) {
		this.car = car;
	}

	public void run() {
		int count = 0;
		String carName = null;

		for (int i = 0; i < 10; i++) {
			count++;
			carName = Car.carName + count;
			car.manufacture(carName);

			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class CarCustomer extends Thread {
	private Car car;

	public CarCustomer(Car car) {
		this.car = car;
	}

	public void run() {
		for (int i = 0; i < 10; i++) {
			car.salesCar();

			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class InterDependence {
	public static void main(String[] args) {
		Car c = new Car();
		CarProducer CarProducer = new CarProducer(c);
		CarCustomer CarCustomer = new CarCustomer(c);

		Thread tCarProducer = new Thread(CarProducer);
		Thread tCarCustomer = new Thread(CarCustomer);

		tCarProducer.start();
		tCarCustomer.start();
	}
}
