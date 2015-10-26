package day1.carsale5;

class CarDealer{
	
	private String carName ;
	private final int price ;
	private int inventory ;
	private int account = 0 ;

	public CarDealer(String carName, int price, int inventory){
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
		System.out.println("���� ����� "+inventory+" �� �̸� �Ǹž��� "+account+" ���� �Դϴ�");
	}
}

class CarBuyer{
	
	private int money = 15000;
	private boolean owner = false;
	
	public void buyCar(CarDealer dealer, int price){
		
		owner = dealer.carSale(price);
		money-=price;
	}
	
	public void buyResult(){
		System.out.println("���� ���� �������´� "+owner+" �̸� ���� �� �ܾ��� "+money+" ���� �Դϴ�");
	}
}

public class CarSale5 {
		
	public static void main(String[] args) {
		
		CarDealer dealer1 = new CarDealer("Grandeur", 3500, 10);
		CarDealer dealer2 = new CarDealer("Genesis", 5500, 5);
				
		CarBuyer buyer = new CarBuyer();
		
		buyer.buyCar(dealer1, 3500);
		buyer.buyCar(dealer2, 5500);
		
		dealer1.saleResult();
		dealer2.saleResult();
		
		buyer.buyResult();
	}
}