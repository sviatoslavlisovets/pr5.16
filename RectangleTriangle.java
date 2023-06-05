public class RectangleTriangle {
    public static void main(String[] args) {
        double cathetus1 = 3;
        double cathetus2 = 4;

        double area = (cathetus1 * cathetus2) / 2;
        double perimeter = cathetus1 + cathetus2 + Math.sqrt(Math.pow(cathetus1, 2) + Math.pow(cathetus2, 2));

        System.out.println("Area: " + area);
        System.out.println("Perimeter: " + perimeter);
    }
}