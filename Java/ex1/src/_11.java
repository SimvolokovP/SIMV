import java.util.Scanner;

public class _11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = scanner.nextLine();
        String[] letters = {"a", "o","e","y","i","u"};
        System.out.println(replace(str, letters));
    }
    public static String replace(String s, String[] array) {
        for (int i = 0; i < array.length; i ++) {
                s = s.replace(array[i],"");
        }
        return s;
    }
}
