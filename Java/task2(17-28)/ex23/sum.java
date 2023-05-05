import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a final number: ");
        int n = scanner.nextInt();
        System.out.print("Enter a first divider: ");
        int x = scanner.nextInt();
        System.out.print("Enter a second divider: ");
        int y = scanner.nextInt();
        System.out.println("\n" + "sum: " + result(n, x, y));
        scanner.close();
    }
    public static int result(int m, int a, int b) {
        int s = 0;
        for (int i = 0; i <= m; i ++) {
            System.out.print(i + " ");
            if ((i % a == 0) || (i % b == 0)) {
                s += i;
            }
        }
        return s;
    }
}
