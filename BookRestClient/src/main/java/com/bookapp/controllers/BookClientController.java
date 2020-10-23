package com.bookapp.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.bookapp.model.Book;

@RestController
@RequestMapping("/client-api")
public class BookClientController {
	@Autowired
	RestTemplate restTemplate;
	static final String BASEURL="http://localhost:8080/book-api";
	@GetMapping("/client-books")
	public List<Book> showAllBooks(){
		String Url=BASEURL+"/books";
		List<Book> bookList=restTemplate.getForObject(Url, List.class);
		return bookList;
	}
	@GetMapping("/client-books/by-author/{author}")
	public List<Book> showBooksByAuthor(@PathVariable("author")String author){
		String Url=BASEURL+"/books-by-author/"+author;
		List<Book> bookList=restTemplate.getForObject(Url, List.class);
		return bookList;
	}
	@GetMapping("/client-books/by-category")
	public List<Book> showBooksByCategory(@PathVariable("category")String category){
		String Url=BASEURL+"/books-by-category?category="+category;
		List<Book> bookList=restTemplate.getForObject(Url, List.class);
		return bookList;
	}
	@GetMapping("/client-books/by-Id/{bookId}")
	public Book showById(@PathVariable("bookId")int id){
		String Url=BASEURL+"/books-by-Id/"+id;
		Book book=restTemplate.getForObject(Url, Book.class);
		return book;	
	}

}
