
/**
 * @version date 2016 - 11 - 01
 * @author Michael Servilla
 */

public class Author {

    private String lastName;
    private String firstName;
    private int birth = AuthorBookConstants.UNKNOWN_YEAR;
    private int death = AuthorBookConstants.UNKNOWN_YEAR;
    private int year = AuthorBookConstants.UNKNOWN_YEAR;

//    /**
//     * Helper method to test if author's first and last name is equal to "this.
//     * instance" and the parameter author.
//     * @param a
//     * @return true if lastName and firstName are equal, false if not equal.
//     */
//    private boolean isEqual(Author a){
//        boolean equals = false;
//        if (this.lastName.equals(a.getLastName()) &&
//                this.firstName.equals((a.getFirstName()))){
//            equals = true;
//        }
//        return equals;
//    }

    /**
     * Helper method to check if year is valid (-2000 < year <2021).
     * @param year
     * @return true if year is valid, false if not.
     */
    public static boolean validYear(int year){//Does it matter if this is made static?
        boolean validYear = false;
        if (year > -2000 && year < 2021){
            validYear = true;
        } else {
            System.out.println("You have attempted an invalid YEAR!");
        }
        return validYear;
    }

    /**
     * Constructor to create new Author with lastName, firstName.
     * @param lastName
     * @param firstName
     */
    public Author(String lastName, String firstName){
        this.lastName = lastName;
        this.firstName = firstName;
    }

    public String getLastName(){
        return this.lastName;
    }

    public String getFirstName(){
        return this.firstName;
    }

    public int getBirth() {
        return birth;
    }

    public int getDeath(){
        return death;
    }

    public void setYears(int birth) {
        if (birth > -2000 && birth < 2012){
            this.birth = birth;
        } else {
            System.out.println("You have attempted an invalid YEAR!");
        }
    }

    public void setYears(int birth, int death) {
        if (birth < death && birth > -2000 && birth < 2021 && death > -2000 &&
                death < 2021){
            this.birth = birth;
            this.death = death;
        } else {
            System.out.println("You have attempted an invalid YEAR!");
        }
    }
    /**
     * Method to test if author's first and last name is equal to "this.
     * instance" and the parameter author.
     * @param a
     * @return true if lastName and firstName are equal, false if not equal.
     */
    public boolean isSame(Author a){
        boolean equals = false;
        if (this.lastName.equals(a.getLastName()) &&
                this.firstName.equals((a.getFirstName()))){
            equals = true;
        }
        return equals;
    }

    /**
     * Method to return string literal representation of chosen object.
     * @return string literal of instance lastName, firstName
     */
    public String toString(){
        return this.lastName.toString() + ", " + this.firstName.toString();
    }

    /**
     * Should return (not print) a string for the author, of the form:
     Heaney, Seamus
     If the year of birth (but not death) is set it should return:
     Heaney, Seamus (b. 1939)
     If both the years of birth and death have been set, it should return:
     Heaney, Seamus (1939-2013)
     * @return
     */
    public String infoString(){
        if (this.birth != AuthorBookConstants.UNKNOWN_YEAR &&
                 this.death != AuthorBookConstants.UNKNOWN_YEAR){
            return this.lastName.toString() + ", " + this.firstName.toString()
                    + " (" + this.birth + "-" + this.death + ")";
        } else if (this.birth != AuthorBookConstants.UNKNOWN_YEAR){
            return this.lastName.toString() + ", " + this.firstName.toString()
                    + " (b. " + this.birth + ")";
        } else {
            return this.lastName.toString() + ", " +
                    this.firstName.toString();
        }
    }

//    public static void main(String[] args){
//        Author author1 = new Author("joe", "big");
//        String name1 = author1.toString();
//        System.out.println(name1);
//
//        Author author2 = new Author("jane", "little");
//        String name2 = author2.toString();
//        System.out.println(name2);
//
//        Author author3 = new Author("Pearl", "Fancy");
//        String name3 = author3.toString();
//        System.out.println(name3);
//
//
//    }

}


