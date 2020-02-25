package Lesson05;
/*
2. Написать абстрактный класс Animal с абстрактным методом getName. Сделать
несколько классов животных, наследников Animal. Метод getName должен выводить
название каждого животного.

3. Написать интерфейсы Fly, Run и Swim чтобы в каждом было по одному методу.
Добавить классам животных из предыдущего задания имплементацию этих
интерфейсов. Некоторые животные могут реализовать больше одного интерфейса
(утка может и плавать, и летать и бегать).
4. Написать абстрактный класс Человек реализующий интерфейсы «бежать» и
«плавать» (в каждом сделать 1-2 метода). Сделать несколько наследников этого
класса с конкретной реализацией методов, которые объявлены в интерфейсах.
 */

public class Less05Task234 {
    public static void main(String[] args) {
        Mammals dog = new Mammals();
        Fish tuna = new Fish();
        Birds raven = new Birds();
        dog.getName();
        dog.limbs();
        dog.Legs();
        tuna.getName();
        tuna.limbs();
        raven.getName();
        raven.wings();
        Man samanta = new Man();
        System.out.println("Саманта:");
        samanta.getName();
        samanta.Legs();
        samanta.limbs();
        samanta.maxSpead();
        samanta.maxwater();
        samanta.death();
        Woman alisia = new Woman();
        System.out.println("Алисия:");
        alisia.maxSpead();
        alisia.maxwater();
        alisia.death();

    }

}
