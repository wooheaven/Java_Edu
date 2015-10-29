package day3.shipgeneric;

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

class GoodsShip<T> {
	T goods;

	public void boxing(T goods) {
		this.goods = goods;
	}

	public T unBoxing() {
		return goods;
	}
}

public class ShippingGeneric {

	public static void main(String[] args) {
		GoodsShip<Electronic> gs1 = new GoodsShip<Electronic>();
		gs1.boxing(new Electronic("배송시작"));
		Electronic e1 = (Electronic) gs1.unBoxing();
		e1.currentState();

		GoodsShip<Food> gs2 = new GoodsShip<Food>();
		gs2.boxing(new Food("배송중"));
		Food f1 = (Food) gs2.unBoxing();
		f1.currentState();

//		GoodsShip<Food> gs3 = new GoodsShip<Food>();
//		gs3.boxing("식품");
//		Food f2 = (Food) gs3.unBoxing();
//		f2.currentState();
	}
}
