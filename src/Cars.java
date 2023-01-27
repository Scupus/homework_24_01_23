class Cars extends Transport {
    TypeOfCarBody typeOfCarBody;


    public Cars(String brand, String model, float engineVolume, TypeOfCarBody typeOfCarBody) {
        super(brand, model, engineVolume);
        this.typeOfCarBody = typeOfCarBody;
    }

    public TypeOfCarBody getTypeOfBody() {
        return typeOfCarBody;
    }

    public void setTypeOfBody(TypeOfCarBody typeOfBody) {
        this.typeOfCarBody = typeOfBody;
    }

    @Override
    public String toString() {
        return "Легковой автомобиль марки: " + brand + ", модель: " + model + ", объем двигателя: " + engineVolume + ".";
    }

    public void printCarInformation() {
        System.out.println("Легковой автомобиль марки: " + brand + ", модель: " + model + ", объем двигателя: " +
                engineVolume + ", тип кузова: " + typeOfCarBody + ".");
    }

}

enum TypeOfCarBody {
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

