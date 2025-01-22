package LibraryWorks.Books;

import java.util.ArrayList;

public abstract class Book {
    private static final ArrayList<Book> arrOfAvailableBooks = new ArrayList<>();
    private String title = "Default";
    private int daysToAccess;

    Book(Object title) {
        if (title instanceof String) {
            arrOfAvailableBooks.add(this);
            this.title = (String) title;
        }
        else {
            System.out.println("This is not a book");
        }
    }

    public String getTitle() {
        return title;
    }

    public static ArrayList<Book> getAvailableBooks() {
        return arrOfAvailableBooks;
    }

    public static ArrayList<String> getAvailableBooksTitles() {
        ArrayList<String> titles = new ArrayList<>();
        for (Book book : getAvailableBooks()) {
            titles.add(book.getTitle());
        }
        return titles;
    }

    public void setDaysToAccess(int daysToAccess) {
        this.daysToAccess = daysToAccess;
    }
}
