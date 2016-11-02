/**
 * @version date 2016 - 11 - 01
 * @author Michael Servilla
 */
public class Author {

    private String lastName;
    private String firstName;
    private int birth;
    private int death;

    public Author(String lastName, String firstName){

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
        if (other.equals(Author));
    }

    public String toString(){

    }

    public String inforString(){

    }


    public static void main(String[] args){

    }
}


