import java.util.ArrayList;
import java.util.List;

public class DbBooks {
	private List<Book> books = new ArrayList<>();

	public DbBooks() {
		books.add(new Book("X", "Author X"));
		books.add(new Book("Y", "Author Y"));
		books.add(new Book("C", "Author C"));
		books.add(new Book("Z", "Author Z"));
		books.add(new Book("N", "Author N"));
	}

	public List<Book> getBooks() {
		return books;
	}

	public void setBooks(List<Book> books) {
		this.books = books;
	}

	public Book getBookByName(String name) {
		for (Book book : books) {
			if (book.getName().equals(name)) {
				return book;
			}
		}
		return new Book();
	}
}
