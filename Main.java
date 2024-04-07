public class Main {
    public static void main(String[] args) {
        Point point = new Point(3.0, 10.0);

        point.setX(3.0);
        point.setY(10.0);

        System.out.println("Współrzędne: (" + point.getX() + ", " + point.getY() + ")");
    }
}
