package Lesson05;

public class Man extends Human {

    @Override
    public void maxSpead() {
        System.out.println("Этот человек мужчина, рекорд скорости на 100м среди мужчин 9,58 секунд.");
    }

    @Override
    public void maxwater() {
        System.out.println("Этот человек мужчина, максимальная глубина погружения без акваланга среди мужчин 214м.");
    }

    @Override
    public void death() {
        System.out.println("Средня продолжительность жизни мужчин 66,5 лет.");

    }
}