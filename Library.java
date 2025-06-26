package task3;

import java.util.HashMap;
import java.util.Map;

public class Library {

	private Map<String, Book> books = new HashMap<>();
	private Map<String, User> users = new HashMap<>();
	private Map<String, String> issuedBooks = new HashMap<>();
	
	public void addBook(Book book) {
		books.put(book.getId(), book);
	}
	
	public void registerUser(User user) {
		users.put(user.getUserId(), user);
	}
	
	public boolean issueBook(String bookId, String userId) {
		Book book = books.get(bookId);
		if(book !=null && !book.isIssued() && users.containsKey(userId)) {
			book.issue();
			issuedBooks.put(bookId, userId);
			System.out.println("Book issued to "+users.get(userId).toString());
			return true;
		}
		else {
			System.out.println("Issue failed. Either book doesn't exist,is already issued, or user not found");
			return false;
		}
	}
	public boolean returnBook(String bookId) {
		Book book = books.get(bookId);
		if(book!=null && book.isIssued()) {
			book.returnBook();
			String userId = issuedBooks.remove(bookId);
			System.out.println("Book returned by user: "+userId);
			return true;
		}
		else {
			System.out.println("Return failed. Either book doesn't exist or wasn't issued.");
			return false;
		}
	}
	
	public void listBooks() {
		for(Book book: books.values()) {
			System.out.println(book);
		}
	}
}
