package demo;

public class BookManager
{
	public static BookOperations getBookOperations()
	{
		BookOperations bookOperations = new BookOperationsImpl();
		return bookOperations;
	}
}
