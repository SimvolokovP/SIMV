package mtx;

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        System.out.print("Enter matrix size: ");
        Scanner scanner = new Scanner(System.in);
        int n1 = scanner.nextInt();
        Matrix m1 = new Matrix(n1);
        m1.created();
        System.out.println("Current matrix: \n" + m1);
        System.out.println("Multiplication of the elements of main diagonal: " + m1.multOfMainDiag());
        System.out.println("Sum of the elements above tne main diagonal: " + m1.sumOfMatrixUp());
        System.out.println("Difference of the elements under tne main diagonal: " + m1.diffOfMatrixDown());
        m1.print();
    }
}
