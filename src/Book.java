/**
 * @version date 2016 - 11 - 01
 * @author Michael Servilla
 */
public class Book {

    private int pubYear = AuthorBookConstants.UNKNOWN_YEAR;
    private String title = AuthorBookConstants.UNKNOWN_TITLE;
    private String isbn = AuthorBookConstants.UNKNOWN_ISBN;
    private Author author = AuthorBookConstants.UNKNOWN_AUTHOR;


    /**
     * Constructor for Book class.
     */
    public Book(){
    }


    /**
     * Overloaded constructor for Book class with one parameter (title).
     * @param title
     */
    public Book(String title){
        this.title = title;
    }

    /**
     * Overloaded constructor for Book class with two parameters (title and
     * author).
     * @param title
     * @param author
     */
    public Book(String title, Author author){
        this.title = title;
        this.author = author;
    }

    /**
     * Gets publication year for book.
     * @return Returns this.pubYear.
     */
    public int getPubYear() {
        return this.pubYear;
    }


    /**
     * Setter for publication year, condition is if valid year, sets year if
     * valid, leaves unchanged if not valid.
     * @param year
     */
    public void setPubYear(int year) {
        if (year > -2000 && year < 2021){
            this.pubYear = year;
        } else {
            System.out.println("You have attempted an invalid YEAR!");
        }
    }

    /**
     * Gets instance of book title.
     * @return Returns this.title.
     */
    public String getTitle() {
        return this.title;
    }

    /**
     * Sets book title, condition is requires text, leaves unchanged if no text.
     * @param title
     */
    public void setTitle(String title) {
        if (title != ""){
            this.title = title;
        }else {
            System.out.println("Invalid title!");
        }
    }

    /**
     * Gets instance of ISBN number for book.
     * @return Returns this.isbn.
     */
    public String getISBN() {
        return this.isbn;
    }

    /**
     * Sets ISBN of book, condition is ISBN has to be either 10 or 13 character
     * length.
     * @param isbn
     */
    public void setISBN(String isbn) {
        if (isbn.length()== 10 || isbn.length()== 13){
            this.isbn = isbn;
        }else {
            System.out.println("Invalid ISBN!");
        }
    }

    /**
     * Gets instance of author for book.
     * @return Returns this.author.
     */
    public Author getAuthor() {
        return this.author;
    }

    /**
     * Sets author for this.author instance.
     * @param author
     */
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
     * If only a title has been set, return a string of the form:
     * The Arcades Project.
     * If a title and author are set:
     * The Arcades Project. Benjamin, Walter.
     * If a title and author and year have been set:
     * The Arcades Project (2002). Benjamin, Walter.
     * Note the punctuation in the examples above, it must be exact to pass the
     * tests
     * @return Returns information strings of instance of book in format
     * depending on available parameters.
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
}
