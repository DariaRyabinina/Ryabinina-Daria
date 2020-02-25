package Lesson04;
/*
 Реализовать класс Calculator, который будет содержать статические методы
для операций вычитания, сложения, умножения, деления и взятия процента от
числа. Класс должен работать как с целыми числами, так и с дробями.
*/

public class Calculator {
    static final double e = 2.718;
    static final double p = 3.141;

    static void summ(double numberOne, double numberTwo) {
        System.out.println("Сумма введенных чисел равна " + (numberOne + numberTwo));
    }

    static void sub(double numberOne, double numberTwo) {
        System.out.println("Разность введенных чисел равна " + (numberOne - numberTwo));
    }

    static void mult(double numberOne, double numberTwo) {
        System.out.println("Произведение введенных чисел равно " + (numberOne * numberTwo));
    }

    static void div(double numberOne, double numberTwo) {
        if (numberTwo == 0) {
            System.out.println("Деление на 0 запрещено");
        } else {
            System.out.println("Частное введенных чисел равно " + (numberOne / numberTwo));

        }
    }
        static void perc(double numberOne, double numberTwo){
            System.out.println(numberOne + " * " + numberTwo);
            System.out.println("Процент второго чисела от первого равен " + (numberOne * 100 / numberTwo));

        }
    }

