public class Person {
    private String fullName;
    private String position;
    private String email;
    private String phone;
    private int salary;
    private int age;

    public Person(String fullName, String position, String email, String phone, int salary, int age) {
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public void printInfo() {
        System.out.println("ФИО: " + fullName);
        System.out.println("Должность: " + position);
        System.out.println("Email: " + email);
        System.out.println("Телефон: " + phone);
        System.out.println("Зарплата: " + salary);
        System.out.println("Возраст: " + age);
        System.out.println();
    }

    public static void main(String[] args) {
        Person[] persArray = new Person[5];

        persArray[0] = new Person("Ivanov Ivan", "Engineer", "ivanov@mail.com", "892312312", 30000, 30);
        persArray[1] = new Person("Petrov Petr", "Manager", "petrov@mail.com", "893214312", 50000, 35);
        persArray[2] = new Person("Sidorov Sidor", "Developer", "sidorov@mail.com", "894212512", 60000, 28);
        persArray[3] = new Person("Smirnov Smir", "Analyst", "smirnov@mail.com", "895213213", 45000, 40);
        persArray[4] = new Person("Kuznetsov Kuzma", "Designer", "kuznetsov@mail.com", "896214314", 55000, 32);

        for (Person Person : persArray) {
            Person.printInfo();
        }
    }
}