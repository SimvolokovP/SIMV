import java.util.Scanner;

public class sum2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a start number: ");
        int m = scanner.nextInt();
        System.out.print("Enter a final number: ");
        int n = scanner.nextInt();
        System.out.print("Enter a number of dividers: ");
        int x = scanner.nextInt();
        

        int[] div = new int[x];
        for (int i = 0; i < x; i ++) {
            System.out.print("Enter a divider: ");
            div[i] = scanner.nextInt();
        }

        for (int d : div) {
            int summa = 0;
            for (int i = m; i <= n; i ++ ) {
                if (i % div[i] == 0) {
                    summa += i;
                }
            }
            System.out.println("Summa" + "(" + d + "): " + summa);
        }
    scanner.close(); 
    }
    
}
