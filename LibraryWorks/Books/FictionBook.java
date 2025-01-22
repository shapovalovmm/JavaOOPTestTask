package LibraryWorks.Books;

public class FictionBook extends Book {
    private String genre;
    public FictionBook(Object title) {
        super(title);
    }
    public FictionBook(Object title, String genre) {
        super(title);
        this.genre = genre;
    }
    public void setGenre(String genre) {
        this.genre = genre;
    }
}
