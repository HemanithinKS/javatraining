package com.celcom.day5;

import java.util.ArrayList;
import java.util.List;

class Book{
	String title, authour, isbn;
	Book(String title, String authour, String isbn){
		this.title = title;
		this.isbn = isbn;
		this.authour = authour;
	}
	void setTitle(String title) {
		this.title = title;
	}
	void setAuthour(String authour) {
		this.authour = authour;
	}
	void setIsbn(String isbn) {
		this.isbn = isbn;
	}	
	public String toString() {
		return title +" "+authour +" "+isbn;
	
}

class BookCollection {
	List<Book> Books = new ArrayList<>();
	
	void addBook(Book book) {
		Books.add(book);	
	}
	
	void removeBook(String isbn){
		for(Book book1 : Books) {
			if(book1.title == isbn) {
				Books.remove(book1);
			    
			}
		}
	}
	
	void displayBook(Book book) {
		for(Book book1 : Books) {
			System.out.println(book1);;    
			
			}
		}
	}
}

public class AssignmentBook {
	
	public static void main(String[] args) {
		
		Book book1 = new Book("phy","sharma","1243");
		Book book2 = new Book("phy","sharma","1243");
		
		
		
	}

}
