public class Park {
    public class Attraction {
        private String name;
        private String workingHours;
        private int cost;

        public Attraction(String name, String workingHours, int cost) {
            this.name = name;
            this.workingHours = workingHours;
            this.cost = cost;
        }

        public void printInfo() {
            System.out.println("Аттракцион: " + name);
            System.out.println("Время работы: " + workingHours);
            System.out.println("Стоимость: " + cost + " рублей");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Park park = new Park();
        Attraction ferrisWheel = park.new Attraction("Колесо обозрения", "10:00 - 22:00", 300);
        Attraction rollerCoaster = park.new Attraction("Американские горки", "11:00 - 20:00", 500);
        Attraction houseOfFear = park.new Attraction("Дом страха", "12:00 - 21:00", 400);

        ferrisWheel.printInfo();
        rollerCoaster.printInfo();
        houseOfFear.printInfo();
    }
}