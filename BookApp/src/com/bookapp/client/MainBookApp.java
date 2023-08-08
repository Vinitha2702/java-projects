package com.bookapp.client;

import java.util.ArrayList;
import java.util.List;

import com.bookapp.model.Book;
import com.bookapp.service.BookServiceImpl;
import com.bookapp.service.IBookService;

public class MainBookApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IBookService ibookservice=new BookServiceImpl();
		List<Book> books=new ArrayList<>();
		books=ibookservice.getAll();
		System.out.println(books);
		books=ibookservice.getByAuthorContains("Ben john");
		System.out.println(books);
		ibookservice.getByCategory("tech").forEach((str)->System.out.println(str));
		System.out.println(books);
		
	}

}
