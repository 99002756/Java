package com.bookapp.service;

//import java.awt.print.Book;
import java.util.List;
import com.bookapp.model.Book;
public interface BookService {
	List<Book> getAllBooks();
	List<Book> getByAuthor(String author);
	Book getById(int id);
	List<Book> getByCategory(String category);

}
