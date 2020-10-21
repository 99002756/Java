package com.bookapp.service;

//import java.awt.print.Book;
import java.util.List;

import com.bookapp.dao.BookDAO;
import com.bookapp.dao.BookDAOImpl;
import com.bookapp.model.Book;
public class BookServiceImpl implements BookService {
BookDAO bookDAO=new BookDAOImpl();
	@Override
	public List<Book> getAllBooks() {
		// TODO Auto-generated method stub
		return bookDAO.getAllBooks();
	}

	@Override
	public List<Book> getByAuthor(String author) {
		// TODO Auto-generated method stub
		return bookDAO.getByAuthor(author);
	}

	@Override
	public Book getById(int id) {
		// TODO Auto-generated method stub
		return bookDAO.getById(id);
	}

	@Override
	public List<Book> getByCategory(String category) {
		// TODO Auto-generated method stub
		return bookDAO. getByCategory(category);
	}
	
	

	
	}

	

	
	


