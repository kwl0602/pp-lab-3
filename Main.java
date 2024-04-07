import geometry.Point;
import geometry.Circle;

public class Main {
    public static void main(String[] args) {
        Point center = new Point(1, 2);

        Circle circle = new Circle(center, 7.0);

        System.out.println("Środek koła: (" + circle.getCenter().getX() + ", " + circle.getCenter().getY() + ")");
        System.out.println("Promień koła: " + circle.getRadius());
        System.out.println("Obwód koła: " + circle.calculatePerimeter());
        System.out.println("Pole powierzchni koła: " + circle.getArea());

    }
}
