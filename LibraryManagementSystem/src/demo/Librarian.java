package demo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Librarian 
{
	public void performBookOpertions()
	{
		BookOperations bookOperations = BookManager.getBookOperations();
		Scanner scan = new Scanner(System.in);
		System.out.println("Press 1 to add a book...");
		System.out.println("Press 2 to search a book based on title...");
		System.out.println("Press 3 to search a book based on author...");
		System.out.println("Press 4 to search a book based on type...");
		System.out.println("Press 5 to update book price...");
		System.out.println("Press 6 to remove book...");
		System.out.println("Press 7 to get all book id's...");
		System.out.println("Enter ur choice...");
		int choice = scan.nextInt();
		if(choice == 1)
		{
			System.out.println("Enter book id...");
			int bookId = scan.nextInt();
			System.out.println("Enter book title...");
			String bookTitle = scan.next();
			System.out.println("Enter book author...");
			String bookAuthor  = scan.next();
			System.out.println("Enter book type...");
			String bookType = scan.next();
			System.out.println("Enter book price...");
			double bookPrice = scan.nextDouble();
			Book book = new  Book(bookId, bookTitle, bookAuthor, bookType, bookPrice);
			bookOperations.addBook(book);
			
		}
		else if(choice == 2)
		{
			System.out.println("Enter book title to search...");
			String bookTitle = scan.next();
			try
			{
				ArrayList<Book> searchedBookList = bookOperations.searchBookTitle(bookTitle);
				Iterator<Book> iterateSearchedBookList = searchedBookList.iterator();
				while(iterateSearchedBookList.hasNext())
				{
					Book searchedBook = iterateSearchedBookList.next();
					System.out.println(searchedBook);
				}
			}
			catch(BookNotFoundException exp)
			{
				System.out.println(exp);
			}
		}
		else if(choice == 3)
		{
			
		}
		else if(choice == 4)
		{
			
		}
		else if(choice == 5)
		{
			System.out.println("Enter book id...");
			int bookId = scan.nextInt();
			System.out.println("Enter book price...");
			double bookPrice = scan.nextDouble();
			try
			{
				bookOperations.updateBookPrice(bookId, bookPrice);
			}
			catch(BookNotFoundException exp)
			{
				System.out.println(exp+" So update not possible");
			}
		}
		else if(choice == 6)
		{
			System.out.println("Enter the book id....");
			int bookId = scan.nextInt();
			boolean removalStatus = bookOperations.removeBook(bookId);
			if(removalStatus)
			{
				System.out.println("Book is removed successfully...");
			}
			else
			{
				System.out.println("Book not found to remove...");
			}
		}
		
		
	}
}



















