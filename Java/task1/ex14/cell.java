package ex14;

import java.util.*;

public class cell {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input 3 strings:");

        int[] arr = new int[3];
        for (int i = 0; i < 3; ++i) {
            String s = scanner.nextLine();
            if (!s.isEmpty())
                arr[i] = Integer.parseInt(s);
            else
                arr[i] = Integer.MAX_VALUE;
        }

        int m = Arrays.stream(arr).min().getAsInt();

        for (int i = 0; i < 3; ++i)
            if (arr[i] == Integer.MAX_VALUE)
                arr[i] = m;

        for (int i: arr) {
            System.out.println(i);
        }
    }
}
