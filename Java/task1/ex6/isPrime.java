package ex6;

import java.util.Scanner;

public class isPrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = scanner.nextInt();
        System.out.println("The number is Prime: " + isprime(n));

    }
    public static boolean isprime(int number) {
        for (int i = 2; i < number; i ++)
            if (number % i == 0) {
                return false;
            }
        return true;
    }
}

