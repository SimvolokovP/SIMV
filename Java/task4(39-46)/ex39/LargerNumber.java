package ex39;

import java.util.Scanner;

public class LargerNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int result = searchLargerNumber(number);
        System.out.print(result);
        }


    public static int searchLargerNumber(int n) {
        char[] arr = Integer.toString(n).toCharArray();
        int i = arr.length - 2;
        while (i >= 0 && arr[i] >= arr[i + 1]) {
            i--;
        }
        if (i < 0) {
            return -1;
        }
        int j = arr.length - 1;
        while (j > i && arr[j] <= arr[i]) {
            j--;
        }
        exchange(arr, i, j);
        reverse(arr, i + 1, arr.length - 1);
        int result = Integer.parseInt(new String(arr));
        return result;
    }

    public static void exchange(char[] arr, int i, int j) {
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void reverse(char[] arr, int i, int j) {
        while (i < j) {
            exchange(arr, i, j);
            i++;
            j--;
        }
    }
}
