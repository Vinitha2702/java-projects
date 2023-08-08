package com.shristi.objbasics;

public class BookMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book book=new Book("datastructures","shirisha",400);
		book.getDetails();
		book.checkBookType();
		
		Book book1=new Book("java","ramu",600);
		book1.getDetails();
		book1.checkBookType();
	}

}
