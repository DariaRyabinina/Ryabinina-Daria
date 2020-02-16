package Lesson03;
/*
Запросить у пользователя целое число N, создать двумерный массив
размером N на N. Заполнить его случайными числами и вывести на экран
сумму диагоналей массива.
 */

import java.util.Random;
import java.util.Scanner;

public class Less03Task2 {
    public static void main(String[] args) {
        int N;
        int sum = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размерность массива");
        N = scanner.nextInt();
        Random random = new Random();
        int[][] mass = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                mass[i][j] = random.nextInt(10);
                System.out.print(mass[i][j]+"  ");
            }
            System.out.println();
        }
        for (int i = 0; i < N; i++) {
            sum += mass[i][i];
        }
        for (int i=(N-1);i>=0; i--) {
             {
                sum += mass[i][N-i-1];
            }
        }
        System.out.println("Сумма диагоналей равна "+sum);
    }
}
