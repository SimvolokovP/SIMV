import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a start number: ");
        int m = scanner.nextInt();
        System.out.print("Enter a final number: ");
        int n = scanner.nextInt();
        System.out.print("Enter a number of dividers: ");
        int x = scanner.nextInt();
        int[] row = new int[n - m + 1];

        int number = m;
        for (int i = 0; i < row.length; i ++) {
            row[i] = number;
            number ++;
        }

        int result = 0;
        int[] div = new int[x];
        for (int i = 0; i < x; i ++) {
            System.out.print("Enter a divider: ");
            div[i] = scanner.nextInt();
        }
        for (int i = 0; i < row.length; i ++) {
            int a = 0;
            for (int j = 0; j < div.length; j ++) {
                a += row[i] % div[j];
            }
            if (a == 0) {
                result += row[i];
            }
        }
        System.out.println(result);
        }

    }


