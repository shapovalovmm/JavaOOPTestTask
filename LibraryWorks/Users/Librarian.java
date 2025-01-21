package LibraryWorks.Users;

import LibraryWorks.Books.Book;
import LibraryWorks.Library;

import java.util.ArrayList;

public class Librarian extends User{
    private int numOfBookAccess, daysToAccess;
    private ArrayList<String> borrowedBooks = new ArrayList<String>();

    public Librarian() {
        numOfBookAccess = 100;
        daysToAccess = 1000;
    }

    @Override
    public void borrowBook(String name) {
        Library.borrowBook(numOfBookAccess, name, borrowedBooks, daysToAccess, Book.getAvailableBooks());
    }

    @Override
    public void returnBook(String name) {
        Library.returnBook(name, borrowedBooks, Book.getAvailableBooks());
    }
}
