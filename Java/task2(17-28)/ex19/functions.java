import java.util.Scanner;

public class functions {
    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.println("Result: " + func(number));
    }
    public static int func(int n) {
        if (n == 0) {
            return 0;
        }
        else if (n == 1) {
            return 1;
        }
        else if (n % 2 == 0) {
            return func(n / 2);
        }
        else {
            return func((n - 1) / 2) + func((n - 1) / 2) + 1;
        }
    }
}
