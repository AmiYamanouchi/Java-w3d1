package example2;

public class Book {
	int TAX_RATE = 12;
	double PI = 3.14;
	
	private int pageNumber;
	private String title;
	private String author;
	private int publishedYear;
	
	public Book() {
		
	}
	
	// read write publish getAuthorName  ---> camelCase
	public void read() {
		System.out.println("The book is read");
	}
	
	public void publish(String publisher) {
		System.out.println("The book is published by " + publisher);
	}
	
	public String getMessage(String pubisher) {
		return "The book is published by " + pubisher;
	}
	
}
