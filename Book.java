package task3;

public class Book {

	private String id;
	private String title;
	private String author;
	private boolean isIssued;
	
	public Book(String id,String t,String a) {
		this.id = id;
		this.title = t;
		this.author = a;
		this.isIssued = false;
	}
	
	public String getId() {
		return id;
	}
	
	public boolean isIssued() {
		return isIssued;
	}
	
	public void issue() {
		isIssued=true;
	}
	
	public void returnBook() {
		isIssued = false;
	}
	
	public String toString() {
		return "["+id+"] "+title+" by "+author+" (Issued: "+isIssued+")";
	}
}
