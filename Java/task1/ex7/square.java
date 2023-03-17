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
        for (int i = 0; i*i < n; i ++) {
            System.out.println(i*i + "(" + i + ")");
        }

    }
}
