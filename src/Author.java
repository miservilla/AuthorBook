
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

    /**
     * Constructor to create new Author with lastName, firstName.
     * @param lastName
     * @param firstName
     */
    public Author(String lastName, String firstName){
        this.lastName = lastName;
        this.firstName = firstName;
    }

    /**
     * Gets lastName and returns this.lastName instance to calling reference.
     * @return Returns this.lastName.
     */
    public String getLastName(){
        return this.lastName;
    }

    /**
     * Gets firstName and returns this.firstName instance to calling reference.
     * @return Returns this.firstName.
     */
    public String getFirstName(){
        return this.firstName;
    }

    /**
     * Gets birth year and returns this.birth instance to calling reference.
     * @return Returns this.birth.
     */
    public int getBirth() {
        return this.birth;
    }

    /**
     * Gets death year and returns this.death instance to calling reference.
     * @return Returns this.death.
     */
    public int getDeath(){
        return this.death;
    }

    /**
     * Method to set instance of this.birth to birth if condition is true. Does
     * not change if condition is false.
     * @param birth
     */
    public void setYears(int birth) {
        if (birth > -2000 && birth < 2012){
            this.birth = birth;
        } else {
            System.out.println("You have attempted an invalid YEAR!");
        }
    }

    /**
     * Method to set instance of this.birth and this.death if condition is true.
     * Does not change if condition is false.
     * @param birth
     * @param death
     */
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
    public boolean isSame(Author a) {
        boolean equals = false;
        if (this.lastName.equals(a.getLastName()) &&
                this.firstName.equals((a.getFirstName()))) {
            equals = true;
        }
        String SC1 = this.firstName;
        String SC2 = a.getFirstName();
        if (SC1.length() == 1 || SC2.length() == 1) {
            Character C1 = SC1.charAt(0);
            Character C2 = SC2.charAt(0);
            if (this.lastName.equals(a.getLastName()) &&
                    C1 == C2) {
                equals = true;
            }
        }
        return equals;
    }

    /**
     * Method to return string literal representation of chosen object.
     * @return Returns string literal of instance lastName, firstName
     */
    public String toString(){
        return this.lastName.toString() + ", " + this.firstName.toString();
    }

    /**
     * * Should return (not print) a string for the author, of the form:
     * Heaney, Seamus
     * If the year of birth (but not death) is set it should return:
     * Heaney, Seamus (b. 1939)
     * If both the years of birth and death have been set, it should return:
     * Heaney, Seamus (1939-2013)
     *
     * @return Returns information strings of this.author in format depending on
     * available parameters.
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
}


