public class Main {
    public static void main(String[] args) {
        //Первое задание
        Person[] persArray = new Person[5];
        persArray[0] = new Person("Ivanov Ivan", "Engineer", "ivanov@mail.com", "892312312", 30000, 30);
        persArray[1] = new Person("Petrov Petr", "Manager", "petrov@mail.com", "893214312", 50000, 35);
        persArray[2] = new Person("Sidorov Sidor", "Developer", "sidorov@mail.com", "894212512", 60000, 28);
        persArray[3] = new Person("Smirnov Smir", "Analyst", "smirnov@mail.com", "895213213", 45000, 40);
        persArray[4] = new Person("Kuznetsov Kuzma", "Designer", "kuznetsov@mail.com", "896214314", 55000, 32);
        for (Person Person : persArray) {
            Person.printInfo();
        }
        //Второе задание
        Park park = new Park();
        Park.Attraction ferrisWheel = park.new Attraction("Колесо обозрения", "10:00 - 22:00", 300);
        Park.Attraction rollerCoaster = park.new Attraction("Американские горки", "11:00 - 20:00", 500);
        Park.Attraction houseOfFear = park.new Attraction("Дом страха", "12:00 - 21:00", 400);
        ferrisWheel.printInfo();
        rollerCoaster.printInfo();
        houseOfFear.printInfo();
    }
}
