package ex11;

import java.util.Scanner;

public class replace {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = scanner.nextLine();
        String[] letters = {"a", "o","e","y","i","u","A","O","E","Y","I","U"};
        System.out.println(replaceletter(str, letters));
    }
    public static String replaceletter(String s, String[] array) {
        for (String value : array) {
            s = s.replace(value, "");
        }
        return s;
    }
}
