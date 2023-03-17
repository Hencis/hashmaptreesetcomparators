import java.util.Comparator;

public class AgeComparator implements Comparator<Person> {

    //The second comparator sorts all people in descending order by their age

    @Override
    public int compare(Person person1, Person person2) {
        if (person1.getAge() > person2.getAge()) {
            return -1;
        } else if (person1.getAge() < person2.getAge()) {
            return 1;
        } else {
            return person1.getAge().compareTo(person2.getAge());
        }
    }

}
