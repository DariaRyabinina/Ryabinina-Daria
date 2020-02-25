package Lesson05;

public class Amphibia extends Animal implements Run, Swim {
    @Override
    void getName() {
        System.out.println("Земноводные");
    }

    @Override
    public void limbs() {
        System.out.println("У земноводных конечности и они могут плавать.");
    }

    @Override
    public void maxwater() {
    }

    @Override
    public void Legs() {
        System.out.println("Земноводные имеют лапы и они могут бегать.");
    }

    @Override
    public void maxSpead() {
    }
}
