package Lesson01;

import java.util.Scanner;

public class Less01Task4 {
    public static void main(String[] args){
        int N;
        int a, aa=0, b, bb=0, c;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Введите число N - количество членов прогрессии");
        N=scanner.nextInt();
        System.out.println("Введите начальное число не равное 0 ");
        c=scanner.nextInt();
        while(c==0)
        {
            System.out.println("Введенное число равно 0. Введите начальное число не равное 0 ");
            c=scanner.nextInt();
        }

        aa=c;
        bb=c;
        System.out.println("Введите шаг арифметической прогрессии");
        a=scanner.nextInt();

        System.out.println("Арифметическая прогрессия:\n");
        for (int i=0;i<N;i++){
            System.out.print(aa+" ");
            aa+=a;
        }

        System.out.println("\nВведите знаменатель геометрической прогрессии");
        b=scanner.nextInt();

        System.out.println("\nГеометрическая прогрессия:\n");
        for (int i=0;i<N;i++){
            System.out.print(bb+" ");
            bb*=b;
        }
    }
}
