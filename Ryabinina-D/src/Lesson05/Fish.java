package Lesson05;

public class Fish extends Animal implements Swim {
    @Override
    void getName() {
        System.out.println("Рыбы");
    }

    @Override
    public void limbs() {
        System.out.println("Рыбы имеют плавники и они могут плавать.");
    }

    @Override
    public void maxwater() {
    }
}
