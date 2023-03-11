import java.util.Scanner;

public class _13 {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the start number: ");
        int start = scanner.nextInt();
        System.out.print("Enter the step of range: ");
        int step = scanner.nextInt();
        System.out.print("Enter the number of steps: ");
        int number = scanner.nextInt();
        range(start, step, number);
    }
    public static void range(int s, int x, int n) {
        int value = 0;
        for (int i = s; value != n; i += x ) {
            value += 1;
            System.out.println(i);
        }
    }
}
