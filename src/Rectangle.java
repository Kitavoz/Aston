public interface Rectangle extends Shape {
    double getWidth();
    double getHeight();
    void setWidth(double width);
    void setHeight(double height);

    default double calculatePerimeter() {
        return 2 * (getWidth() + getHeight());
    }

    default double calculateArea() {
        return getWidth() * getHeight();
    }
}