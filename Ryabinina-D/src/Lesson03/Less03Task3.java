package Lesson03;
/*
Реализовать расчет и вывод в консоль последовательности чисел
Фибоначчи до указанного пользователем N, посредством рекурсии
*/

import java.util.Scanner;

public class Less03Task3 {
    public static int fib(int quantity) {
        if (quantity == 0) {
            return 0;
        } else if (quantity == 1) {
            return 1;
        } else {
            return fib(quantity - 1) + fib(quantity - 2);

        }
    }

    public static void main(String[] args) {
        int quantity;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество членов ряда");
        quantity = scanner.nextInt();
        for (int i = 0; i < quantity; i++) {
            System.out.print(fib(i) + "  ");
        }

    }

}

