public class Main {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Арчи");
        Cat cat1 = new Cat("Мурка");
        Cat cat2 = new Cat("Руно");

        dog1.run(150);
        dog1.swim(8);

        cat1.run(100);
        cat1.swim(5);

        System.out.println("Всего животных: " + Animal.getCount());
        System.out.println("Всего собак: " + Dog.getDogCount());
        System.out.println("Всего котов: " + Cat.getCatCount());

        Bowl bowl = new Bowl(20);
        cat1.eat(bowl, 15);
        cat2.eat(bowl, 10);

        System.out.println(cat1.isFull() ? cat1.name + " сыт." : cat1.name + " голоден.");
        System.out.println(cat2.isFull() ? cat2.name +" сыт." : cat2.name +" голоден.");

        bowl.addFood(10);
        cat2.eat(bowl, 10);
        System.out.println(cat2.isFull() ? cat2.name +" сыт." : cat2.name +" голоден.");

        Circle circle = new CircleImp(5, "Красный", "Черный");
        Rectangle rectangle = new RectangleImp(4, 7, "Зеленый", "Желтый");
        Triangle triangle = new TriangleImp(3, 4, 5, "Синий", "Белый");

        printShapeInfo(circle);
        printShapeInfo(rectangle);
        printShapeInfo(triangle);
    }
    private static void printShapeInfo(Shape shape) {
        System.out.println("Информация о фигуре:");
        System.out.println("Периметр: " + shape.calculatePerimeter());
        System.out.println("Площадь: " + shape.calculateArea());
        System.out.println("Цвет заливки: " + shape.getFillColor());
        System.out.println("Цвет границы: " + shape.getBorderColor());
        System.out.println();
    }
}
