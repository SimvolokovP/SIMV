import java.util.Scanner;

public class _4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String text = scanner.nextLine();
        System.out.print("Enter the letter: ");
        String letter = scanner.nextLine();
        System.out.println(str_count(text, letter.charAt(0)));


    }
    public static int str_count(String str, char ch) {
        int number = 0;
        for (int i = 0; i < str.length(); i ++) {
            if (str.charAt(i) == ch) {
                number ++;
            }
        }
        return number;
    }
}
