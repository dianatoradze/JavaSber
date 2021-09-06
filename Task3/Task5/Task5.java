package Task3.Task5;

import java.util.*;

public class Task5 {

    public static void main(String[] args) {
        System.out.println("Введите  команду по шаблону: " +
                "ADD- добавить игрока. LIST - вывод списка." +
                "EXIT - выход из программы ");

        Scanner game = new Scanner(System.in);
        String gamerName;
        String choice;
        int count = 0; //  сделать подсчет очков игроков
        Integer max = 0;
        int points = 0;

        HashMap<Integer, List<String>> map = new HashMap();

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
                        map.get(points).add(gamerName);
                        count += points;
                    } else {
                        List<String> list = new ArrayList();
                        list.add(String.valueOf(gamerName));
                        map.put(points, list);
                    }

                    max = Collections.max(map.keySet());
                    break;

                case "LIST":
                    System.out.println(max);
                    System.out.println(map.get(max));

                    System.out.println(count);
                    break;
                case "EXIT":
                    game.close();
                    break;

            }
        }
    }

}
