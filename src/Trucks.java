public class Trucks extends Transport {
    TypeOfBody typeOfBody;
    enum TypeOfBody {
        N1,
        N2,
        N3
    }

    public Trucks(String brand, String model, float engineVolume, TypeOfBody typeOfBody) {
        super(brand, model, engineVolume);
        this.typeOfBody = typeOfBody;
    }

    @Override
    public String toString() {
        return "Грузовик марки: " + brand + ", модель: " + brand + ", объем двигателя: " + engineVolume + ".";
    }

    public void printCarInformation() {
        System.out.println("Грузовик марки: " + brand + ", модель: " + model + ", объем двигателя: " +
                engineVolume + ", номер кузова: " + typeOfBody + ".");
    }
    public void printType() {
        if (typeOfBody != null) {
            System.out.println("Тип кузова автомобиля - " + typeOfBody);
        } else {
            System.out.println("Данных по транспортному средству недостаточно");
        }

    }
}


