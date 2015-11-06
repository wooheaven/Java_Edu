package study.object;

public class BookSeller {
	private Book sellerBook;
	private int bookInventory;
	private int sellerMoney;

	public BookSeller(Book book, int bookInventory, int bookSellerMoney) {
		this.sellerBook = book;
		this.bookInventory = bookInventory;
		this.sellerMoney = bookSellerMoney;
	}

	public BookSeller() {
		// TODO Auto-generated constructor stub
	}

	public Book getBook() {
		return sellerBook;
	}

	public void setBook(Book book) {
		this.sellerBook = book;
	}

	public int getBookInventory() {
		return bookInventory;
	}

	public void setBookInventory(int bookInventory) {
		this.bookInventory = bookInventory;
	}

	public int getBookSellerMoney() {
		return sellerMoney;
	}

	public void setBookSellerMoney(int bookSellerMoney) {
		this.sellerMoney = bookSellerMoney;
	}

	@Override
	public String toString() {
		return "BookSeller [book=" + sellerBook + ", bookInventory="
				+ bookInventory + ", bookSellerMoney=" + sellerMoney + "]";
	}

	public void preparedBook(Book book, int inventory) {
		this.setBook(book);
		this.setBookInventory(inventory);
	}

	public void sellBook(Book book, int inventory) {
		if (this.sellerBook.getBookName() == book.getBookName()
				&& this.bookInventory > inventory) {
			this.setBookInventory(this.getBookInventory()-inventory);
			this.setBookSellerMoney(this.getBookSellerMoney()+book.getBookPrice()*inventory);
		} else {
			System.out.println(book.getBookName() + " 책은 없습니다.");
		}
	}

	public void print() {
		System.out.println(this.toString());		
	}
}
