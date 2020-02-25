package Lesson06;

public class Person {
    int age;
    String name;

    public Person(String name, int age) {
        this.age = age;
        this.name = name;
    }

    public String toString() {
        System.out.println(this.name + "  " + this.age);
        return null;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
