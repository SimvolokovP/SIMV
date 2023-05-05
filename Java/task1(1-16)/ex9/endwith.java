package ex9;

import java.util.Scanner;

public class endwith {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first string: ");
        String str1 = scanner.nextLine();
        System.out.print("Enter the second string: ");
        String str2 = scanner.nextLine();
        System.out.println("Second string is end of first string: " + check(str1, str2));
    }
    public static boolean check(String s1, String s2) {
        return s1.endsWith(s2);
    }
}
