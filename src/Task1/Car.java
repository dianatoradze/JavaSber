package Task1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
// насколько поняла, что надо было решить задачу, исходя из пройденных тем на момент выдачи дз
// поэтому сделано без классов, понятно, что это нерационально делать все через статистические методы
public class Car {

    private static String[] array;
    static double fuelConsumption = 0;
    static double fuelCost = 0;
    static String carName = "";
    static double gsmCoast = 0;

    static final String code1 = "C100";
    static final String code2 = "C200";
    static final String code3 = "C300";
    static final String code4 = "C400";

    public static void main(String[] args) {

        array = new String[]{"C100_1-100", "C200_1-120-1200",
                "C300_1-120-30",
                "C400_1-80-20", "C100_2-50", "C200_2-40-1000",
                "C300_2-200-45", "C400_2-10-20", "C100_3-10",
                "C200_3-170-1100", "C300_3-150-29", "C400_3-100-28",
                "C100_1-300", "C200_1-100-750", "C300_1-32-15"};

        ArrayList<String> carType1 = getStrings(code1);
        ArrayList<String> carType2 = getStrings(code2);
        ArrayList<String> carType3 = getStrings(code3);
        ArrayList<String> carType4 = getStrings(code4);

        info(carType1);
        typeCar(code1);
        info(carType2);
        typeCar(code2);
        info(carType3);
        typeCar(code3);
        info(carType4);
        typeCar(code4);

       calculate(carType1, code1);
    }
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

    private static void typeCar(String text) {
// выбор значений для класса
            switch (text) {
                case code1:
                    fuelCost = 46.10;
                    fuelConsumption = 12.5;
                    carName = "passenger car";
                    break;
                case code2:
                    fuelCost = 48.90;
                    fuelConsumption = 12;
                    carName = "truck";
                    break;
                case code3:
                    fuelCost = 47.50;
                    fuelConsumption = 11.5;
                    carName = "passenger transport";
                    break;
                case code4:
                    fuelCost = 48.90;
                    fuelConsumption = 20;
                    carName = "heavy machinery";
                    break;
            }

        System.out.println("Для данной категория машины: " + carName
                    + " - расход топлива: " + fuelConsumption + "," + " стоимость топлива: " + fuelCost);

    }


    private static void info(List<String> carType) {
        // вывод значений для каждого авто по классу
        for (int i = 0; i < carType.size(); i++) {
            System.out.print(" код " + carType.get(i)); i++;
            System.out.print(" номер " + carType.get(i)); i++;
            if (!carType.contains(code1)) {
                System.out.print(" пробег " + carType.get(i)); i++;
                System.out.println(" параметр " + carType.get(i));
            } else {
                System.out.println(" пробег " + carType.get(i));
            }
        }
    }

    private static ArrayList<String> getStrings(String code) {
        // разделение внутри класса на элементы
        ArrayList<String> carType = new ArrayList<>();
        ArrayList<String> lines = searchFromStart(array, code);

        for (String line : lines) {
            String[] car = line.split("[_\\W]");
            if (car.length == 3) {
                carType.addAll(Arrays.asList(car).subList(0, 3));
            }
            if (car.length == 4) {
                carType.addAll(Arrays.asList(car).subList(0, 4));
            }
        }
        return carType;
    }

    public static ArrayList<String> searchFromStart(String[] beginArray, String searchText) {
       // поиск элементов массива, начинающихся на одинаковое значение и запись в лист
        ArrayList<String> outputArray = new ArrayList<>();
        for (int i = 0; i < beginArray.length; i++) {
            if (searchText.compareToIgnoreCase(beginArray[i].substring(0,
                    searchText.length())) == 0) {
                outputArray.add(beginArray[i]);
            }
        }
        Collections.sort(outputArray);
        return outputArray;
    }
}
