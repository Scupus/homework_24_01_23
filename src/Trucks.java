public class Trucks extends Transport {
    TypeOfTruckBody typeOfTruckBody;


    public Trucks(String brand, String model, float engineVolume, TypeOfTruckBody typeOfTruckBody) {
        super(brand, model, engineVolume);
        this.typeOfTruckBody = typeOfTruckBody;
    }

    @Override
    public String toString() {
        return "Грузовик марки: " + brand + ", модель: " + brand + ", объем двигателя: " + engineVolume + ".";
    }
    public void printCarInformation() {
        System.out.println("Грузовик марки: " + brand + ", модель: " + model + ", объем двигателя: " +
                engineVolume + ", номер кузова: " + typeOfTruckBody+ ".");
    }

}
enum TypeOfTruckBody {
    N1,
    N2,
    N3

}
