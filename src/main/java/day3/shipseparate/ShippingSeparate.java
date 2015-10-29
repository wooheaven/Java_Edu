package day3.shipseparate;

class Electronic {

	String name = "전자제품";
	String status;

	Electronic(String status) {
		this.status = status;
	}

	public void currentState() {
		System.out.println(name + " " + status + " 입니다");
	}

}

class Food {

	String name = "식품";
	String status;

	public Food(String status) {
		this.status = status;
	}

	public void currentState() {
		System.out.println(name + " " + status + " 입니다");
	}
}

class ElecShip {
	Electronic goods;

	public void boxing(Electronic goods) {
		this.goods = goods;
	}

	public Electronic unBoxing() {
		return goods;
	}
}

class FoodShip {
	Food goods;

	public void boxing(Food goods) {
		this.goods = goods;
	}

	public Food unBoxing() {
		return goods;
	}
}

public class ShippingSeparate {

	public static void main(String[] args) {
		ElecShip gs1 = new ElecShip();
		gs1.boxing(new Electronic("배송시작"));
		Electronic e1 = (Electronic) gs1.unBoxing();
		e1.currentState();

		FoodShip gs2 = new FoodShip();
		gs2.boxing("식품");
		Food f1 = (Food) gs2.unBoxing();
		f1.currentState();

	}
}