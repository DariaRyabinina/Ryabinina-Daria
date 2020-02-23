package Lesson04;
/**
 * Напишите программу которая получает на вход некую строку, после она
 * вызывает метод, заменяющий в строке все вхождения слова «бяка» на
 * «вырезано цензурой» и выводит результат в консоль!
 */

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Less04Task1 {
    static void replase(String str, String str1) {
        int s = 0;
        Pattern pattern = Pattern.compile("\\bбяка\\b");
        Matcher matcher = pattern.matcher(str);
        while (matcher.find()) {
            s += 1;
        }
        str1 = matcher.replaceAll("вырезано цензурой");
        System.out.println("Количество вхождений слова Бяка - " + s);
        System.out.println("Способ 1: \n"+str1);
    }

    public static void main(String[] args) {
        String str = new String();
        String str1 = new String();
        String str2 = new String();
        int s = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите сторку");
        str = str2 = scanner.nextLine();
        replase(str, str1);

        System.out.println("Способ 2: \n"+str2.replace("бяка", "вырезано цензурой"));

    }
}