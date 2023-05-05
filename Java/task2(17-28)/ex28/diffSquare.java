import java.util.Scanner;

public class diffSquare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        scanner.close();
        
        if ((number > 0) && (number < 100000)) {
            for (int i = 1; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    int j = number / i;

                    if ((i + j) % 2 == 0 && (j - i) % 2 == 0) {
                        int x = (i + j) / 2;
                        int y = (j - i) / 2;

                        if ((x >= 1) && (y >= 1)) {
                            System.out.println(number + " = " + x*x + " - " + y*y);
                        }
                    }
                }
            }
        }
    }
}