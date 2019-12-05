package demo;

import java.util.ArrayList;

public class BookOperationsImpl implements BookOperations
{
	private static ArrayList<Book> bookList = new ArrayList<Book>();

	@Override
	public void addBook(Book book)
	{
		bookList.add(book);
		System.out.println("Book is added successfully....");
	}

	@Override
	public ArrayList<Book> searchBookTitle(String bookTitle) 
	{
		ArrayList<Book> searchList = new ArrayList<Book>();
		for(int i=0;i<=bookList.size()-1;i++)
		{
			Book retrievedBook = bookList.get(i);
			String retrievedTitle = retrievedBook.getBookTitle();
			if(bookTitle.equals(retrievedTitle))
			{
				searchList.add(retrievedBook);
			}
		}
		if(searchList.size()==0)
		{
			throw new BookNotFoundException();
		}
		else
		{
			return searchList;
		}
	}

	@Override
	public void searchBookAuthor(String bookAuthor) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void searchBookType(String bookType) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateBookPrice(int bookId, double bookPrice)
	{
		int status = 0;
		for(int i=0;i<=bookList.size()-1;i++)
		{
			Book retrievedBook = bookList.get(i);
			int retrievedBookId = retrievedBook.getBookId();
			if(bookId == retrievedBookId)
			{
				status = 1;
				System.out.println("Before Update..."+retrievedBook);
				retrievedBook.setBookPrice(bookPrice);
				bookList.set(i, retrievedBook);
				System.out.println("After Update..."+retrievedBook);
				break;
			}
		}
		if(status == 0)
		{
			throw new BookNotFoundException();
		}
	}

	@Override
	public boolean removeBook(int bookId)
	{
		boolean status = false;
		for(int i=0;i<=bookList.size()-1;i++)
		{
			Book retrievedBook = bookList.get(i);
			int retrievedBookId = retrievedBook.getBookId();
			if(bookId == retrievedBookId)
			{
				status = true;
				bookList.remove(i);
				break;
			}
		}
		return status;
	}

	@Override
	public void getBookIds() {
		// TODO Auto-generated method stub
		
	}

}






