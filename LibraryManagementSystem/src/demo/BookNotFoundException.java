package demo;

public class BookNotFoundException extends RuntimeException
{
	@Override
	public String toString()
	{
		return "Book not available in the Library";
	}

}
