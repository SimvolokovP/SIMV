package ex33;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number of sticks: ");
        int number = scanner.nextInt();
        System.out.println("Tanya has " + play(number) + " sticks");
        }
    public static int play(int number) {
        int s = 0;
        int t = 0;
        while (number != 1) {
            if (number % 2 == 0) {
                t++;
                number--;
                if (number == 1) {
                    break;
                } else {
                    s++;
                    number--;
                }
            } else {
                t++;
                number--;
                if (number % 2 == 0) {
                    s += number / 2;
                    number /= 2;
                    if (number == 1) {
                        break;
                    }
                } else {
                    play(number);
                }
            }
        }
        return t;
    }
}


