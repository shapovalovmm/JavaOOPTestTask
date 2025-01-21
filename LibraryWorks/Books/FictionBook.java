package LibraryWorks.Books;

public class FictionBook extends Book {
    private String genre;
    public FictionBook(String name) {
        super(name);
    }
    public FictionBook(String name, String genre) {
        super(name);
        this.genre = genre;
    }
    public void setGenre(String genre) {
        this.genre = genre;
    }
}
