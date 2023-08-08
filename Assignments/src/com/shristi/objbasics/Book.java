package com.shristi.objbasics;

public class Book {
	String title;
	String author;
	double price;
	public Book(String title, String author, double price) {
		super();
		this.title = title;
		this.author = author;
		this.price = price;
	}
	
	void getDetails() {
		System.out.println("title"+title);
		System.out.println("author"+author);
		System.out.println("price"+price);
	}
	void checkBookType() {
		if(price>500) {
			System.out.println("Premium books");
		}
		else {
			System.out.println("standard books");
		}
	}
	
	
}
