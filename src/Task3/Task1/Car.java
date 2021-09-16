package Task3.Task1;

import java.util.*;

public class Car extends Transport {

    private static String[] array;

    static final String code1 = "C100";
    static final String code2 = "C200";
    static final String code3 = "C300";
    static final String code4 = "C400";
    static String code;

    private static Map<String, Transport> carList;
    private final Options Coast;
    // 2,3,4 options
    public Car(Options options, int carNumber, int mileage) {
        super(carNumber,mileage);
        this.parametr = 0;
        this.Coast = options;
        carList = new HashMap<>();

    }
    // для выборки видов машин в формулу
    public static void addCar(Options options) {

        carList.put(Options.code1.name(), new Car(Options.code1, carNumber,mileage));

    }

    public static List<String> createArrayInList(String code) {

        array = new String[]{"C100_1-100", "C200_1-120-1200",
                "C300_1-120-30",
                "C400_1-80-20", "C100_2-50", "C200_2-40-1000",
                "C300_2-200-45", "C400_2-10-20", "C100_3-10",
                "C200_3-170-1100", "C300_3-150-29", "C400_3-100-28",
                "C100_1-300", "C200_1-100-750", "C300_1-32-15"};

        return getStrings(code);
    }

        // переделать
    public static void info(List<String> carType) {

        // вывод значений для каждого авто по классу
        for (int i = 0; i < carType.size(); i++) {
            System.out.print(" код " + carType.get(i));
            code = carType.get(i); i++;
            System.out.print(" номер " + carType.get(i));
            carNumber = Integer.parseInt(carType.get(i));i++;
            if (!carType.contains(code1)) {
               mileage = Integer.parseInt(carType.get(i));
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
