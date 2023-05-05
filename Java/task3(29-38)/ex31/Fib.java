package ex31;

import java.util.Scanner;

public class Fib {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number >= 10, <= 10000!: ");
        int number = scanner.nextInt();

        if (number >= 10 && number <= 100000 ) {
            int result = search(number);
            System.out.println("The number: " + result);
            System.out.println(numbOf(result));
        }
        else {
            System.out.println("Enter a number >= 10, <= 10000!");
        }

    }
    public static int search(int n) {
        int f = 1;
        int s = 1;
        for (int i = 2; i <= n - 1; i++) {
            int next = f + s;
            f = s;
            s = next;
        }
        return s;
    }


    public static String numbOf(int r) {
        int dig = 0;
        int count = 0;
        int max = 0;
        for (int i = 0; i < 10; i++) {
            int current = r;
            count = 0;
            while (current != 0) {
                int ost = current % 10;
                current /= 10;
                if (ost == i) {
                    count++;
                }
            }
            if (count > max) {
                dig = i;
                max = count;
            }
        }
        return ("(" + max + "," + dig + ")");
    }

}



