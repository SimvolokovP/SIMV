package ex8;

import java.util.Arrays;
import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first side: ");
        int x = scanner.nextInt();
        System.out.print("Enter the second side: ");
        int y = scanner.nextInt();
        System.out.print("Enter the third side: ");
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

