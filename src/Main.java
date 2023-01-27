public class Main {
    public static void main(String[] args) {
        Buses bus1 = new Buses("Икарус", "СТ18", 3.8f, Buses.TypeOfBody.большая_60_80);
        Buses bus2 = new Buses("Дэу", "РС160", 4.2f, Buses.TypeOfBody.особо_малая_до_10_мест);
        Buses bus3 = new Buses("МАЗ", "МА17", 4.6f, Buses.TypeOfBody.средняя_40_50);
        Buses bus4 = new Buses("ЛАЗ", "ЛА38", 4.0f, Buses.TypeOfBody.малая_до_25);

        Cars car1 = new Cars("Лада", "Приора", 1.8f, Cars.TypeOfBody.Минивэн);
        Cars car2 = new Cars("БМВ", "Z.3", 2.4f, Cars.TypeOfBody.Внедорожник);
        Cars car3 = new Cars("Мерседес", "SLK/8", 3.2f, Cars.TypeOfBody.Пикап);
        Cars car4 = new Cars("Додж", "VIPER", 3.4f, Cars.TypeOfBody.Кроссовер);

        Trucks truck1 = new Trucks("Мерседес", "Актос.6", 5.8f, Trucks.TypeOfBody.N1);
        Trucks truck2 = new Trucks("Ивеко", "С-Вэй", 6.4f, Trucks.TypeOfBody.N3);
        Trucks truck3 = new Trucks("Вольво", "W32", 7.2f, Trucks.TypeOfBody.N2);
        Trucks truck4 = new Trucks("Даф", "XF105", 7.0f, Trucks.TypeOfBody.N3);

        car3.printCarInformation();
        bus4.printCarInformation();
        truck4.printCarInformation();
        car1.printCarInformation();
        bus2.printCarInformation();
        truck2.printCarInformation();
        car3.printType();
        truck4.printType();
        bus1.setTypeOfBody(null);
        bus1.printType();



    }
}