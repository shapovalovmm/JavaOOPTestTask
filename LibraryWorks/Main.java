package LibraryWorks;

import LibraryWorks.Books.FictionBook;
import LibraryWorks.Books.NonFictionBook;
import LibraryWorks.Users.Student;
import LibraryWorks.Users.Teacher;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        FictionBook book1 = new FictionBook("Alice in Wonderland");
        FictionBook book2 = new FictionBook("1984");
        FictionBook book3 = new FictionBook("Golden bug");
        FictionBook book4 = new FictionBook("Treasure island");
        NonFictionBook book5 = new NonFictionBook("How to be a cool guy");
        Student stud1 = new Student();

        library.displayAvailableBooks();
        stud1.borrowBook(book2);
        library.displayAvailableBooks();
        stud1.returnBook(book2);
        library.displayAvailableBooks();
        Teacher teacher1 = new Teacher();
        teacher1.borrowBook(book1);
        teacher1.borrowBook(book3);
        teacher1.borrowBook(book5);
        library.displayAvailableBooks();
    }
}