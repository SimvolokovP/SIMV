import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

public class _15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = scanner.nextLine();

        StringTokenizer st = new StringTokenizer(str, " ");
        List<String> list = new LinkedList<>();

        while (st.hasMoreTokens()) {
            String s = st.nextToken();
            if (!list.contains(s)) {
                list.add(s);
            }
        }
        for (String word: list) {
            System.out.print(word + " ");
        }
    }
}
