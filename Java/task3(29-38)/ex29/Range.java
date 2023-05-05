package ex29;

import java.util.Scanner;

public class Range {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        System.out.print("Enter degree of range: ");
        int degree = scanner.nextInt();
        System.out.println(search(n, degree));
    }

    public static int search(int n, int degree) {
        int index = n;
        if (n < 10) {
            return -1;
        }
        int summa = 0;
        int[] array = new int[n];


        for (int i = String.valueOf(n).length() - 1; i >= 0; i--) {
            array[i] = index % 10;
            index = index / 10;
            array[i] = (int) Math.pow(array[i], degree + i);
            summa += array[i];
        }
        if (summa % n == 0) {
            int result = summa / n;
            StringBuilder str = new StringBuilder();
            str.append("(").append(n).append(", ").append(degree).append(") => ");
            for (char c : String.valueOf(n).toCharArray()) {
                str.append(c).append("^").append(degree).append("+");
                degree++;
            }
            str.deleteCharAt(str.length() - 1);
            str.append("=").append(summa).append("=").append(n).append("*").append(result);
            System.out.println(str);
            return result;
        }
        System.out.println("False");
        return -1;
    }
}
