import geometry.Square;

public class Main {

    public static void main(String[] args) {
        Square square = new Square(10.0);

        System.out.println("Pole kwadratu: " + square.calculateArea());
        System.out.println("Objętość kwadratu: " + square.calculatePerimeter());
    }
}
