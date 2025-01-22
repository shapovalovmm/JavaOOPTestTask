package LibraryWorks.Users;

import LibraryWorks.Books.Book;
import LibraryWorks.Library;

import java.util.ArrayList;

public abstract class User {
    public int numOfBookAccess, daysToAccess;
    final public ArrayList<Book> borrowedBooks = new ArrayList<>();

    public void borrowBook(Object book) {
        if (book instanceof Book) {
            Book book1 = (Book) book;
            Library.borrowBook(numOfBookAccess, borrowedBooks, daysToAccess, Book.getAvailableBooks(), book1);
        } else {
            System.out.println("This is not a book");
        }

    }

    public void returnBook(Object book) {
        if (book instanceof Book) {
            Book book1 = (Book) book;
            Library.returnBook(borrowedBooks, Book.getAvailableBooks(), book1);
        } else {
            System.out.println("This is not a book");
        }

    }

}
