package Task3;

import java.util.*;

// Напишите метод, который на вход получает коллекцию объектов,
// а возвращает коллекцию уже без дубликатов.
//<T> Collection<T> removeDuplicates(Collection<T> collection)
public class Task3 {
    public static void main(String[] args) {

        // removeDuplicates(Collection<T> collection);
        List<String> original = new LinkedList<>();
        original.add("Ivan");
        original.add("Ivan");
        original.add("Petr");
        original.add("Vladimir");
        //System.out.println(removeDuplicates(original);
        //второй способ
        List<String> list = new LinkedList<>(original);
        Collection<String> output = new LinkedHashSet(list);
        System.out.println(output);
    }

    public static <T> Collection<T> removeDuplicates(Collection<T> list) {
        final Set<T> duplicate = new HashSet<T>();
        for (Iterator<T> iterate = list.iterator(); iterate.hasNext(); ) {
            final T t = iterate.next();
            final boolean first = duplicate.add(t);
            if (!first) {
                iterate.remove();
            }
        }
        return duplicate;
    }

}
