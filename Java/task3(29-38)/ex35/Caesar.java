package ex35;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class Caesar {
    public static void main(String[] args) throws IOException {
        String fileName = "C:\\Users\\555\\Desktop\\sts2\\src\\file.txt";
        String content = Files.lines(Paths.get(fileName)).reduce("", String::concat);
        String s = content.toString();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        StringReader str = new StringReader(s);
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
            str.append((char)(i + key));
        }
        return str.toString().replace('"',' ');
    }
}
