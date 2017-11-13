package bookstore.controller;

import java.util.ArrayList;
import java.util.List;

import org.joda.time.DateTime;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import bookstore.model.Book;

@RestController
public class BookController {

	@RequestMapping("/books")
	public List<Book> getAllHardcodedBooks(@RequestParam(value="author", defaultValue="Pablo") String author) {
		List<Book> books = new ArrayList<Book>();
		Book book1 = new Book();
		book1.setAuthor(author);
		book1.setPublishedOnDT(new DateTime());
		book1.setPrice(503.6);
		book1.setTitle("title1");
		book1.setYear(2015);
		books.add(book1);
		
		Book book2 = new Book();
		book2.setAuthor(author);
		book2.setPublishedOnDT(new DateTime());
		book2.setPrice(305.6);
		book2.setTitle("title2");
		book2.setYear(2014);
		books.add(book2);
		return books;
    }

}
