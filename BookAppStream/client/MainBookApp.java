import java.util.ArrayList;
import java.util.List;

import com.bookapp.Exception.BookNotFoundException;
import com.bookapp.model.Book;
import com.bookapp.service.BookServiceImpl;

public class MainBookApp {

	public static void main(String[] args) {
		BookServiceImpl bookService = new BookServiceImpl();
		List<Book> books = new ArrayList<>();
		books = bookService.getAll();
		System.out.println(books);
		try {
			books = bookService.getByAuthorContains("Ben John");
		} catch (BookNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace()
		}
		System.out.println(books);
		try {
			books = bookService.getByCategory("Tech");
		} catch (BookNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(books);
		try {
			books = bookService.getByAuthorContainsAndCategory("Richad", "Drama");
		} catch (BookNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(books);
	}

}
