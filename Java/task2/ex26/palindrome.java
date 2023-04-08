import java.util.Scanner;


public class palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String string = scanner.nextLine();
        System.out.println("Longest palindrome is: " + search(string));
    }

    public static String search(String str) {
        int x = str.length();
        if (x == 0) {
            return "";
        }
        boolean[][] array = new boolean[x][x];
        int max = 0;
        int start = 0;
        for (int i = 0; i < x; i++) {
            array[i][i] = true;
            max = 1;
        }


        for (int i = 0; i < x - 1; i++) {
            if (str.charAt(i) == str.charAt(i+1)) {
                array[i][i+1] = true;
                max = 2;
                start = i;
            }
        }


        for (int k = 3; k <= x; k++) {
            for (int i = 0; i < x - k + 1; i++) {
                int j = i + k - 1;
                if (str.charAt(i) == str.charAt(j) && array[i+1][j-1]) {
                    array[i][j] = true;
                    if (k > max) {
                        max = k;
                        start = i;
                    }
                }
            }
        }

        return str.substring(start, start + max) + " (" + max + ")";
    }
}
