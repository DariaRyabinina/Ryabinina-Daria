package Lesson06;

public class Person {
    private int age;
    private String name;

    public Person(String name, int age) {
        this.age = age;
        this.name = name;
    }

    public String toString() {
        return this.name + "  " + this.age;

    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
