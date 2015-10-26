
package day1.carsale1;

class CarDealer{
	
	String carName = "Grandeur";
	final int price = 3500;
	int inventory = 10;
	int account = 0;
	
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
	
	int money = 5000;
	boolean owner = false;
	
	public void buyCar(CarDealer dealer, int price){
		
		owner = dealer.carSale(price);
		money-=price;
	}
	
	public void buyResult(){
		System.out.println("���� ���� �������´� "+owner+" �̸� ���� �� �ܾ��� "+money+" ���� �Դϴ�");
	}
}

public class CarSale1 {
		
	public static void main(String[] args) {
		
		CarDealer dealer = new CarDealer();
		CarBuyer buyer = new CarBuyer();
		
		buyer.buyCar(dealer, 3500);
		
		dealer.saleResult();
		buyer.buyResult();

	}
}
