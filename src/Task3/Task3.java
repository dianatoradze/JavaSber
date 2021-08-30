package Task3;

import java.util.*;

// Напишите метод, который на вход получает коллекцию объектов,
// а возвращает коллекцию уже без дубликатов.
//<T> Collection<T> removeDuplicates(Collection<T> collection)
public class Task3 {
    public static void main(String[] args) {

        // removeDuplicates(Collection<T> collection);


    }
    public static <T> Collection<T> removeDuplicates(LinkedList<T> list) {
        final Set<T> encountered = new HashSet<T>();
        for (Iterator<T> iter = list.iterator(); iter.hasNext(); ) {
            final T t = iter.next();
            final boolean first = encountered.add(t);
            if (!first) {
                iter.remove();
            }
        }

        return encountered;
    }
    //второй способ
//    <T> Collection<T> removeDuplicates(Collection<T> collection) {
//        Collection<T> tCollection = new Collection<T>();
//
//
//        Collection<T> ts = new <T>(new LinkedHashSet<T>(tCollection));
//
//    }
}
