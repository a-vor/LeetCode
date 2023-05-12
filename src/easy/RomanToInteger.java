package easy;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*
Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.

Symbol       Value
I             1
V             5
X             10
L             50
C             100
D             500
M             1000
For example, 2 is written as II in Roman numeral, just two ones added together. 12 is written as XII, which is simply X + II. The number 27 is written as XXVII, which is XX + V + II.

Roman numerals are usually written largest to smallest from left to right. However, the numeral for four is not IIII. Instead, the number four is written as IV. Because the one is before the five we subtract it making four. The same principle applies to the number nine, which is written as IX. There are six instances where subtraction is used:

I can be placed before V (5) and X (10) to make 4 and 9.
X can be placed before L (50) and C (100) to make 40 and 90.
C can be placed before D (500) and M (1000) to make 400 and 900.
Given a roman numeral, convert it to an integer.
*/

public class RomanToInteger {

    public static void main(String[] args) {
        output(calculate(input()));
    }

    private static void output(int calculate) {
        System.out.println(calculate)   ;
    }

    private static int calculate(String data) {
        int sum = 0;
        Map<Character, Integer> map = new HashMap<>();
        int[] numbers = new int[data.length()];
        addStaticMap(map);
        addArrayOfNumbers(map, numbers, data);
        for (int i = 0; i < numbers.length; i++) {
            if (i != numbers.length - 1) {
                if (numbers[i] < numbers[i+1])
                    sum -= numbers[i];
                else
                    sum+= numbers[i];
            } else {
                sum += numbers[i];
            }
        }
        return sum;
    }

    private static void addArrayOfNumbers(Map<Character, Integer> map, int[] array, String data) {
        for (int i = 0; i < data.length(); i++) {
            array[i] = map.get(data.charAt(i));
        }
    }

    private static void addStaticMap(Map<Character, Integer> map) {
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
    }

    private static String input() {
        System.out.println("Enter the roman numbers:");
        return new Scanner(System.in).nextLine();
    }
}
