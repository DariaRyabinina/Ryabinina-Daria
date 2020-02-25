package Lesson05;

public abstract class Human extends Mammals implements Run, Swim {

    abstract void death();

    @Override
    void getName() {
        System.out.println("Это млекопитающие человек.");
    }
}


