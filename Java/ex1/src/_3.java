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
        float x0 = (xa + xb + xc)/3;
        System.out.println(x0);
    }

}
