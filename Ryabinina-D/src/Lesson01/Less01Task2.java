package Lesson01;
/*
* Написать программу, которая описывает введенное число. Отрицательное
оно число или положительное (или нулевое), чётное или нечётное.
*/

import java.util.Scanner;

public class Less01Task2 {
    public static void main(String[] args){
        int a;
        Scanner scanner= new Scanner(System.in);
        System.out.println("Ведите целое число");
        a=scanner.nextInt();
        if (a==0)
            System.out.println("Число равно 0");
        else
        if (a>0)
            if (a%2==0)
                System.out.println("Это положительное четное число.");
            else
                System.out.println("Это положительное нечетное число.");
        else
        if (a%2==0)
            System.out.println("Это отрицательное четное число.");
        else
            System.out.println("Это отрицательное нечетное число.");
    }
}
