package Lesson01;

import java.util.Scanner;

public class Less01Task5 {
    public static void main(String[] args){
        int year;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Введите год.");
        year=scanner.nextInt();
        if (year%4==0)
            if(year%100==0)
                if(year%400==0)
                    System.out.println("Год "+year+" високосный");
                else
                    System.out.println("Год "+year+" обычный");
            else
                System.out.println("Год "+year+" високосный");
        else
            System.out.println("Год "+year+" обычный.");
    }
}
