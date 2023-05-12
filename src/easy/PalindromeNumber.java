package easy;

import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        int number = input();
        output(isEqual(reverseNumber(number), number));
    }

    private static void output(boolean equal) {
        System.out.println(equal);
    }

    private static boolean isEqual(int i, int number) {
        return i == number;
    }

    private static int reverseNumber(int number) {
        int reversedNumber = 0;
        for (; number > 0; number /= 10) {
            reversedNumber = reversedNumber * 10 + number % 10;
        }
        return reversedNumber;
    }

    private static int input() {
        return new Scanner(System.in).nextInt();
    }
}
