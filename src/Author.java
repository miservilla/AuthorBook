
/**
 * @version date 2016 - 11 - 01
 * @author Michael Servilla
 */
// Add helper method to check validity of year.
public class Author {

    private String lastName;
    private String firstName;
    private int birth;
    private int death;

    public Author(String lastName, String firstName){
        this.lastName = lastName;
        this.firstName = firstName;

    }

    public int getBirth() {
        return birth;
    }

    public int getDeath(){
        return death;
    }

    public void setYears(int birth) {
        this.birth = birth;
    }

    public void setYears(int birth, int death) {
        this.death = death;
    }

    public boolean isSame(Author other){
        boolean sameName = false;
        if (this.lastName.equals(other) && this.firstName.equals(other)){
            sameName = true;
        }
        return sameName;
    }

    public String toString(){
        return lastName + ", " + firstName;
    }

//    public String infoString(){
//        String bookAuthor = lastName + "' " + firstName;
//        if dates were set, if woul != -4000 or the CONSTANT!
//    }


    public static void main(String[] args){
        Author author1 = new Author("joe", "big");
        String name1 = author1.toString();
        System.out.println(name1);

        Author author2 = new Author("jane", "little");
        String name2 = author2.toString();
        System.out.println(name2);

        author1 = new Author("joe", "big");
        name1 = author1.toString();
        System.out.println(name1);

    }

}


