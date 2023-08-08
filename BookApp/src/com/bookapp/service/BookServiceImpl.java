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
//		List<Book>getAuthorContains=books.stream()
//				.filter(book1->book1.getAuthor().equals(author))
//				.collect(Collectors.toList());
		ArrayList<Book> getAuthorContains =new ArrayList<>();
		for(Book book:books) {
			if(book.getAuthor().contains(author)) {
				getAuthorContains.add(book);
			}
		}
		if(getAuthorContains.size()==0) {
			throw new BookNotFoundException("Book not found exception");
			
		}
		return getAuthorContains;
	}

	@Override
	public List<Book> getByCategory(String category) throws BookNotFoundException {
		// TODO Auto-generated method stub
		List<Book> books=getAll();
//		List<Book>getByCategory1=books.stream()
//				.filter(book1->book1.getCategory().equals(category))
//				.collect(Collectors.toList());
		ArrayList<Book> getByCategory1 =new ArrayList<>();
		for(Book book:books) {
			if(book.getCategory().equalsIgnoreCase(category)) {
				getByCategory1.add(book);
			}
		}
		if(getByCategory1.size()==0) {
			throw new BookNotFoundException("Book not found exception");
			
		}
		return getByCategory1;
	}

	@Override
	public List<Book> getByPriceLessThan(double price) throws BookNotFoundException {
		// TODO Auto-generated method stub
		List<Book> books=getAll();
//		List<Book>getByPriceLessThan1=books.stream()
//				.filter(book1->book1.getPrice()>=(price))
//				.collect(Collectors.toList());
		ArrayList<Book> getbyPriceLessThan =new ArrayList<>();
		for(Book book:books) {
			if(book.getPrice()>=(price)) {
				getbyPriceLessThan.add(book);
				
			}
		}
		return getbyPriceLessThan;
	}

	@Override
	public List<Book> getByAuthorContainsAndCategory(String author, String category) throws BookNotFoundException {
		// TODO Auto-generated method stub
		List<Book> books=getAll();
//		List<Book>getByAuthorContainsAndCategory1=books.stream()
//				.filter(book1->book1.getAuthor().equals(author))
//				.filter(book1->book1.getCategory().equals(category))
//				.collect(Collectors.toList());
		ArrayList<Book> getbyAuthorContainsAndCategory =new ArrayList<>();
		for(Book book:books) {
			if(book.getAuthor().equals(author)) {
				if(book.getCategory().equals(category)) {
					getbyAuthorContainsAndCategory.add(book);
				}
			}
		}
		return getbyAuthorContainsAndCategory;
	}

	@Override
	public List<Book> getById(int bookId) throws BookNotFoundException {
		// TODO Auto-generated method stub
		List<Book> books=getAll();
//		List<Book>getById1=books.stream()
//				.filter(book1->book1.getBookId().equals(bookId))
//				.collect(Collectors.toList());
		ArrayList<Book> getbyId =new ArrayList<>();
		for(Book book:books) {
			if(book.getBookId().equals(bookId)){
				getbyId.add(book);
			}
		}
		return getbyId;
	}

}
