import java.util.Scanner;

public class _6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = scanner.nextInt();
        System.out.println("The number is Prime: " + isPrime(n));

    }
    public static boolean isPrime(int number) {
        for (int i = 2; i < number; i ++)
            if (number % i == 0) {
                return false;
            }
        return true;
    }
}
