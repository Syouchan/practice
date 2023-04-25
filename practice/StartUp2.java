package practice;

public class StartUp2 {

	public static void main(String[] args) {
		Library lib = new Library("A市立図書館");
		lib.addBook("B市立図書館","a");
		lib.showName();
		lib.showBookList();
	}

}
