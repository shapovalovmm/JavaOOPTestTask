package LibraryWorks;

import LibraryWorks.Books.Book;

import java.util.ArrayList;

public class Library {
    public static void borrowBook(int numOfBookAccess,  ArrayList<Book> borrowedBooks,
                                  int daysToAccess, ArrayList<Book> arrOfAvailableBooks, Book book) {
        if (borrowedBooks.size() < numOfBookAccess ) {
            if (arrOfAvailableBooks.contains(book)) {
                System.out.println("you took the book \"" + book.getTitle() + "\"");
                borrowedBooks.add(book);
                arrOfAvailableBooks.remove(book);
                book.setDaysToAccess(daysToAccess);
            } else {
                System.out.println("This book isn't available");
            }
        } else {
            System.out.println("You have too much books");
        }
    }

    public static void returnBook(ArrayList<Book> borrowedBooks, ArrayList<Book> arrOfAvailableBooks, Book book) {
        if (borrowedBooks.contains(book)) {
            System.out.println("you return the book \"" + book.getTitle() + "\"");
            borrowedBooks.remove(book);
            arrOfAvailableBooks.add(book);
        } else {
            System.out.println("You did not take the specified book");
        }

    }

    public static void displayAvailableBooks() {
        for (String book : Book.getAvailableBooksTitles()) {
            System.out.println(book);
        }
        System.out.println("\n");
    }
}
