package Lesson05;

public class Mammals extends Animal implements Swim, Run {
    @Override
    void getName() {
        System.out.println("Млекопитающие");
    }

    @Override
    public void limbs() {
        System.out.println("Млекомитающие имеют 4 конечности и они могут плавать.");
    }

    @Override
    public void maxwater() {
    }

    @Override
    public void Legs() {
        System.out.println("У млекопитающих могут быть лапы, ноги, руки и они могут бегать.");
    }

    @Override
    public void maxSpead() {
    }
}
