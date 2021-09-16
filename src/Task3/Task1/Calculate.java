package Task3.Task1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Calculate {
    static double fuelConsumption = 0;
    static double fuelCost = 0;
    static String carName = "";
    static double gsmCoast = 0;
    // Не правильно высчитывается стоимость расходов гсм
    private static void calculate(List<String> carCoast, String code) {
        ArrayList<String> gsmList = new ArrayList<>();
        if (carCoast.contains(code)) {
            for (int i = 0; i < carCoast.size(); i = i + 3) {
                double v = ((double) i) / 100;
                gsmCoast = v * (fuelConsumption * fuelCost);
                gsmList.add(String.valueOf(gsmCoast));
            }
        }
        Collections.sort(gsmList);
        Collections.max(gsmList);
        Collections.min(gsmList);
        System.out.println("Стоимость расходов гсм " + gsmList);
    }
    // сделать в HashSet
}
