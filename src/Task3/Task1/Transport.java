package Task3.Task1;

public class Transport {
    static int carNumber = 0;
    static int mileage = 0;
    int parametr = 0;

    public Transport(int carNumber, int mileage, int parametr) {
        Transport.carNumber = carNumber;
        Transport.mileage = mileage;
        this.parametr = parametr;
    }

    public Transport(int carNumber, int mileage) {
    }

    public int getCarNumber() {
        return carNumber;
    }

    public int getMileage() {
        return mileage;
    }

    public int getParametr() {
        return parametr;
    }

    @Override
    public String toString() {
        return
                "carNumber= " + carNumber +
                ", mileage= " + mileage +
                ", parametr=" + parametr;
    }
}
