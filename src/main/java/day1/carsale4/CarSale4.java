package day1.carsale4;

class CarDealer {

	String carName;
	final int price;
	int inventory;
	int account = 0;

	public CarDealer(String carName, int price, int inventory) {
		this.carName = carName;
		this.price = price;
		this.inventory = inventory;
	}

	public boolean carSale(int money) {
		boolean receipt = false;
		account += money;
		inventory -= 1;
		receipt = true;
		return receipt;
	}

	public void saleResult() {
		System.out.println("현재 재고는 " + inventory + " 대 이며 판매액은 " + account
				+ " 만원 입니다");
	}
}

class CarBuyer {

	int money = 15000;
	boolean owner = false;

	public void buyCar(CarDealer dealer, int price) {

		owner = dealer.carSale(price);
		money -= price;
	}

	public void buyResult() {
		System.out.println("현재 차량 소유상태는 " + owner + " 이며 구매 후 잔액은 " + money
				+ " 만원 입니다");
	}
}

public class CarSale4 {

	public static void main(String[] args) {

		CarDealer dealer1 = new CarDealer("Grandeur", 3500, 10);
		CarDealer dealer2 = new CarDealer("Genesis", 5500, 5);

		CarBuyer buyer = new CarBuyer();

		buyer.money -= 1000;
		dealer1.account += 1000;
		buyer.owner = true;
		dealer1.inventory -= 3;

		dealer1.saleResult();
		dealer2.saleResult();

		buyer.buyResult();

	}
}