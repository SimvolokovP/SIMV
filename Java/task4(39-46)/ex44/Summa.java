package ex44;

import java.util.Scanner;

public class Summa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a first number: ");
        String a = scanner.nextLine();
        System.out.print("Enter a second number: ");
        String b = scanner.nextLine();
        System.out.println("Summa: " + sum(Integer.parseInt(a),Integer.parseInt(b)));
    }
    public static Integer sum(Integer a, Integer b) {
        return a + b;
    }
}
