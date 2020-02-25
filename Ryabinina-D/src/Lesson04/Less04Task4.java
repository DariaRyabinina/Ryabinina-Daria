package Lesson04;
/*
 Реализовать класс в конструкторе которого будет счетчик количества
создаваемых объектов. Написать метод для получения информации о
количестве.
 */

public class Less04Task4 {
    public static void main(String[] args) {
        Class1 class1 = new Class1();
        Class1 class2 = new Class1();
        Class1 class3 = new Class1();
        Class1 class4 = new Class1();
        Class1 class5 = new Class1();

        Class1.quan();

    }

}
