package Lesson06;

/*public boolean isUnique(Map<String, String> map);
Написать метод, который возвращает true, если в мапе нет двух и более
одинаковых value, и false в противном случае. Для пустой мапы метод
возвращает true.
Например, для метода {Вася=Иванов, Петр=Петров, Виктор=Сидоров,
Сергей=Савельев, Вадим=Викторов} метод вернет true, а для {Вася=Иванов,
Петр=Петров, Виктор=Иванов, Сергей=Савельев, Вадим=Петров} метод
вернет false.

 */

import java.sql.SQLOutput;
import java.util.*;

public class Less06Task3 {
    public static boolean isUnique(Map<String, String> map) {
        for (String o : map.keySet()) {
            for (String o1 : map.keySet()) {
                if (!o.equals(o1) && map.get(o).equals(map.get(o1))) {
                        return false;
                }
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Map<String, String> staf = new HashMap<>();


        staf.put("Вася", "Иванов");
        staf.put("Коля", "Петров");
        staf.put("Саша ", "Иванов");
        for (String s : staf.keySet()) {
            System.out.println(s + " " + staf.get(s));
        }
        if (isUnique(staf)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
