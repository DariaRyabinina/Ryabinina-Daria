package Lesson05;

public class Birds extends Animal implements FLY {
    @Override
    void getName() {
        System.out.println("Птицы");
    }

    @Override
    public void wings() {
        System.out.println("Птицы имеют 2 крыла и они могут летать.");
    }
}
