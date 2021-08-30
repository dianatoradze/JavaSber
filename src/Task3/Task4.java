package Task3;

import java.util.*;
import java.util.stream.Collectors;

//  Напишите метод, который получает на вход Map<K, V> и возвращает Map,
//  где ключи и значения поменяны местами. Так как значения исходной Map могут совпадать,
//  то тип ключа в Map будет уже не K, а Collection<K>: Map<V, Collection<K>>
public class Task4 {

    public static <K,V> HashMap<V,K> reverse(Map<K,V> map) {

        Map<V,Collection <K>> rev = Collections.unmodifiableMap(new Map<V, Collection<K>>() {
            @Override
            public int size() {
                return 0;
            }

            @Override
            public boolean isEmpty() {
                return false;
            }

            @Override
            public boolean containsKey(Object key) {
                return false;
            }

            @Override
            public boolean containsValue(Object value) {
                return false;
            }

            @Override
            public Collection<K> get(Object key) {
                return null;
            }

            @Override
            public Collection<K> put(V key, Collection<K> value) {
                return null;
            }

            @Override
            public Collection<K> remove(Object key) {
                return null;
            }

            @Override
            public void putAll(Map<? extends V, ? extends Collection<K>> m) {

            }

            @Override
            public void clear() {

            }

            @Override
            public Set<V> keySet() {
                return null;
            }

            @Override
            public Collection<Collection<K>> values() {
                return null;
            }

            @Override
            public Set<Entry<V, Collection<K>>> entrySet() {
                return null;
            }

            @Override
            public boolean equals(Object o) {
                return false;
            }

            @Override
            public int hashCode() {
                return 0;
            }
        });
        for(Map.Entry<K,V> entry : map.entrySet())
            rev.put(entry.getValue(), (Collection<K>) entry.getKey());
        return (HashMap<V, K>) rev;
    }
    public static void main(String[] args) {
       //второй способ
        Map<String, Integer> map = new HashMap<>();

        Map<Integer, String> swapped = map.entrySet().stream().collect(Collectors.toMap(Map.Entry::getValue, Map.Entry::getKey));

    }

}
