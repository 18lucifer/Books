package com.Books.Controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Books.Model.Books;
import com.Books.Service.BooksService;

@RestController
@CrossOrigin
public class BooksController {
	
	@Autowired
	BooksService booksservice;
	
	@GetMapping("/book")
	private List<Books> getAllBooks(){
		return booksservice.getAllBooks();
	}
	
//	@GetMapping("/book/{bookid}")
//	private Books getBooks(@PathVariable("bookId") int bookid) {
//		return booksservice.getBooksById(bookid);
//	}
//
//	@DeleteMapping("/deletebook")
//	private void deleteBooks(Books mp) {
//		System.out.println("heloo");
//		booksservice.delete(mp);
//	}
	
	@DeleteMapping("/book/{bookid}")  
	private void deleteBook(@PathVariable("bookid") String bookid)   
	{  
	booksservice.delete(bookid);  
	}  
	
	
	@PostMapping("/savebooks")
	private Books saveBooks(@RequestBody Books books) {
//		System.out.println(booksservice+"lllllllllllll");
		System.out.println(books);
//		System.out.println("sassssssssssssa1111111111"+books.getBookid());
		booksservice.saveOrUpdate(books);
//		System.out.println("sassssssssssssa"+books.getBookid());
		return books;
	}
	
	@PutMapping("/books")
	private Books updateBooks(@RequestBody Books books) {
		booksservice.saveOrUpdate(books);
		return books;
	}
}
