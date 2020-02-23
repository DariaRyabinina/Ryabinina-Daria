package Lesson04;
/*
 Реализовать класс Calculator, который будет содержать статические методы
для операций вычитания, сложения, умножения, деления и взятия процента от
числа. Класс должен работать как с целыми числами, так и с дробями.
*/

import jdk.nashorn.internal.ir.IfNode;

public class Calculator {
    static final double e=2.718;
    static final double p=3.141;
    double aa;
    double bb;
    static double summ(double a, double b) { return (a + b); }
    static double sub(double a, double b){
        return (a-b);
    }
    static double mult(double a, double b){
        return (a*b);
    }
    static double div(double a, double b){ return (a/b); }
    static double perc(double a, double b){
        System.out.println(a+" * "+b);
            return (a * 100/b);
    }
}
