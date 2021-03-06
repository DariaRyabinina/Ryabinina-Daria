package Lesson06;

import java.util.Comparator;

public class PersonSuperComparator implements Comparator<Person> {

    @Override
    public int compare(Person o1, Person o2) {

        int forName = o1.getName().compareTo(o2.getName());

        if (forName == 0) {
            return (o1.getAge() - o2.getAge());
        } else {
            return forName;
        }
    }

}
