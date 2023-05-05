package ex16;

import java.util.Scanner;

public class correctString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = scanner.nextLine();
        int n = count(str);
        if (n == -1) {
            System.out.println(str.toLowerCase());
        }
        else if (n == 1) {
            System.out.println(str.toUpperCase());
        }
        else {
            System.out.println(str);
        }
    }
    public static int count(String s) {
        int up = 0;
        int low = 0;
        char[] ch = s.toCharArray();
        for (char letter : ch) {
            if (letter >='A' && letter <= 'Z'){
                up++;
            }
            else if (letter >= 'a' && letter <= 'z') {
                low++;
            }
        }
        if (up > low) {
            return 1;
        }
        else if (low > up) {
            return -1;
        }
        return 0;
    }
}

