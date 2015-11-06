package study.object;

public class BookSale {
	public static void main(String[] args) {
		// before buy book
		Book book = new Book("Java", 9000);
		book.print();
		
		BookSeller bookSeller = new BookSeller();
		bookSeller.preparedBook(book,10);
		bookSeller.setBookSellerMoney(0);
		bookSeller.print();
		
		BookBuyer bookBuyer = new BookBuyer();
		bookBuyer.setBuyerMoney(18000);
		bookBuyer.print();
		
		// after buy book
		book.print();
		
		bookSeller.sellBook(book,2);
		bookSeller.print();
		
		bookBuyer.buyBook(book,2);
		bookBuyer.print();
	}
}
