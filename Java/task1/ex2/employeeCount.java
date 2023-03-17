package ex2;

import java.util.Arrays;
import java.util.Scanner;

public class employeeCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your status: ");
        String str = scanner.nextLine();
        String[] inputArr = str.split(",");
        boolean[] values = new boolean[inputArr.length];
        for (int i = 0; i < inputArr.length; i++) {
            values[i] = inputArr[i].equals("1");
        }
        int n = 0;
        for (boolean value : values) {
            if (value) {
                n++;
            }
        }
        System.out.println(Arrays.toString(values));
        System.out.println("Number of employees: " + n);
    }
}

