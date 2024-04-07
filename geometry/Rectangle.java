package geometry;

public class Rectangle {
    private double lenght;
    private double width;

    public Rectangle(double lenght, double width) {
        this.lenght = lenght;
        this.width = width;
    }

    public double calculateArea() {
        return lenght * width;
    }

    public double calculatePerimeter() {
        return 2 * (lenght + width);
    }
}
