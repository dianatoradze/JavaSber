package Task3.Task1;

public enum Options {
    code1,code2,code3,code4;
}
class Coast {
    Options options;
    public Coast (Options options) {
        this.options = options;
    }
    void coastInfo (){
         double fuelConsumption = 0;
         double fuelCost = 0;
         String carName = "";
            switch (options) {
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

        }
    }

