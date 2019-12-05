package demo;

public class Book 
{
	private int bookId;
	private String bookTitle;
	private String bookAuthor;
	private String bookType;
	private double bookPrice;
	public Book(int bookId, String bookTitle, String bookAuthor, String bookType, double bookPrice) {
		super();
		this.bookId = bookId;
		this.bookTitle = bookTitle;
		this.bookAuthor = bookAuthor;
		this.bookType = bookType;
		this.bookPrice = bookPrice;
	}
	public String getBookTitle()
	{
		return this.bookTitle;
	}
	public void setBookTitle(String bookTitle) 
	{
		this.bookTitle = bookTitle;
	}
	public String getBookAuthor() 
	{
		return this.bookAuthor;
	}
	public void setBookAuthor(String bookAuthor)
	{
		this.bookAuthor = bookAuthor;
	}
	public String getBookType()
	{
		return this.bookType;
	}
	public void setBookType(String bookType)
	{
		this.bookType = bookType;
	}
	public double getBookPrice() 
	{
		return this.bookPrice;
	}
	public void setBookPrice(double bookPrice)
	{
		this.bookPrice = bookPrice;
	}
	public int getBookId()
	{
		return this.bookId;
	}
	@Override
	public String toString()
	{
		return "Book Info :---- [bookId=" + this.bookId + ", bookTitle=" + this.bookTitle + ", bookAuthor=" + this.bookAuthor + ", bookType="
				+ this.bookType + ", bookPrice=" + this.bookPrice + "]";
	}
	@Override
	public boolean equals(Object object)
	{
		Book book = (Book)object;
		return this.bookPrice == book.bookPrice;
	}
	@Override
	public int hashCode()
	{
		return this.bookId;
	}
	
	
}




















