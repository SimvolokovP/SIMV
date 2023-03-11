import java.util.Arrays;
import java.util.Scanner;

public class _3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float xa = scanner.nextInt();
        float ya = scanner.nextInt();
        float[] a = {xa,ya};
        System.out.println("coordinates of first: " + "[" + a[0] + "," + a[1] + "]");
        float xb = scanner.nextInt();
        float yb = scanner.nextInt();
        float[] b = {xb,yb};
        System.out.println("coordinates of second: " + "[" + b[0] + "," + b[1] + "]");
        float xc = scanner.nextInt();
        float yc = scanner.nextInt();
        float[] c = {xc,yc};
        System.out.println("coordinates of third: " + "[" + c[0] + "," + c[1] + "]");
        float[] answer = {0,0};
        System.out.println("Answer: ");
        System.out.println(Arrays.toString(search(a, b, c, answer)));
    }
    public static float[] search(float[] one, float[] two, float[] three, float[] result) {
        float x0 = (one[0] + two[0] + three[0])/(3);
        float y0 = (one[1] + two[1] + three[1])/(3);
        result[0] = x0;
        result[1] = y0;
        return result;
    }
}
