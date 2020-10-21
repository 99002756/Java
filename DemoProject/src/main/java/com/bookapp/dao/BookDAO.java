package com.bookapp.dao;

import java.util.List;

import com.bookapp.model.Book;

public interface BookDAO {
	List<Book> getAllBooks();
	List<Book> getByAuthor(String author);
	Book getById(int id);
	List<Book> getByCategory(String category);


}
