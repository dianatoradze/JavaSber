package Task3.Task5;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) throws  RuntimeException {
        System.out.println("Введите  команду по шаблону: " +
                "ADD- добавить игрока. LIST - вывод списка." +
                "EXIT - выход из программы ");

        Scanner game = new Scanner(System.in);

        String choice;
        int count = 0; // добавить count и сделать подсчет очков
        String name;
        int points = 0;

        Map<String, Integer> gameList = new HashMap<>();
       // Map<Gamer, Integer> Score = new HashMap<Gamer, Integer>();

        Scanner scanner = new Scanner(System.in);

        while (game.hasNext()) {

            choice = game.nextLine();

            switch (choice) {
                case "ADD": System.out.print("После завершения ввода, если нужно еще добавить игрока" +
                        "повторите вызов команды или введите следующую команду " + "\n");
                    System.out.println("Enter name");
                    name = scanner.next();
                        System.out.println("Enter points");
                        points = scanner.nextInt(); count += points; // сумма баллов игроков

                        if (!name.isEmpty()) {
                            gameList.put(name, points);
                            if (name.equals("stop")) {
                                break;
                            }
                            // count++; // кол-во введнных игроков c повторами баллов
                        }
                    break;

                case "LIST":
                    for (Map.Entry<String, Integer> entry : gameList.entrySet()) {

                        System.out.println("Ваш список игроков: " + entry.getKey() + " - " + "номер игрока, " + entry.getValue() + " - " + " очки игрока ");
                        //System.out.println(count);
                    }
                    break;
                case "EXIT":
                   game.close();

                    break;
                default:
                    throw new IllegalStateException("Unexpected value: " + choice);
            }

        }
    }

}
