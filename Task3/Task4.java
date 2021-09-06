package Task3;

import java.util.*;
import java.util.stream.Collectors;

//  Напишите метод, который получает на вход Map<K, V> и возвращает Map,
//  где ключи и значения поменяны местами. Так как значения исходной Map могут совпадать,
//  то тип ключа в Map будет уже не K, а Collection<K>: Map<V, Collection<K>>
public class Task4 {
    public static void main(String[] args) {

        Map<Integer, String> map = new TreeMap<>();
        map.put(1, "Ivan");
        map.put(2, "Oleg");
        map.put(3, "Petr");
        //один способ
        Map<String, Integer> swapped = map.entrySet().stream().collect(Collectors.toMap(Map.Entry::getValue, Map.Entry::getKey));
        System.out.println(swapped);
        // другой способ
        System.out.println(reverse(map));
    }

    public static <K, V> Map<V, Collection<K>> reverse(Map<K, V> map) {

        HashMap<V, K> inputMap = new HashMap<V, K>();
        for (Map.Entry<K, V> entry : map.entrySet())
            inputMap.put(entry.getValue(), entry.getKey());
        return (HashMap<V, Collection<K>>) inputMap;
    }
}