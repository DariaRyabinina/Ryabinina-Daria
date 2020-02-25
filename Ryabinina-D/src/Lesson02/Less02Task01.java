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

Задание 5:
Переписать проект с урока (вендинговый автомат) используя конструктор,
перечисления и взаимодействие с пользователем

 */

import java.awt.*;
import java.util.List;
import java.util.ArrayList;

import java.util.Scanner;


public class Less02Task01 {

    public static double addCash(double expense) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Внесите деньги на внутренний счет");
        expense += scanner.nextDouble();
        System.out.println("Ваш депозит " + expense);
        return expense;
    }

    public static int choiceDrink() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Укажите номер напитка");
        int drink = scanner.nextInt();
        int x; //флаг
        do {
            if (drink < 1 || drink > 5) {
                System.out.println("Введите корректный номер напитка");
                drink = scanner.nextInt();
                x = 0;
            } else x = 1;
        }
        while (x == 0);
        return drink;
    }

    public static double Sel(double expense, int drink) {
        while (Drinks1.getPriceNumber(drink) > expense) {
            System.out.println("Цена превышает сумму внсенного депозита");
            drink = choiceDrink();
        }
        System.out.println("Напиток готов");
        expense -= Drinks1.getPriceNumber(drink);
        System.out.println("Остаток на счете: " + expense);

        return expense;
    }

    public static void main(String[] args) {
        double expense = 0.0;
        int drink;
        String m;
        Scanner scanner = new Scanner(System.in);
               /* List<Drinks> arrayDrinks = new ArrayList<>();
        arrayDrinks.add(new Drinks(1, "Эспрессо", 150));
        arrayDrinks.add(new Drinks(2, "Капуччино", 200));
        arrayDrinks.add(new Drinks(3, "Гляссе", 160));
        arrayDrinks.add(new Drinks(4, "Горячий шоколад", 170.5));
        arrayDrinks.add(new Drinks(5, "Чай", 100));
        System.out.println("Меню напитков:");
       for (int i = 0; i < arrayDrinks.size(); i++) {
           arrayDrinks.get(i).showDrink();
        }*/
        for (Drinks1 drinks1 : Drinks1.values()) {
            System.out.println(drinks1.getNumber() + " " + drinks1 + " " + drinks1.getPrice());
        }
        for (Drinks1 drinks11 : Drinks1.values()) {
            while (expense < drinks11.getPrice()) {
                expense = addCash(expense);
            }
            break;
        }
        drink = choiceDrink();
        // Drinks1 drinks11;
        //double price = Drinks1.getPriceNumber(n);
        expense = Sel(expense, drink);
        //System.out.println("-----1----");

        for (Drinks1 drinks1 : Drinks1.values()) {
            while (expense >= drinks1.getPrice()) {
                System.out.println("Введите Y для перхода к выбору напитка");
                m = scanner.nextLine();
                if (m.equals("Y") || m.equals("y")) {
                    drink = choiceDrink();
                    expense = Sel(expense, drink);

                } else break;
            }
            System.out.println("Введите Y для перхода к введению депозита");
            m = scanner.nextLine();
            if (m.equals("Y") || m.equals("y")) {
                for (Drinks1 drinks22 : Drinks1.values()) {
                    while (expense < drinks22.getPrice()) {
                        expense = addCash(expense);
                    }
                    break;
                }
                drink = choiceDrink();
                expense = Sel(expense, drink);
            } else {
                if (expense > 0) {
                    System.out.println("Ваша сдача " + expense);
                    break;
                } else break;
            }

       /* Drinks drink1 = new Drinks(1, "Эспрессо", 150);
        Drinks drink2 = new Drinks(2, "Капуччино", 200);
        Drinks drink3 = new Drinks(3, "Гляссе", 160);
        Drinks drink4 = new Drinks(4, "Горячий шоколад", 170.5);
        Drinks drink5 = new Drinks(5, "Чай", 100);
        Drinks[] drinks = new Drinks[]{drink1, drink2, drink3, drink4, drink5};
            System.out.println("Меню напитков:");
            for (int i = 0; i < arrayDrinks.size(); i++) {
                arrayDrinks.get(i).showDrink();
            }

      /*  for (int i = 0; i < 5; i++) {
            System.out.print((int) drinks[i].getN() + "  " + drinks[i].getDrink() + " - " + drinks[i].getPrice() + "р.\n");
        }*/

        }

    }
}
