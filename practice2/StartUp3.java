package practice2;

public class StartUp3 {

	public static void main(String[] args) {
		Library lib = new Library("A市立図書館");
		lib.addBook(0,"A本","a");
		lib.addBook(1,"B本","b");
		lib.addBook(2,"C本","c");
		lib.addBook(3,"D本","d");
		lib.addBook(4,"E本","e");
		lib.showName();
		lib.showBookList();
	}

}
