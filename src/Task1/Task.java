package Task1;

import java.util.*;

public class Task {
    static double fuelConsumption = 0;
    static double fuelCost = 0;
    static String carName = "";

    static double gsmCoast = 0;

    static String code = "";
    static int carNumber = 0;
    static int mileage = 0;

    public static void main(String[] args) {

        ArrayList<String> carType1 = new ArrayList<>();
        List<String> carType2 = new ArrayList<>();
        List<String> carType3 = new ArrayList<>();
        List<String> carType4 = new ArrayList<>();
        List<String> car = new ArrayList<>();
        String[] array = new String[]{"C100_1-100", "C200_1-120-1200",
                "C300_1-120-30",
                "C400_1-80-20", "C100_2-50", "C200_2-40-1000",
                "C300_2-200-45", "C400_2-10-20", "C100_3-10",
                "C200_3-170-1100", "C300_3-150-29", "C400_3-100-28",
                "C100_1-300", "C200_1-100-750", "C300_1-32-15"};
        Arrays.sort(array);

        List<String> lines = Arrays.asList(array);

        for (String line : lines) {
            String[] fragments = line.split("[_\\W]");
       // не правильно привязываются  к полям , которые должны потом использовать в формуле
            // работает нормально только для car1
            for (int i = 0; i < fragments.length; i++) {
                code = fragments[i];i++; //с инкрементами тоже не лучший вариант как и в info
                carNumber = Integer.parseInt(fragments[i]);i++;
                mileage = Integer.parseInt(fragments[i]); i++;

            }
            if (fragments.length == 3) {

                carType1.addAll(Arrays.asList(fragments).subList(0, 3));

            }

            if (fragments.length == 4) {

                car.addAll(Arrays.asList(fragments).subList(0, 4));
                for (int i = 0; i < car.size()/3; i = i + 4) {
                    carType2 = car.subList(0, i + 4);
                    // не могу сделать, чтобы правильно распределялись коллекции
                    // для типов car3 и car4
                    for (int j = i+4; j < car.size(); j = j + 4) {
                        carType3 = car.subList(i+4, j);

                        for (int k = j+4; k < car.size(); k=k+4) {

                            carType4 = car.subList(j, k+4);
                        }
                    }
                }

            }


        }
        System.out.println(car);
        info(carType1);
        typeCar(carType1);
        info(carType2);
        typeCar(carType2);

        info(carType3);typeCar(carType3);

        info(carType4); typeCar(carType4);

    }

    private static void info(List<String> carType) {

        for (int i = 0; i < carType.size(); i++) {
            System.out.print(" код " + carType.get(i));

            i++;
            System.out.print(" номер " + carType.get(i));
            i++;
            if (!carType.contains("C100")) {
                System.out.print(" пробег " + carType.get(i));
                i++;
                System.out.println(" параметр " + carType.get(i));

            } else {
                System.out.println(" пробег " + carType.get(i));

            }

        }


    }


    private static void typeCar(List<String> type) {

            if (type.contains("C100")) {
                fuelCost = 46.10;
                fuelConsumption = 12.5;
                carName = "passenger car";

            } else
            if (type.contains("C200")) {
                fuelCost = 48.90;
                fuelConsumption = 12;
                carName = "truck";

            } else
            if (type.contains("C300")) {
                fuelCost = 47.50;
                fuelConsumption = 11.5;
                carName = "passenger transport";

            } else
            if (type.contains("C400")) {
                fuelCost = 48.90;
                fuelConsumption = 20;
                carName = "heavy machinery";
            }
            // формула высчитавает неправильное значение (то есть скорее всего берет только значения
        //в скобках. не знаю как привязать поле mileage  формуле
        double v = ((double) (mileage)) / 100;
        gsmCoast +=  v * (fuelConsumption * fuelCost);

        System.out.println("Стоимость расходов гсм " + gsmCoast);

        System.out.println("Для данной категория машины: " + carName
                + " - расход топлива: " + fuelConsumption + "," + " стоимость топлива: " + fuelCost);
    }


}
