import java.util.Scanner;

public class _8 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int z = scanner.nextInt();
        check(x,y,z);
    }
    public static void check(int a, int b, int c) {
        if ((a + b) > c & (b + c) > a & (c + a) > b) {
            System.out.println("Triangle exists");
        }
        else {
            System.out.println("Triangle does not exist(((");
        }
    }
}
