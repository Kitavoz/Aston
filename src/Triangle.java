public interface Triangle extends Shape {
    double getSideA();
    double getSideB();
    double getSideC();
    void setSides(double a, double b, double c);

    default double calculatePerimeter() {
        return getSideA() + getSideB() + getSideC();
    }

    default double calculateArea() {
        double p = calculatePerimeter() / 2;
        return Math.sqrt(p * (p - getSideA()) * (p - getSideB()) * (p - getSideC()));
    }
}