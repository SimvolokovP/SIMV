import java.util.Arrays;
import java.util.Scanner;

public class _8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int z = scanner.nextInt();
        if (check(x, y, z)) {
            System.out.println("Triangle is exists!");
            System.out.println(corner(x,y,z));
        }
        else {
            System.out.println("Triangle is not exists!");
        }
    }

    public static boolean check(int a, int b, int c) {
        return ((a + b) > c && (b + c) > a && (c + a) > b);

    }

    public static double corner(int a, int b, int c) {
        double[] array = new double[3];
        array[0] = Math.toDegrees(Math.cos(Math.pow(a, 2) + Math.pow(c, 2) - Math.pow(b, 2) / (2 * a * c)));
        array[1] = Math.toDegrees(Math.cos(Math.pow(a, 2) + Math.pow(b, 2) - Math.pow(c, 2) / (2 * a * c)));
        array[0] = Math.toDegrees(Math.cos(Math.pow(b, 2) + Math.pow(c, 2) - Math.pow(a, 2) / (2 * a * c)));
        return (180 - Arrays.stream(array).min().getAsDouble());
    }

}
