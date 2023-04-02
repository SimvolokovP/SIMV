import java.util.Scanner;

public class squareTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a first side: ");
        double a = scanner.nextFloat();
        System.out.print("Enter a second side: ");
        double b = scanner.nextFloat();
        System.out.print("Enter a third side: ");
        double c = scanner.nextFloat();
        System.out.println("Square of triangle: " + square(a, b, c));
        scanner.close();
    }
    public static double square(double x, double y, double z) {
        double s;
        double p = (x + y + z) / 2;
        s = Math.sqrt(p * (p - x) * (p - y) * (p - z));
        return s;
    }
}