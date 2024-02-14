package com.Books.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Books.Model.Books;
import com.Books.Repository.BooksRepository;

@Service
public class BooksService {
	
	@Autowired
	BooksRepository booksrepo;
	
	public List<Books> getAllBooks(){
		System.out.println(booksrepo+"aaaaaaa");
		List<Books> lst = new ArrayList<Books>();
		booksrepo.findAll().forEach(books -> lst.add(books));
		System.out.println(lst);
		return lst;
	}
	
//	
//	public Books getBooksById(int id) {
//		
//		return booksrepo.findById(id).get();
//	}

	
	public void saveOrUpdate(Books books) {
		String bookid = books.getBookid().toString();
		String bookname = books.getBookname().toString();
		String author = books.getAuthor().toString();
		String price = books.getPrice().toString();
		booksrepo.save(books);
	}
	
//	public void delete(Books mp) {
//		String bookid= mp.getBookid();
//		System.out.println(bookid);
//		booksrepo.deleteById(bookid);
//	}
	
	public void delete(String id)   
	{  
	booksrepo.deleteById(id);  
	}  
	
	public void save(Books books, int bookid) {
		booksrepo.save(books);
	}
}
