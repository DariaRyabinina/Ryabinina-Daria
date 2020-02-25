package Lesson05;

public class Arachnida extends Animal implements Run {
    @Override
    void getName() {
        System.out.println("Паукообразные");
    }

    @Override
    public void Legs() {
        System.out.println("У паукообразных 8 лап и они могут бегать.");
    }

    @Override
    public void maxSpead() {
    }
}
