package ex46;

import java.util.Scanner;

public class ArabicNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the Roman number: ");
        String romanNumber = scanner.nextLine();
        int num = romanToArabic(romanNumber.toUpperCase());
        System.out.println("Result: " + num);
    }

    private static int romanToArabic(String romanYear) throws IllegalArgumentException{
        String[] dts = {"I^-","M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        int[] ints = {10000,1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};

        int num = 0;
        int i = 0;
        romanYear = romanYear.replaceAll("\\s", "");
        while (i < romanYear.length()) {
            String currentSymbol = romanYear.substring(i, i + 1);
            int currentValue = getValue(dts, ints, currentSymbol);
            if (i + 1 < romanYear.length()) {
                String nextSymbol = romanYear.substring(i + 1, i+ 2);
                int nextValue = getValue(dts, ints, nextSymbol);
                if (nextValue > currentValue) {
                    num += (nextValue - currentValue);
                    i += 2;
                } else {
                    num += currentValue;
                    i++;
                }
            } else {
                num += currentValue;
                i++;
            }
        }
        return num;
    }

    private static int getValue(String[] symbols, int[] values, String symbol) throws IllegalArgumentException {
        for (int i = 0; i < symbols.length; i++) {
            if (symbols[i].equals(symbol)) {
                return values[i];
            }
        }
        throw new IllegalArgumentException("Invalid Roman numeral symbol: " + symbol);
    }
}