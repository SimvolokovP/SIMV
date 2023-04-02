import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class arrayMax {
    
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a length of arrray: ");
        int n = scanner.nextInt();
        int[] array = new int[n];
        ArrayList<Integer> leftArray = new ArrayList<>();
        ArrayList<Integer> rightArray = new ArrayList<>();


        for (int i = 0; i < n; i++) {
            System.out.print("Enter a " + (i + 1) + " element of array: ");
            array[i] = scanner.nextInt();
        }

        scanner.close();
        
        int max = array[0];
        int index = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
                index = i;
            }
        }
        for (int i = 0; i < index; i++) {
            leftArray.add(array[i]);
        }
        for (int i = index + 1; i < array.length ; i++) {
            rightArray.add(array[i]);
        }
        System.out.println("Array: " + Arrays.toString(array) + "\n" + "Left Array: " +leftArray + "\n" + "Right array: " + rightArray);
    }
}