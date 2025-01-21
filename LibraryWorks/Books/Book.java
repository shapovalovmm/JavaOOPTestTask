package LibraryWorks.Books;

import java.util.ArrayList;

public abstract class Book {
    private static ArrayList<String> arrOfAvailableBooks = new ArrayList<String>();

    public Book(String name) {
        arrOfAvailableBooks.add(name);
    }

    public static ArrayList<String> getAvailableBooks() {
        return arrOfAvailableBooks;
    }


}
