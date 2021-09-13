package Task3.Task5;


import java.util.ArrayList;
import java.util.HashMap;


public class Gamer {
    //  сделать класс игрока и хранить статитстику
    static String name;
    static int points;

    static HashMap<String, Integer> statistics;

    public Gamer(String name) {

        Gamer.name = name;
        Gamer.points = 0;
    }

    public String getName() {
        return name;
    }

    public int getPoints() {
        return points++;
    }

    public HashMap<String, Integer> add() {

        new checkName.Node(name);
        statistics.put(name, points);

        return statistics;
    }

    @Override
    public String toString() {
        return "name - " + getName() + " points: " + " " + getPoints();
    }
}

