package LibraryWorks;

import LibraryWorks.Books.FictionBook;
import LibraryWorks.Users.Student;
import LibraryWorks.Users.Teacher;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        FictionBook book1 = new FictionBook("Alice in Wonderland");
        FictionBook book2 = new FictionBook("1984");
        
        Student stud1 = new Student();

        library.displayAvailableBooks();
        stud1.borrowBook("1984");

        library.displayAvailableBooks();
        stud1.returnBook("1984");
        library.displayAvailableBooks();

        Teacher teacher1 = new Teacher();
        teacher1.borrowBook("Alice in Wonderland");
        library.displayAvailableBooks();
    }
}