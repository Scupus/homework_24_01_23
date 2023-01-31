public class Buses extends Transport {
    TypeOfBody typeOfBody;

    enum TypeOfBody {
        XS("особо малый до 10 мест"),
        S(" малый до 20 мест"),
        M("средний до 30 мест"),
        L("большой до 45 мест"),
        XL("расширенный до 60 мест");
        private String translation;

        TypeOfBody(String translation) {
            this.translation = translation;
        }

        public String getTranslation() {
            return translation;
        }

        @Override
        public String toString() {
            return translation;
        }
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
            System.out.println("Тип кузова автобуса - " + typeOfBody);
        } else {
            System.out.println("Данных по транспортному средству недостаточно");
        }

    }
}
