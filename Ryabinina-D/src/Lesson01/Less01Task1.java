package Lesson01;
/*
Ннаписаитьпрограму для поиска минимального из двух чисел
 */

import java.util.Scanner;
public class Less01Task1 {
    public static void main(String[] args){
    System.out.println("Проверка");
    Scanner scanner = new Scanner(System.in);
    int a;
    int b;
	System.out.println("Введите первое число");
    a=scanner.nextInt();
	System.out.println("Введите второе число");
    b=scanner.nextInt();
if(b==a)
            System.out.println("Числа равны");
else
        if(a>b)
            System.out.println("Минимальное число: b="+b);
	else
            System.out.println("Минимальное число: a="+a);
}
}
