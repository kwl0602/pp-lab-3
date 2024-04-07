import geometry.Point;
import geometry.ColoredCircle;
import geometry.Circle;

public class Main {
    public static void main(String[] args) {
        Circle[] circles = new Circle[3];

        circles[0] = new Circle(new Point(0, 0), 5.0);
        circles[1] = new ColoredCircle(new Point(5, 5), 10.0, "Niebieski");
        circles[2] = new ColoredCircle(new Point(-5, -5), 15.0, "Zielony");

        for (Circle circle : circles) {
            System.out.println("Pole koła: " + circle.getArea());

            if (circle instanceof ColoredCircle) {
                ColoredCircle coloredCircle = (ColoredCircle) circle;
                System.out.println("Kolor koła: " + coloredCircle.getColor());
            }
        }
    }
}