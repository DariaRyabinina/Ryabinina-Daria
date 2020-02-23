package Lesson04;


import java.sql.SQLOutput;
import java.util.Scanner;

/*
 Реализовать класс Calculator, который будет содержать статические методы
для операций вычитания, сложения, умножения, деления и взятия процента от
числа. Класс должен работать как с целыми числами, так и с дробями.
*/
public class Less04Task3 {
    public static void main(String[] args) {
        double a, b;
        String f;
        String c = new String();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число или константу p или e");
        f = scanner.nextLine();
        if (f.equals("p") || f.equals("P")) {
            a = Double.valueOf(Calculator.p);
        } else {
            if (f.equals("e") || f.equals("E")) {
                a = Double.valueOf(Calculator.e);
            } else {
                a = Double.valueOf(f);
            }
        }
        System.out.print("Введите второе число или константу p или e\n");
        f = scanner.nextLine();
        if (f.equals("p") || f.equals("P")) {
            b = Double.valueOf(Calculator.p);
        } else {
            if (f.equals("e") || f.equals("E")) {
                b = Double.valueOf(Calculator.e);
            } else {
                b = Double.valueOf(f);
            }
        }
        while (!(c.equals("+") || c.equals("-") || c.equals("*") || c.equals("/") || c.equals("%"))) {
            System.out.print("Введите действие +, -, *, / ,%");
            c = scanner.nextLine();
        }
        if (c.equals("/") && b == 0) {
            System.out.println("Деление на 0 запрещено");
        } else {
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
                default:
                    System.out.println("default");
            }

        }
    }

}
