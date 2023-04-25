package practice;

import java.util.ArrayList;

public class Library{
	private String name;
	private Book book;
	private ArrayList<Book> bookList = new ArrayList();
	
	public Library(String name) {
		this.name = name;
	}
	public void showName() {
		System.out.println("(Library)"+name);
	}
	public void addBook(String title,String contents) {
	    book = new Book(title, contents);
		bookList.add(book);
	}
	public void showBookList() {
		for(Book b : bookList)b.showTitle();
	}
}
