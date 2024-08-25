public interface Circle extends Shape {
    double getRadius();
    void setRadius(double radius);

    default double calculatePerimeter() {
        return 2 * Math.PI * getRadius();
    }

    default double calculateArea() {
        return Math.PI * Math.pow(getRadius(), 2);
    }
}