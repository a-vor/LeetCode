package easy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] str = input();
        output(longestPrefix(str));
    }

    private static void output(String s) {
        System.out.println(s);
    }

    private static String longestPrefix(String[] str) {
        String prefix = "";
        for (int i = 0; i < str[0].length(); i++) {
                for (int j = 1; j < str.length; j++) {
                    try {
                        if (str[0].charAt(i) != str[j].charAt(i))
                            return prefix;
                    } catch (Exception e) {
                        return prefix;
                    }
                }
                prefix += str[0].charAt(i);
        }
        return prefix;
    }

    private static String[] input() {
        List<String> strings = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        do {
            String input = scanner.nextLine();
            if (input.isEmpty())
                break;
            else
                strings.add((input));
        } while (true);
        return strings.toArray(new String[0]);
    }
}
