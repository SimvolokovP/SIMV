import java.util.Scanner;

public class brackets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = scanner.nextLine(); 
        System.out.println("Brackets is correct: " + isCorrect(str));
        scanner.close();
    }
    public static boolean isCorrect(String str) {
        int x = 0;
        for (int i = 0; i < str.length(); i++) {
            if (x < 0) {
                return false;
            }
            String symbol = str.substring(i, i + 1);
            if (symbol.equals("(")) {
                x++;
                continue;
            }
            if (symbol.equals(")")) 
                x--;
        }
        if (x == 0) {
            return true;
        } else {
            return false;
        }
    }
}