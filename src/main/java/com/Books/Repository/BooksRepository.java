package com.Books.Repository;

import java.util.List;
import java.util.Map;

//import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.Books.Model.Books;

public interface BooksRepository extends CrudRepository<Books, String> {
	
//public List findByBookid(String bookid);


//	@Query("select new Map(b.bookname as bookname, b.author as author ) from Books b where b.bookid=:bookid ")
//	public Map getData(@Param("bookid") String bookid);
	

}
