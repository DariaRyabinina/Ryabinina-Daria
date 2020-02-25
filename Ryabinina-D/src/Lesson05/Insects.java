package Lesson05;

public class Insects extends Animal implements Run, Swim, FLY {
    @Override
    void getName() {
        System.out.println("Насекомые");
    }

    @Override
    public void wings() {
        System.out.println("У насекомых есть крылья и они могут летать.");
    }

    @Override
    public void limbs() {
        System.out.println("У насекомых есть конечности и они могут плавать.");
    }

    @Override
    public void maxwater() {
    }

    @Override
    public void Legs() {
        System.out.println("У насекомых 6 лап и они могут бегать.");
    }

    @Override
    public void maxSpead() {
    }
}
