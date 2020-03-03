package Lesson06;
/*public Set<String> removeEvenLength(Set<String> set);
Написать метод, который возвращает множество, в котором удалены все
элементы четной длины из исходного множества.
Например, для множества ["foo", "buzz", "bar", "fork", "bort", "spoon", "!", "dude"]
метод вернет ["foo", "bar", "spoon", "!"]
 */

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Less06Task4 {
    public static Set<String> removeEvenLength(Set<String> set) {
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().length() % 2 == 0) {

                iterator.remove();
            }
        }
        return set;
    }

    public static void main(String[] args) {
        Set<String> set = new HashSet<String>();
        set.add("foo");
        set.add("buzz");
        set.add("bar");
        set.add("fork");
        set.add("bort");
        set.add("spoon");
        set.add("!");
        set.add("dude");
        System.out.println(set);
        System.out.println(removeEvenLength(set));
    }

}

