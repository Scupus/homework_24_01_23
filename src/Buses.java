public class Buses extends Transport {
    TypeOfBusBody typeOfBusBody;


    public Buses(String brand, String model, float engineVolume, TypeOfBusBody typeOfBusBody) {
        super(brand, model, engineVolume);
        this.typeOfBusBody = typeOfBusBody;
    }

    @Override
    public String toString() {
        return "Автобус марки: " + brand + ", модель: " + model + ", объем двигателя: " + engineVolume + ".";
    }
    public void printCarInformation() {
        System.out.println("Автобус марки: " + brand + ", модель: " + model + ", объем двигателя: " +
                engineVolume + ", тип кузова: " + typeOfBusBody+ ".");
    }
}
enum TypeOfBusBody {
    особо_малая_до_10_мест,
    малая_до_25,
    средняя_40_50,
    большая_60_80,
    особо_большая_100_120_мест

}
