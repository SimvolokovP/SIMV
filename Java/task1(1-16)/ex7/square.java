package ex7;

import java.util.Scanner;

public class square {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = scanner.nextInt();
        range(number);
    }
    public static void range(int n) {
        int i = 0;
        for (; Math.pow(i,2) < n; i++);
        i--;
        System.out.println((int)Math.pow(i, 2) + "(" + i + ")");
    }
}
