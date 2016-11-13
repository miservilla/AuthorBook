/**
 * @author Michael Servilla
 * @version date 2016-11-08
 */
public class Library {

    /** Books in the library. */
    private Book[] books;

    /** Number of copies for each book. */
    private int[] copies;

    /** Number of copies currently checked out for each book. */
    private int[] checkedOut;

    /** Number of unique books in the library. */
    private int numBooks;

    /** Construct a new empty Library. */
    public Library() {
        // We'll assume we never have more than 400 books.
        int librarySize = 400;
        books = new Book[librarySize];
        copies = new int[librarySize];
        checkedOut = new int[librarySize];
        numBooks = 0;
    }

    /**
     * Helper method to return next empty index in book array.
     * @param books
     * @return Returns index location of next empty location.
     */
    public static int nextEmptyIndex(Book[] books){
        int i;
        for (i = 0; i < books.length; i++) {
            if (books[i] == null){
                return i;
            }
        }
        return i;
    }

    /**
     * Get the number of total copies of all books that exist in the
     * library.
     * @return Total number of copies in the library.
     */
    public int totalCopies() {
        int totalCopies = 0;
        for (int i = 0; i < copies.length; i++) {
            totalCopies += copies[i];
        }
        return totalCopies;
    }

    /**
     * Get the number of copies currently checked out.
     * @return Total number of copies checked out.
     */
    public int totalCheckedOut() {
        int totalCheckedOut = 0;
        for (int i = 0; i < checkedOut.length; i++) {
            totalCheckedOut += checkedOut[i];
        }
        return totalCheckedOut;
    }

    /**
     * Get a String representing the status of the library.
     * @return Status string.
     */
    public String statusString() {
        //TODO: Delete following print statement for final submission!!!!!!!!!
        System.out.print("Total unique books: " + nextEmptyIndex(books) + "\n" +
                "Total number of copies: " + totalCopies() + "\n" +
                "Total checked out: " + totalCheckedOut() + "\n");
        return "Total unique books: " + nextEmptyIndex(books) + "\n" +
                "Total number of copies: " + totalCopies() + "\n" +
                "Total checked out: " + totalCheckedOut();
    }

    /**
     * Add all the books in the array to the library. Adds one copy of
     * each book.
     * @param newBooks Books to add.
     */
    public void addBooks( Book[] newBooks ) {
        for (int i = 0; i < newBooks.length; i++) {
            addBook(newBooks[i]);
        }
    }

    /**
     * Add a single book the library.
     *
     * If the book is already present, adds another copy.
     * If the book is new, add it after the existing books.
     * @param b Book to add.
     */
    public void addBook( Book b ) {
        int emptyIndex = nextEmptyIndex(books);
        int i;
        for (i = 0; i < emptyIndex; i++) {
            if (this.books[i].equals(b)) {
                copies[i]++;
                break;
            }
        }
        if (i == emptyIndex) {
            books[emptyIndex] = b;
            copies[emptyIndex]++;
        }
    }

    /**
     * Checks out a book from the library if possible.
     * @param b Book to check out.
     * @return String denoting success or failure.
     */
    public String checkOutBook ( Book b ) {
        int emptyIndex = nextEmptyIndex(books);
        int i;
        for (i = 0; i < emptyIndex; i++) {
            if (this.books[i].equals(b) &&
                    (this.copies[i] - checkedOut[i]) > 0) {
                checkedOut[i]++;
                return "Checked out!";
            } else if (this.books[i].equals(b)){
                return "All out of copies.";
            }
        }
        return "Book not found.";
    }

    /**
     * Checks in a book to the library if possible.
     * @param b Book to check in.
     * @return String denoting success or failure.
     */
    public String checkInBook ( Book b ) {
        int emptyIndex = nextEmptyIndex(books);
        int i;
        for (i = 0; i < emptyIndex; i++) {
            if (this.books[i].equals(b) && checkedOut[i] > 0) {
                checkedOut[i]--;
                return "Checked in!";
            } else if (this.books[i].equals(b) && checkedOut[i] == 0) {
                return "All of our copies are already checked in.";
            }
        }
            return "Book not found.";
    }

    /**
     * Get string representation of entire library collection and status.
     * @return String representation of library.
     */
    public String toString() {
        String s = "";
        int emptyIndex = nextEmptyIndex(books);
        for (int i = 0; i < emptyIndex; i++) {
            int currentCopies = this.copies[i] - this.checkedOut[i];
            s += i + ". " + String.valueOf(this.books[i]) + " : "
                    + currentCopies + "/" + copies[i] + "\n";
        }
        s += "\n";
        s += statusString();
//        System.out.print(s);
        return s;    }

    /**
     * Get number of unique books that exist for a given author.
     * @param a The author to check.
     * @return Number of books by the author.
     */
    public int numBooksByAuthor( Author a ) {
        return -1;
    }

    /**
     * Returns a String that lists the unique books which exist for a
     * given author, in standard book format, with a newline after
     * each.  If no books are found for the author, returns string
     * that says so.
     *
     * @param a The author in question.
     * @return String listing books by the author.
     */
    public String listBooksByAuthor( Author a ) {
        return "";
    }

    /**
     * Returns string that lists the unique books with contain the
     * given string within their titles, without regard for case, with
     * a newline after each.  If no books are found containing the
     * string, returns string that says so.
     * Use to.lower case and use contains method in String class.
     * @param s The string to look for in the titles.
     * @return String listing books that contain given string in titles.
     */
    public String listBooksByTitle( String s ) {
        return "";
    }

    /**
     * Deletes book entirely from the library.
     * @param b Book to remove.
     * @return String denoting success or failure.
     */
    public String deleteBook( Book b ) {
        return "";
    }

}