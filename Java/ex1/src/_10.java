import java.util.Scanner;

public class _10 {
    public static void main(String[] args) {
        System.out.print("Enter the name: ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("Hello, " + correctName(name) + "!");
    }
    public static String correctName(String str) {
        str = str.substring(0, 1).toUpperCase() + str.substring(1).toLowerCase();
        return str;
    }
}
