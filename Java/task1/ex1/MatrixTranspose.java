package ex1;

import java.util.Scanner;

public class MatrixTranspose {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input row of matrix: ");
        int row = scanner.nextInt();
        System.out.print("Input column of matrix: ");
        int column = scanner.nextInt();
        int[][] a = new int[column][row];
        int[][] b = new int[row][column];

        for (int i = 0; i < row; i ++) {
            for (int j = 0; j < column; j ++) {
                System.out.print("Enter the element of mtx: ");
                b[i][j] = scanner.nextInt();
            }
        }
        for (int i = 0; i < a.length; i ++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = b[j][i];
            }
        }
        for (int i = 0; i < a.length; i ++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}

