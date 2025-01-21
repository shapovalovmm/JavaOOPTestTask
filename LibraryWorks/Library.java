package LibraryWorks;

import LibraryWorks.Books.Book;

import java.util.ArrayList;

public class Library {
    public void addNewBook(String name, ArrayList<String> arrOfAvailableBooks) {
        arrOfAvailableBooks.add(name);
    }

    public static void borrowBook(int numOfBookAccess, String name, ArrayList<String> borrowedBooks,
                                  int daysToAccess, ArrayList<String> arrOfAvailableBooks) {
        if (borrowedBooks.size() < numOfBookAccess ) {
            if (arrOfAvailableBooks.contains(name)) {
                System.out.println("you took the book " + name);
                borrowedBooks.add(name);
                arrOfAvailableBooks.remove(name);
            } else {
                System.out.println("This book isn't available");
            }
        } else {
            System.out.println("You have too much books");
        }
    }

    public static void returnBook(String name, ArrayList<String> borrowedBooks, ArrayList<String> arrOfAvailableBooks) {
        if (borrowedBooks.contains(name)) {
            borrowedBooks.remove(name);
            arrOfAvailableBooks.add(name);
        } else {
            System.out.println("You did not take the specified book");
        }

    }

    public static void displayAvailableBooks() {
        for (String book : Book.getAvailableBooks()) {
            System.out.println(book);
        }
    }
}
