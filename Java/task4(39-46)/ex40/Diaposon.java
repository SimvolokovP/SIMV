package ex40;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Diaposon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sequence of number: ");
        String trim = scanner.nextLine().trim();
        int[] ints = toInt(trim.split(","));
        List<String> answer = new ArrayList<>();
        for (int i = 0; i < ints.length; i++) {
            int j = i;
            while (j + 1 < ints.length && ints[j + 1] == ints[j] + 1) {
                j++;
            }
            if (j > i) {
                answer.add(String.format("%d...%d", ints[i], ints[j]));
            } else {
                answer.add(Integer.toString(ints[i]));
            }
            i = j;
        }

        System.out.println(String.join(",", answer));
    }

    private static int[] toInt(String[] strs) {
        int[] arr = new int[strs.length];
        for (int i = 0; i < strs.length; i++) {
            arr[i] = Integer.parseInt(strs[i].trim());
        }
        return arr;
    }
}
