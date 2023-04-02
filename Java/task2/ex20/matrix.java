import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class matrix {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        scanner.close();
        int[][] mtx = new int[m][n];
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    mtx[i][j] = 1;
                }
            }

            for (int i = 1; i <= Math.min(m, n) / 2; i++) {
                int number = i + 1;
                for (int j = i; j < n - i; j++) {
                    mtx[i][j] = number;
                    mtx[m - i - 1][j] = number;
                }
                for (int j = i; j < m - i; j++) {
                    mtx[j][i] = number;
                    mtx[j][n - i - 1] = number;
                }
            }
            
        try {
            FileWriter writer = new FileWriter("yy.txt");
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    writer.write(mtx[i][j] + " ");
                }
                writer.write("\n");
            }
            writer.close();
            System.out.println("Array saved to file.");
        } catch (IOException ext) {
            System.out.println("An error occurred while writing to the file.");
            ext.printStackTrace();
        }
    }
}

        