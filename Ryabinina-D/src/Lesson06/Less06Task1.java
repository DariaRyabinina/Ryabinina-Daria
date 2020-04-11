package Lesson06;
/*
Написать класс PersonSuperComparator, который имплементит Comparator,
но умеет сравнивать по двум параметрам: возраст и имя. Класс Person
теперь содержит два поля int age и String name.
 */

import java.sql.SQLOutput;
import java.util.ArrayList;

public class Less06Task1 {
    public static void main(String[] args) {

        ArrayList<Person> personArrayList = new ArrayList<>();
        personArrayList.add(new Person("Вова", 19));
        personArrayList.add(new Person("Вова", 17));
        personArrayList.add(new Person("Оля", 16));
        personArrayList.add(new Person("Коля", 10));

        personArrayList.sort(new PersonSuperComparator());

        for (Person p : personArrayList) {
           System.out.println(p.toString());

        }

    }
}