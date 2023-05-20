package ex45;

import java.util.Scanner;

public class RomesNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = scanner.nextInt();
        System.out.println(IntToRoman(a));
    }
    public static String IntToRoman(int num)
    {
        String[] romanNumber = new String[] { "I^-","M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };
        int[] arabicNumber = new int[] { 10000, 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };

        StringBuilder result = new StringBuilder();
        int index = 0;

        while (index < romanNumber.length)
        {
            while(num >= arabicNumber[index])
            {
                int des = num / arabicNumber[index];
                num = num % arabicNumber[index];
                for(int i = 0; i < des; i++)
                    result.append(romanNumber[index]);
            }
            index++;
        }

        return result.toString();
    }
}
