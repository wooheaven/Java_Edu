
package day1.carsale2;

class CarDealer{
	
	String carName ;
	int price ;
	int inventory ;
	int account = 0 ;

	public void initMember(String carName, int price, int inventory){
		this.carName = carName ;
		this.price = price ;
		this.inventory = inventory ;
	}
	
	public boolean carSale(int money){
		boolean receipt = false;
		account+=money;
		inventory-=1;
		receipt=true;
		return receipt;
	}
	
	public void saleResult(){
		System.out.println("���� ���� "+inventory+" �� �̸� �Ǹž��� "+account+" ���� �Դϴ�");
	}
}

class CarBuyer{
	
	int money = 15000;
	boolean owner = false;
	
	public void buyCar(CarDealer dealer, int price){
		
		owner = dealer.carSale(price);
		money-=price;
	}
	
	public void buyResult(){
		System.out.println("���� ���� �������´� "+owner+" �̸� ���� �� �ܾ��� "+money+" ���� �Դϴ�");
	}
}

public class CarSale2 {
		
	public static void main(String[] args) {
		
		CarDealer dealer1 = new CarDealer();
		dealer1.initMember("Grandeur", 3500, 10);
		
		CarDealer dealer2 = new CarDealer();
		dealer2.initMember("Genesis", 5500, 5);
		
		CarBuyer buyer = new CarBuyer();
		
		buyer.buyCar(dealer1, 3500);
		buyer.buyCar(dealer2, 4500);
		
		dealer1.saleResult();
		dealer2.saleResult();
		
		buyer.buyResult();

	}
}
