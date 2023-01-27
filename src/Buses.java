public class Buses extends Transport {
    TypeOfBody typeOfBody;
    enum TypeOfBody {
        особо_малая_до_10_мест,
        малая_до_25,
        средняя_40_50,
        большая_60_80,
        особо_большая_100_120_мест

    }

    public Buses(String brand, String model, float engineVolume, TypeOfBody typeOfBody) {
        super(brand, model, engineVolume);
        this.typeOfBody = typeOfBody;
    }

    public TypeOfBody getTypeOfBusBody() {
        return typeOfBody;
    }

    public void setTypeOfBody(TypeOfBody typeOfBody) {
        this.typeOfBody = typeOfBody;
    }




    @Override
    public String toString() {
        return "Автобус марки: " + brand + ", модель: " + model + ", объем двигателя: " + engineVolume + ".";
    }

    public void printCarInformation() {
        System.out.println("Автобус марки: " + brand + ", модель: " + model + ", объем двигателя: " +
                engineVolume + ", тип кузова: " + typeOfBody + ".");
    }
    public void printType() {
        if (typeOfBody != null) {
            System.out.println("Тип кузова автомобиля - " + typeOfBody);
        } else {
            System.out.println("Данных по транспортному средству недостаточно");
        }

    }
}
