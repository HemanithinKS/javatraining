package com.celcom.day5;

import java.util.ArrayList;
import java.util.List;

class Book {
    String title, author, isbn;

    Book(String title, String author, String isbn) {
        this.title = title;
        this.isbn = isbn;
        this.author = author;
    }

    void setTitle(String title) {
        this.title = title;
    }

    void setAuthor(String author) {
        this.author = author;
    }

    void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    
    public String toString() {
        return title + " " + author + " " + isbn;
    }
}

class BookCollection {
    List<Book> books = new ArrayList<>();

    void addBook(Book book) {
        books.add(book);
    }

    void removeBook(String isbn){
		for(Book book : books) {
			if(book.title == isbn) {
				books.remove(book);
			    
			}
		}
	}


    void displayBooks() {
        for (Book book : books) {
            System.out.println(book);
        }
    }
}

public class AssignmentBook {
    public static void main(String[] args) {
   
        Book book1 = new Book("Physics", "Sharma", "1243");
        Book book2 = new Book("Math", "Singh", "1244");

   
        BookCollection bookCollection = new BookCollection();


        bookCollection.addBook(book1);
        bookCollection.addBook(book2);

        bookCollection.displayBooks();


        bookCollection.removeBook("1243");


        bookCollection.displayBooks();
    }
}
