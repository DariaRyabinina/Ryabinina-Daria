package Lesson05;

public class Reptiles extends Animal implements Run,Swim {
    @Override
    void getName() {
        System.out.println("Рептилии");
    }

    @Override
    public void limbs() {
        System.out.println("У рептилий может не быть конечностей, но они могут плавать.");
    }

    @Override
    public void maxwater() {    }

    @Override
    public void Legs() {
        System.out.println("У рептилий может быть 4 лапы");
    }

    @Override
    public void maxSpead() {    }


}
