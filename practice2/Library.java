package practice2;

public class Library{
	private String name;
	Book[] bookList = new Book[5];
	
	public Library(String name) {
		this.name = name;
	}
	public void showName() {
		System.out.println("(Library)"+name);
	}
	public void addBook(int nn,String title,String contents) {
		
		 Book book = new Book(title,contents);
		 bookList[nn] = book;
	}
	public void showBookList() {
		for(Book b : bookList)b.showTitle();
	}
}
