package Lesson05;

public class Woman extends Human{

    @Override
    public void maxSpead() {
        System.out.println("Этот человек женщина, рекорд скорости на 100 метрах среди женщин 10,49 секунд.");

    }

    @Override
    public void death() {System.out.println("Средняя продолжительность жизни женщин 77,6 лет.");

    }

    @Override
    public void maxwater() {
        System.out.println("Этот человек женщина, максимальная глубина погружения без акваланга среди женщин 160м.");

    }
}
