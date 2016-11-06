/**
 * @version date 2016 - 11 - 01
 * @author Michael Servilla
 */
public class Book {

    private int pubYear = AuthorBookConstants.UNKNOWN_YEAR;
    private String title = AuthorBookConstants.UNKNOWN_TITLE;
    private String isbn = AuthorBookConstants.UNKNOWN_ISBN;
    private Author author = AuthorBookConstants.UNKNOWN_AUTHOR;


    public Book(){
    }

    public Book(String title){
        this.title = title;
    }

    public Book(String title, Author author){
        this.title = title;
        this.author = author;
    }

    public int getPubYear() {
        return pubYear;
    }


    public void setPubYear(int year) {
        if (year > -2000 && year < 2021){
            this.pubYear = year;
        } else {
            System.out.println("You have attempted an invalid YEAR!");
        }
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        if (title != ""){
            this.title = title;
        }else {
            System.out.println("Invalid title!");
        }
    }

    public String getISBN() {
        return isbn;
    }

    public void setISBN(String isbn) {
        if (isbn.length()== 10 || isbn.length()== 13){
            this.isbn = isbn;
        }else {
            System.out.println("Invalid ISBN!");
        }
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    /**
     * Returns true if this book has the same Author as the book that was passed in in the
     * arguments, otherwise return false. (Hint: You already wrote a method to see if authors
     * are the same.)
     *
     * @param book
     * @return
     */
    public boolean sameAuthor(Book book){
        Author author = book.getAuthor();
        boolean same = false;
        if (this.author.isSame(author)){
            same = true;
        }
        return same;
//        return this.author.isSame(book.getAuthor());
    }

    /**
     * Returns true if this book is equal to the other book. We will say that two Book objects
     are equal if their ISBNs are equal.
     * @param other
     * @return
     */
    public boolean equals(Book other){
        boolean equals = false;
        if (this.isbn.equals(other.getISBN())){
            equals = true;
        }
        return equals;
    }

    /**
     * Should return (not print!) a String representation of this Book.
     If only a title has been set, return a string of the form:
     The Arcades Project.
     If a title and author are set:
     The Arcades Project. Benjamin, Walter.
     If a title and author and year have been set:
     The Arcades Project (2002). Benjamin, Walter.
     Note the punctuation in the examples above, it must be exact to pass the tests
     * @return
     */
    public String toString(){
        if (this.author != AuthorBookConstants.UNKNOWN_AUTHOR &&
                this.pubYear != AuthorBookConstants.UNKNOWN_YEAR){
            return this.title.toString() + " (" + this.pubYear + "). " +
                    this.author.getLastName().toString() + ", " +
                    this.author.getFirstName().toString() + ".";
        } else if (this.author != AuthorBookConstants.UNKNOWN_AUTHOR){
            return this.title.toString() + ". " +
                    this.author.getLastName().toString() + ", " +
                    this.author.getFirstName().toString() + ".";
        } else return this.title.toString() + ".";
    }
//
//    public static void main(String[] args){
//        System.out.println();
//
//    }

}
