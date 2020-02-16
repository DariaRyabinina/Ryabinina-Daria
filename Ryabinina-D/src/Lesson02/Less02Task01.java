package Lesson02;
/*
Реализовать программу «Вендинговый автомат», которая позволит:
 Посмотреть меню напитков
 Внести деньги на внутренний счет
 Выбрать номер напитка и получить его, если на счету достаточно средств.
Программа должна обрабатывать следующие ситуации:
 Пользователь не внес деньги
 Пользователь выбрал более дорогой напиток, чем внесено денег
 Пользователь выбрал несуществующий номер напитка
У напитка должна быть цена и название.
 */

import java.util.ArrayList;
import java.util.Scanner;

public class Less02Task01 {
    public static void main(String[] args) {
        double expense = 0.0;
        int n;
        Scanner scanner = new Scanner(System.in);
        //задаем меню
        Drinks drink1 = new Drinks(1, "Эспрессо", 150);
        Drinks drink2 = new Drinks(2, "Капуччино", 200);
        Drinks drink3 = new Drinks(3, "Гляссе", 160);
        Drinks drink4 = new Drinks(4, "Горячий шоколад", 170.5);
        Drinks drink5 = new Drinks(5, "Чай", 100);
        Drinks[] drinks = new Drinks[]{drink1, drink2, drink3, drink4, drink5};
        System.out.println("Меню напитков:");
        for (int i = 0; i < 5; i++) {
            System.out.print((int) drinks[i].getN() + "  " + drinks[i].getDrink() + " - " + drinks[i].getPrice() + "р.\n");
        }
        int x; //флаг
        do {
            if (expense <= 0) {
                System.out.println("Внесите деньги на внутренний счет");
                expense = scanner.nextDouble();
                x = 0;
            } else x = 1;
        }
        while (x == 0);

        System.out.println("Укажите номер напитка");
        n = scanner.nextInt();

        do {
            if (n < 1 || n > 5) {
                System.out.println("Введите корректный номер напитка");
                n = scanner.nextInt();
                x = 0;
            } else x = 1;
        }
        while (x == 0);


        /*void Sel (Drinks[] drinks1, double expense1, int n1){*/

        if (drinks[n - 1].getPrice() > expense) {
            System.out.println("Цена превышает сумму внсенного депозита");
        } else {
            System.out.println("Напиток готов");
            expense -= drinks[n - 1].getPrice();
            System.out.println("Остаток на счете: " + expense);
        }
    }
        }


                 class Drinks { //какой тип доступа лучше? почему статик подтавился

                    private String drink = new String();
                    private double price;
                    int n;

    /* public drinks() {

         public void setDrink (String drink){
             this.drink = drink;
         }

         public String getDrink () {
             return this.drink;
         }

         public void setPrice ( double price){
             this.price = price;
         }

         public double getPrice () {
             return this.price;
         }

     }*/

                    public Drinks(int n, String drink, double price) {
                        this.drink = drink;
                        this.price = price;
                        this.n = n;

                    }
                        public double getN () {
                            return this.n;
                        }

                        public double getPrice () {
                            return this.price;
                        }

                        public String getDrink () {
                            return this.drink;
                        }
                    }
