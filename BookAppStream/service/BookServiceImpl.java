package com.bookapp.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.bookapp.Exception.BookNotFoundException;
import com.bookapp.model.Book;
import com.bookapp.util.BookDetails;

public class BookServiceImpl implements IBookService{

	

	@Override
	public List<Book> getAll() {
		List<Book> books=BookDetails.showBooks();
		return books;
	}

	@Override
	public List<Book> getByAuthorContains(String author) throws BookNotFoundException {
		// TODO Auto-generated method stub
		List<Book> books=getAll();
		List<Book>getAuthorContains=books.stream()
				.filter(book1->book1.getAuthor().equals(author))
				.collect(Collectors.toList());
		
		if(getAuthorContains.size()==0) {
			throw new BookNotFoundException("Book not found exception");
			
		}
		return getAuthorContains;
	}

	@Override
	public List<Book> getByCategory(String category) throws BookNotFoundException {
		// TODO Auto-generated method stub
		List<Book> books=getAll();
		List<Book>getByCategory1=books.stream()
				.filter(book1->book1.getCategory().equals(category))
				.collect(Collectors.toList());
		
		if(getByCategory1.size()==0) {
			throw new BookNotFoundException("Book not found exception");
			
		}
		return getByCategory1;
	}

	@Override
	public List<Book> getByPriceLessThan(double price) throws BookNotFoundException {
		// TODO Auto-generated method stub
		List<Book> books=getAll();
		List<Book>getByPriceLessThan1=books.stream()
				.filter(book1->book1.getPrice()>=(price))
				.collect(Collectors.toList());
		
		return getbyPriceLessThan1;
	}

	@Override
	public List<Book> getByAuthorContainsAndCategory(String author, String category) throws BookNotFoundException {
		// TODO Auto-generated method stub
		List<Book> books=getAll();
		List<Book>getByAuthorContainsAndCategory1=books.stream()
				.filter(book1->book1.getAuthor().equals(author))
				.filter(book1->book1.getCategory().equals(category))
				.collect(Collectors.toList());
		
		return getbyAuthorContainsAndCategory1;
	}

	@Override
	public List<Book> getById(int bookId) throws BookNotFoundException {
		// TODO Auto-generated method stub
		List<Book> books=getAll();
		List<Book>getById1=books.stream()
				.filter(book1->book1.getBookId().equals(bookId))
				.collect(Collectors.toList());
		
		return getById1;
	}

}
