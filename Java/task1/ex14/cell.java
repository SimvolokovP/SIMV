package ex14;

import java.util.Arrays;
import java.util.Scanner;

public class cell {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[3];
        for (int i = 0; i < array.length; i++) {
            System.out.print("Enter the number: ");
            int number = scanner.nextInt();

            if (i == 0 || number > array[0]) {
                array[2] = array[1];
                array[1] = array[0];
                array[0] = number;
            } else if (i == 1 || number > array[1]) {
                array[2] = array[1];
                array[1] = number;
            } else {
                array[2] = number;
            }
        }
        System.out.println(Arrays.toString(array));
    }
}

