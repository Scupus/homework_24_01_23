class Cars extends Transport {
    TypeOfBody typeOfBody;


    public Cars(String brand, String model, float engineVolume, TypeOfBody typeOfBody) {
        super(brand, model, engineVolume);
        this.typeOfBody = typeOfBody;
    }

    enum TypeOfBody {
        Седан,
        Хетчбэк,
        Купе,
        Универсал,
        Внедорожник,
        Кроссовер,
        Пикап,
        Фургон,
        Минивэн,
    }

    public TypeOfBody getTypeOfBody() {
        return typeOfBody;
    }

    public void setTypeOfBody(TypeOfBody typeOfBody) {
        this.typeOfBody = typeOfBody;
    }

    @Override
    public String toString() {
        return "Легковой автомобиль марки: " + brand + ", модель: " + model + ", объем двигателя: " + engineVolume + ".";
    }

    public void printCarInformation() {
        System.out.println("Легковой автомобиль марки: " + brand + ", модель: " + model + ", объем двигателя: " +
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

