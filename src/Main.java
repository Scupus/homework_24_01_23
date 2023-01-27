public class Main {
    public static void main(String[] args) {
        Buses bus1 = new Buses("Икарус", "СТ18", 3.8f, TypeOfBusBody.средняя_40_50);
        Buses bus2 = new Buses("Дэу", "РС160", 4.2f, TypeOfBusBody.особо_малая_до_10_мест);
        Buses bus3 = new Buses("МАЗ", "МА17", 4.6f,TypeOfBusBody.большая_60_80);
        Buses bus4 = new Buses("ЛАЗ", "ЛА38", 4.0f, TypeOfBusBody.большая_60_80);

        Cars car1 = new Cars("Лада", "Приора", 1.8f, TypeOfCarBody.Купе);
        Cars car2 = new Cars("БМВ", "Z.3", 2.4f, TypeOfCarBody.Внедорожник);
        Cars car3 = new Cars("Мерседес", "SLK/8", 3.2f, TypeOfCarBody.Хетчбэк);
        Cars car4 = new Cars("Додж", "VIPER", 3.4f, TypeOfCarBody.Внедорожник);

        Trucks truck1 = new Trucks("Мерседес", "Актос.6", 5.8f, TypeOfTruckBody.N3);
        Trucks truck2 = new Trucks("Ивеко", "С-Вэй", 6.4f, TypeOfTruckBody.N1);
        Trucks truck3 = new Trucks("Вольво", "W32", 7.2f, TypeOfTruckBody.N2);
        Trucks truck4 = new Trucks("Даф", "XF105", 7.0f, TypeOfTruckBody.N3);

        car3.printCarInformation();
        bus4.printCarInformation();
        truck4.printCarInformation();
        car1.printCarInformation();
        bus2.printCarInformation();
        truck2.printCarInformation();

    }
}