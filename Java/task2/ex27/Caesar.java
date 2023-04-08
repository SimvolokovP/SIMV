import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;
import java.util.Scanner;


public class Caesar {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        StringReader str = new StringReader(scanner.nextLine());
        System.out.print("Enter a shift number: ");
        int key = scanner.nextInt();
        System.out.println("New string: " + code(str, key));
    }

    public static String code(StringReader s, int key) throws IOException {
        StringBuilder str = new StringBuilder();
        BufferedReader br = new BufferedReader(s);

        String string = br.readLine();


        for (char i: string.toCharArray()
        ) {
            str.append((char)(i+key));
        }

        return str.toString();
    }
}
