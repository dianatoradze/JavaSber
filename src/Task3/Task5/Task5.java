package Task3.Task5;

import java.util.*;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class Task5 {

    public static void main(String[] args) {
        System.out.println("Введите  команду по шаблону: " +
                "ADD- добавить игрока. LIST - вывод списка." +
                "EXIT - выход из программы ");

        Scanner game = new Scanner(System.in);
        String gamerName;
        String choice;

        Integer max = 0;
        int points = 0;
        int count = 0;
        HashMap<Integer, List<Gamer>> map = new HashMap();
        //  сделать подсчет очков игроков

        Scanner scanner = new Scanner(System.in);

        while (game.hasNext()) {

            choice = game.nextLine();

            switch (choice) {
                case "ADD":
                    System.out.print("После завершения ввода, если нужно еще добавить игрока" +
                            "повторите вызов команды или введите следующую команду " + "\n");

                    System.out.println("Enter name");
                    gamerName = scanner.next();

                    System.out.println("Enter points");
                    points = scanner.nextInt();

                    if (map.containsKey(points)) {
                        map.get(points).add(new Gamer(gamerName));
                    } else {
                        List<Gamer> list = new ArrayList();
                        list.add(new Gamer(gamerName));
                        map.put(points, list);

                    }
                    //someName(map);
                    count += points;
                    max = Collections.max(map.keySet());
                    break;

                case "LIST":
                    System.out.println(max);
                    System.out.println(map.get(max));
                    for (Entry<Integer, List<Gamer>> entry : map.entrySet()) {
                        Integer key = entry.getKey();
                        List<Gamer> value = entry.getValue();
                        System.out.println(key + " - ");
                    }
                    System.out.println(count);


                    break;
                case "EXIT":
                    game.close();
                    break;

            }
        }
    }
//
//    private static void someName(HashMap<Integer, List<Gamer>> map) {
//
//        map.entrySet().stream()
//                .sorted(Entry.comparingByValue().reversed()
//                        .thenComparing(Entry.comparingByKey()))
//                .collect(Collectors.toMap(Entry::getKey, Entry::getValue,
//                        (e1, e2) -> e1, LinkedHashMap::new));
//    }

    // другой способ проверки игроков


}


