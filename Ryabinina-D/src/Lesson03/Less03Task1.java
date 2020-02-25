package Lesson03;
/*
Реализовать алгоритм сортировки массива пузырьком и попытаться его
оптимизировать. Оптимизацию будем "считать" количеством итераций
цикла
*/

import java.util.Random;

public class Less03Task1 {
    public static void main(String[] args) {
        int a, c1 = 0, c = 0, n = 10;

        int[] m = new int[n];
        int[] m1 = new int[n];
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            m[i] = m1[i] = random.nextInt(10);
            System.out.print(" " + m[i]);
        }
//Метод пузырька
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (m[j] < m[i]) {
                    a = m[i];
                    m[i] = m[j];
                    m[j] = a;
                    c += 1;
                }
            }
        }
        System.out.println();
        for (int i = 0; i < n; i++) {
            System.out.print(" " + m[i]);
        }
        System.out.println("\n метод пузырька, количество итераций - " + c + "\n");

        for (int i = 0; i < n; i++) {
            System.out.print(" " + m1[i]);
        }
        int k = 0;
        boolean kk = true;
        // метод пузырька new
        for (int i = 0; i < n; i++) {
            //     if (kk) {
            //       kk = false;
            for (int j = n - 1; j > i; j--) {
                if (m1[j] > m1[i]) {
                    a = m1[i];
                    m1[i] = m1[j];
                    m1[j] = a;
                    c1 += 1;
                    //   kk = true;
                }
            }
        }
        System.out.println();
        for (int i = 0; i < n; i++) {
            System.out.print(" " + m1[i]);
        }
        System.out.println("\n метод пузырька new, количество итераций -" + c1);

     /* Вариант для определенного типа последовательностей отрабатывает некорректно:
       int m2[] =  {7,  2,  1,  3,  4,  2,  0,  1,  1,  8};
         for (int i = 0; i < n; i++) {
             if (kk) {
             kk = false;
            for (int j = n-1;  j >i; j--) {
                if (m2[j] > m2[i]) {
                    a = m2[i];
                    m21[i] = m2[j];
                    m2[j] = a;
                    c1 += 1;
                    kk = true;
                }
            }
        }
        */
    }
}

