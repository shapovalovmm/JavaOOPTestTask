package LibraryWorks.Users;

import java.util.ArrayList;

public abstract class User {
    abstract void borrowBook(String name);
    abstract void returnBook(String name);
    protected ArrayList<String> borrowedBooks;
}
