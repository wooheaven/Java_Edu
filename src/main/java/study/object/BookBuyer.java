package study.object;

public class BookBuyer {
	private Book buyerBook;
	private int bookInventory;
	private int buyerMoney;
	
	public BookBuyer(Book buyerBook, int bookInventory, int buyerMoney) {
		this.buyerBook = buyerBook;
		this.bookInventory = bookInventory;
		this.buyerMoney = buyerMoney;
	}

	public BookBuyer() {
		// TODO Auto-generated constructor stub
	}

	public Book getBuyerBook() {
		return buyerBook;
	}

	public void setBuyerBook(Book buyerBook) {
		this.buyerBook = buyerBook;
	}

	public int getBookInventory() {
		return bookInventory;
	}

	public void setBookInventory(int bookInventory) {
		this.bookInventory = bookInventory;
	}

	public int getBuyerMoney() {
		return buyerMoney;
	}

	public void setBuyerMoney(int buyerMoney) {
		this.buyerMoney = buyerMoney;
	}

	@Override
	public String toString() {
		return "BookBuyer [buyerBook=" + buyerBook + ", bookInventory="
				+ bookInventory + ", buyerMoney=" + buyerMoney + "]";
	}

	public void buyBook(Book book, int inventory) {
		// TODO Auto-generated method stub
		this.setBuyerBook(book);
		this.setBookInventory(inventory);
		this.setBuyerMoney(this.getBuyerMoney()-book.getBookPrice()*inventory);
	}

	public void print() {
		// TODO Auto-generated method stub
		System.out.println(this.toString());
	}
}
