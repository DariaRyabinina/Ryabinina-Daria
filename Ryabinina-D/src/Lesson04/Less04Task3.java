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
        double numberOne;
        double numberTwo;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число или константу p или e");
        String f = scanner.nextLine();
        if (f.equals("p") || f.equals("P")) {
            numberOne = Calculator.p;
        } else {
            if (f.equals("e") || f.equals("E")) {
                numberOne = Calculator.e;
            } else {
                numberOne = Double.parseDouble(f);
            }
        }
        System.out.print("Введите второе число или константу p или e\n");
        f = scanner.nextLine();
        if (f.equals("p") || f.equals("P")) {
            numberTwo = Calculator.p;
        } else {
            if (f.equals("e") || f.equals("E")) {
                numberTwo = Calculator.e;
            } else {
                numberTwo = Double.parseDouble(f);
            }
        }
        String c = new String();
        while (!(c.equals("+") || c.equals("-") || c.equals("*") || c.equals("/") || c.equals("%"))) {
            System.out.print("Введите действие +, -, *, / ,%");
            c = scanner.nextLine();
        }
        switch (c) {
            case "+": {
                // System.out.println(action.Summ.);
                Calculator.summ(numberOne, numberTwo);
                break;
            }
            case ("-"): {
                //    System.out.println(action.Sub);
                Calculator.sub(numberOne, numberTwo);
                break;
            }
            case ("*"): {
                //     System.out.println(action.Mult);
                Calculator.mult(numberOne, numberTwo);
                break;
            }
            case ("/"): {
                //  System.out.println(action.Div);
                Calculator.div(numberOne, numberTwo);
                break;
            }
            case ("%"): {
                // System.out.println(action.Perc);
                 Calculator.perc(numberOne, numberTwo);
                break;
            }
            default:
                System.out.println("default");
        }

    }
}


