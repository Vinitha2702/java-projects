package com.bookapp.util;

import java.util.Arrays;
import java.util.List;

import com.bookapp.model.Book;

public class BookDetails {
	public static List<Book> showBooks(){
		return Arrays.asList(new Book("java in action","john david","tech","1",900.90),
							new Book("5 ama club","robin sharma","selfhelp","2",300),
							new Book("HTML for Dummies","Ben john","tech","3",1900),
							new Book("Secret seven","enid ben","fiction","4",700),
							new Book("seven habits","john hopper","selfhelp","5",908)
				
				);
	}
}
