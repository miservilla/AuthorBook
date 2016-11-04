/**
 * @version date 2016 - 11 - 01
 * @author Michael Servilla
 */
//Make helper for valid ISBN length (string.length) of 10 or 13. Call isSame
// method in Author class.
public class Book {

    private int pubYear = AuthorBookConstants.UNKNOWN_YEAR;
    private String title = AuthorBookConstants.UNKNOWN_TITLE;
    private String isbn = AuthorBookConstants.UNKNOWN_ISBN;
    private Author author = AuthorBookConstants.UNKNOWN_AUTHOR;

    public Book(){

    }

    public Book(String title){

    }

    public Book(String title, Author author){

    }

    public int getPubYear() {
        return pubYear;
    }

    public void setPubYear(int date) {
        this.pubYear = pubYear;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public static void main(String[] args){
        System.out.println();

    }

}
