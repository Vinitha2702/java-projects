package com.bookapp.service;

import java.util.ArrayList;
import java.util.List;

import com.bookapp.Exception.BookNotFoundException;
import com.bookapp.model.Book;

public interface IBookService{
	
	List<Book> getAll();
	List<Book> getByAuthorContains(String author)throws BookNotFoundException;
	List<Book> getByCategory(String category)throws BookNotFoundException;
	List<Book> getByPriceLessThan(double price)throws BookNotFoundException;
	List<Book> getByAuthorContainsAndCategory(String author,String category) throws BookNotFoundException;
	List<Book> getById(int bookId)throws BookNotFoundException;
}
