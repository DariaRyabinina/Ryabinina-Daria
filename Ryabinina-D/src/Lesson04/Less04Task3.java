package Lesson04;

import javax.swing.*;
import java.util.Scanner;

/*
 Реализовать класс Calculator, который будет содержать статические методы
для операций вычитания, сложения, умножения, деления и взятия процента от
числа. Класс должен работать как с целыми числами, так и с дробями.
*/
public class Less04Task3 {
    public static void main(String[] args) {
        double a;
        double b;
        String c = new String();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число");
        a = scanner.nextDouble();
        System.out.println("Введите второе число");
        b = scanner.nextDouble();
        while (!(c.equals("+")||c.equals("-")||c.equals("*")||c.equals("/")||c.equals("%"))) {
            System.out.println("Введите действие +, -, *, / ,%");
            c = scanner.nextLine();
        }
        switch (c) {
            case "+": {
               // System.out.println(action.Summ.);
                System.out.println("Сумма введенных чисел равна " + Calculator.summ(a, b));
                break;
            }
            case ("-"): {
            //    System.out.println(action.Sub);
                System.out.println("Разность введенных чисел равна " + Calculator.sub(a, b));
                break;
            }
            case ("*"): {
           //     System.out.println(action.Mult);
                System.out.println("Произведение введенных чисел равно " + Calculator.mult(a, b));
                break;
            }
            case ("/"): {
              //  System.out.println(action.Div);
                System.out.println("Частное введенных чисел равно " + Calculator.div(a, b));
                break;
            }
            case ("%"): {
               // System.out.println(action.Perc);
                System.out.println("Процент второго чисела от первого равен " + Calculator.perc(a, b));
                break;
            }
            default:System.out.println("default");
        }

/*
        System.out.println("Сумма введенных чисел равна " + Calculator.summ(a, b));
        System.out.println("Разность введенных чисел равна " + Calculator.sub(a, b));
        System.out.println("Произведение введенных чисел равно " + Calculator.mult(a, b));
        System.out.println("Частное введенных чисел равно " + Calculator.div(a, b));
        System.out.println("Процент второго чисела от первого равен " + Calculator.perc(a, b));

*/

    }

}
