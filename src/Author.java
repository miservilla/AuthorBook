
/**
 * @version date 2016 - 11 - 01
 * @author Michael Servilla
 */
public class Author {

    static private String lastName;
    private String firstName;
    private int birth;
    private int death;

    public Author(String lastName, String firstName){
        Author.lastName = lastName;
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
        if (lastName.equals(other) && firstName.equals(other)){
            sameName = true;
        }
        return sameName;
    }

    public String toString(){
        return lastName + ", " + firstName;
    }

//    public String inforString(){
//        String authorsName =
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


