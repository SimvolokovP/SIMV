package ex42;

import java.util.Arrays;
import java.util.Scanner;

public class SumOfInterval {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number of intervals: ");
        int numb = scanner.nextInt();
        System.out.println("Summa = " + Sum(numb));
    }
    public static int Sum(int n) {
        int sum = 0;
        while (n != 0) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a start of interval " + (n - (n - 1)) + ": ");
            int a = scanner.nextInt();
            System.out.print("Enter a end of interval " + (n - (n - 1)) + ": ");
            int b = scanner.nextInt();
            int[] arr = new int[2];
            arr[0] = a;
            arr[1] = b;
            sum = sum + (b - a);
            System.out.println("interval: " + Arrays.toString(arr));
            n--;
        }
        return sum;
    }
}
