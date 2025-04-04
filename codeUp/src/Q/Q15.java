package Q;

import java.util.ArrayList;
import java.util.List;

class Book {
	private String isbn;
	private String title;
	private String writer;
	private String content;
	private int price;
	
	Book() {
		super();
	}

	public Book(String isbn, String title, String writer, String content, int price) {
		this.isbn = isbn;
		this.title = title;
		this.writer = writer;
		this.content = content;
		this.price = price;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Book [isbn=" + isbn + ", title=" + title + ", writer=" + writer + ", content=" + content + ", price="
				+ price + "]";
	}
}

class Libary {
	static List<Book> bookList = new ArrayList<>();
	
	public static void addBook() {
		bookList.add(new Book("123123", "이게 자바냐", "감자바  ", "자바 감자바", 33000));
		bookList.add(new Book("112112", "정보처리기사", "김휴먼  ", "국가기술자격", 45000));
		bookList.add(new Book("001001", "실무 DB  ", "박디비  ", "디비디비딥", 60000));
	}
	
	public static void printBooks() {
		System.out.println("==================== ALOHA 스터디 도서관 ====================");
		for(Book e : bookList) {
			System.out.print(e.getIsbn() + "\t|" + e.getTitle() + "\t| " + e.getWriter() + "\t| " + e.getContent() + "\t| " + e.getPrice());
			System.out.println();
		}
	}
	
	
}
public class Q15 {
	public static void main(String[] args) {
		Libary.addBook();
		Libary.printBooks();
	}
}
