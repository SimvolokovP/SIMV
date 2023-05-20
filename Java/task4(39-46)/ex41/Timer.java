package ex41;

import java.util.Scanner;

public class Timer {
    private static final int MINUTE = 60;
    private static final int HOUR = 60 * MINUTE;
    private static final int DAY = 24 * HOUR;
    private static final int YEAR = 365 * DAY;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number of seconds: ");
        int number = scanner.nextInt();

        int years = number / YEAR;
        number %= YEAR;
        int days = number / DAY;
        number %= DAY;
        int hours = number / HOUR;
        number %= HOUR;
        int minutes = number / MINUTE;
        number %= MINUTE;



        StringBuilder answer = new StringBuilder();
        int num = 0;
        if (years > 0) {
            answer.append(years).append(" year").append(years > 1 ? "s" : "");
            num++;
        }
        if (days > 0 && (num == 0 || (num > 0 && number > 0))) {
            if (answer.length() > 0) {
                if (num > 1) {
                    answer.append(" and ");
                } else {
                    answer.append(", ");}
            }
            answer.append(days).append(" day").append(days > 1 ? "s" : "");
            num++;
        }
        if (hours > 0 && (num == 0 || (num > 1 && number > 0))) {
            if (answer.length() > 0) {
                if (num > 2) {
                    answer.append(" and ");
                } else {
                    answer.append(", ");
                }
            }
            answer.append(hours).append(" hour").append(hours > 1 ? "s" : "");
            num++;
        }
        if (minutes > 0 && (num == 0 || (num > 2 && number > 0))) {
            if (answer.length() > 0) {
                if (num > 3) {
                    answer.append(" and ");
                } else {
                    answer.append(", ");
                }
            }
            answer.append(minutes).append(" minutes").append(minutes > 1 ? "s" : "");
            num++;
        }
        if (number > 0 && (num == 0 || num > 3)) {
            if (answer.length() > 0) {
                if (num > 4) {
                    answer.append(" and ");} else {
                    answer.append(", ");
                }
            }
            answer.append(number).append(" second").append(number > 1 ? "s" : "");
        }

        System.out.println(answer);
    }
}
