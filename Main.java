package task3;

public class Main {

	public static void main(String[] args) {
		Library library = new Library();
		
		library.addBook(new Book("A", "1990", "George orwell"));
		library.addBook(new Book("B", "Brave New World", "aldous huxley"));
		
		library.registerUser(new User("B@", "Sagar"));
		library.registerUser(new  User("N1", "Chakle"));
		
		System.out.println("All books");
		library.listBooks();
		
		library.issueBook("A", "B@");
		
		library.returnBook("A");
		System.out.println("Books after transaction");
		library.listBooks();
	}
}
