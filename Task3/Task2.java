package Task3;
// Необходимо реализовать приложение на вход которого поступает текст,
// а на выходе выводится частотный словарь букв латинского(английского) алфавита.

import java.util.*;

public class Task2 {

    public static void main(String[] args) {
        String text = "Example text to char";

        text = text.toLowerCase();

        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            if ((ch >= 'a' && ch <= 'z') || ch == 'ё') {
                map.compute(ch, (character, integer)
                        -> integer == null ? 1 : integer + 1);
            }
        }

        List<Map.Entry<Character, Integer>> entries =
                new ArrayList<>(map.entrySet());

        entries.sort(Map.Entry.comparingByKey());
        for (Map.Entry<Character, Integer> entry : entries) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
