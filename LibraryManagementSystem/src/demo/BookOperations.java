package demo;

import java.util.ArrayList;

public interface BookOperations
{
	void addBook(Book book);
	ArrayList<Book> searchBookTitle(String bookTitle);
	void searchBookAuthor(String bookAuthor);
	void searchBookType(String bookType);
	void updateBookPrice(int bookId,double bookPrice);
	boolean removeBook(int bookId);
	void getBookIds();
}












